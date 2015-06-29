package org.jasoet.scholarship.config.auth.util

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

/**
 * Created by Deny Prasetyo
 * 29 June 2015
 * Principal Software Development Engineer
 * GDP Labs
 * deny.prasetyo@gdplabs.id
 */


object AltairPasswordEncoder {
  val encoder = new BCryptPasswordEncoder()

  def apply() = {
    encoder
  }

  def encode(rawPassword: String): String = {
    encoder.encode(rawPassword)
  }

  def matches(rawPassword: String, encodedPassword: String): Boolean = {
    encoder.matches(rawPassword, encodedPassword)
  }

}
