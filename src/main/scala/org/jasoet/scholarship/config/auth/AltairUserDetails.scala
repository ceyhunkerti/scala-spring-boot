package org.jasoet.scholarship.config.auth

import java.util.{Collection => JCollection}

import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.userdetails.UserDetails

import scala.collection.JavaConversions._

/**
 * Created by Deny Prasetyo
 * 29 June 2015
 * Principal Software Development Engineer
 * GDP Labs
 * deny.prasetyo@gdplabs.id
 */


class AltairUserDetails[A <: AltairUser](user: A, authorities: Seq[String]) extends UserDetails {


  override def getAuthorities: JCollection[GrantedAuthority] = {
    asJavaCollection(authorities.map(s => {
      new AltairAuthority(s)
    }))
  }

  override def isEnabled: Boolean = user.isEnabled

  override def getPassword: String = user.getPassword

  override def isAccountNonExpired: Boolean = user.getAccountNonExpired

  override def isCredentialsNonExpired: Boolean = user.getCredentialNonExpired

  override def isAccountNonLocked: Boolean = user.getAccountNonLocked

  override def getUsername: String = user.getUsername

  def roles = authorities

  def email = user.getEmail

  def name = user.getName

  def authObject: A = user


  override def toString = s"AltairUserDetails($getAuthorities, $isEnabled, $getPassword, $isAccountNonExpired, $isCredentialsNonExpired, $isAccountNonLocked, $getUsername, $roles, $email, $name, $authObject)"
}

object AltairUserDetails {
  def apply[A <: AltairUser](user: A, authorities: Seq[String]) = {
    new AltairUserDetails[A](user, authorities)
  }
}

private class AltairAuthority(authority: String) extends GrantedAuthority {
  override def getAuthority: String = authority

  override def toString = s"Authority($getAuthority)"
}