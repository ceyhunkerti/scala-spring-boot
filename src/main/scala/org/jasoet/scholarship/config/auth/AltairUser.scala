package org.jasoet.scholarship.config.auth

/**
 * Created by Deny Prasetyo
 * 29 June 2015
 * Principal Software Development Engineer
 * GDP Labs
 * deny.prasetyo@gdplabs.id
 */

trait AltairUser extends Serializable {
  def getUsername: String

  def getPassword: String

  def isEnabled: Boolean = true

  def getName: String = ""

  def getEmail: String

  def getAccountNonExpired: Boolean = true

  def getCredentialNonExpired: Boolean = true

  def getAccountNonLocked: Boolean = true

  def toString: String
}
