package org.jasoet.scholarship.service

import org.jasoet.scholarship.config.auth.{AltairUser, AltairUserDetails}
import org.jasoet.scholarship.db.entity.Admin
import org.jasoet.scholarship.db.repository.AdminRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service

/**
 * Created by Deny Prasetyo
 * 30 June 2015
 * Principal Software Development Engineer
 * GDP Labs
 * deny.prasetyo@gdplabs.id
 */


@Service
class SecurityAuthService @Autowired()(adminRepository: AdminRepository) {
  @throws[UsernameNotFoundException]
  def fetchUser(usernameOrEmail: String): AltairUserDetails[AltairUser] = {
    Option(adminRepository.findOne(usernameOrEmail)) match {
      case Some(a@Admin(email, name, roles, enabled)) => AltairUserDetails(a, roles)
      case None => throw new UsernameNotFoundException(s"Username/Email $usernameOrEmail not Found!")
    }
  }
}
