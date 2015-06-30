package org.jasoet.scholarship.service

import org.jasoet.scholarship.config.auth.properties.SecurityUtilProperties
import org.jasoet.scholarship.config.auth.{AltairUser, AltairUserDetails}
import org.jasoet.scholarship.db.entity.Admin
import org.jasoet.scholarship.db.repository.AdminRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service

import scala.collection.JavaConversions._

/**
 * Created by Deny Prasetyo
 * 30 June 2015
 * Principal Software Development Engineer
 * GDP Labs
 * deny.prasetyo@gdplabs.id
 */


@Service
class SecurityAuthService @Autowired()(adminRepository: AdminRepository, securityUtilProperties: SecurityUtilProperties) {
  @throws[UsernameNotFoundException]
  def fetchUser(usernameOrEmail: String): AltairUserDetails[AltairUser] = {
    val listPrefixes = securityUtilProperties.getRolePrefix.toList
    val splitUsername = usernameOrEmail.split("-").toList

    splitUsername match {
      case prefix :: username :: Nil =>
        listPrefixes.find(_._2.equalsIgnoreCase(prefix)) match {
          case Some((k, v)) => prefixRoleHandler(k, username)
          case None => defaultHandler(username)
        }
      case prefix :: Nil =>
        defaultHandler(usernameOrEmail)
      case Nil => throw new UsernameNotFoundException(s"Username/Email $usernameOrEmail not Found!")
    }
  }

  private def prefixRoleHandler(role: String, username: String): AltairUserDetails[AltairUser] = {
    role.toUpperCase match {
      case "SUPER_ADMIN" => defaultHandler(username)
      case _ => defaultHandler(username)
    }
  }

  private def defaultHandler(username: String): AltairUserDetails[AltairUser] = {
    Option(adminRepository.findOne(username)) match {
      case Some(a@Admin(email, name, roles, enabled)) => AltairUserDetails(a, roles)
      case None => throw new UsernameNotFoundException(s"Username/Email $username not Found!")
    }
  }
}
