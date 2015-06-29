package org.jasoet.scholarship.db.entity

import javax.persistence.{Column, Entity, Id}
import javax.validation.constraints.NotNull

import org.hibernate.validator.constraints.Email
import org.jasoet.scholarship.config.auth.AltairUser
import org.jasoet.scholarship.config.auth.util.AltairPasswordEncoder

import scala.beans.BeanProperty

/**
 * Created by Deny Prasetyo
 * 30 June 2015
 * Principal Software Development Engineer
 * GDP Labs
 * deny.prasetyo@gdplabs.id
 */

@Entity
class Admin extends AltairUser {

  @Id
  @Column(nullable = false)
  @Email
  @NotNull
  var email: String = _

  @Column(nullable = false)
  @NotNull
  var password: String = _

  @Column(nullable = false)
  @NotNull
  @BeanProperty
  var roles: String = _

  @Column(nullable = false)
  var enabled: Boolean = true

  @Column(nullable = false)
  @NotNull
  var name: String = _

  override def getUsername: String = email

  override def getPassword: String = password

  override def getEmail: String = email

  override def isEnabled: Boolean = enabled
}

object Admin {
  def apply(email: String, name: String, plainPassword: String, roles: Seq[String], enabled: Boolean = true): Admin = {
    val o = new Admin()
    o.email = email
    o.name = name
    o.password = AltairPasswordEncoder.encode(plainPassword)
    o.roles = roles.mkString(",")
    o.enabled = enabled
    o
  }

  def unapply(o: Admin): Option[(String, String, Seq[String], Boolean)] = {
    Some(o.email, o.name, o.roles.split(",").toSeq, o.enabled)
  }
}
