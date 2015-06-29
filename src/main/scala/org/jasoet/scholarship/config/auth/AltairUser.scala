package org.jasoet.scholarship.config.auth

/**
 * Created by Deny Prasetyo
 * 29 June 2015
 * Principal Software Development Engineer
 * GDP Labs
 * deny.prasetyo@gdplabs.id
 */

trait AltairUser {
  def username: String

  def password: String

  def enabled: Boolean = true

  def name: String

  def email: String

  def accountNonExpired: Boolean = true

  def credentialNonExpired: Boolean = true

  def accountNonLocked: Boolean = true

  def toString: String
}
