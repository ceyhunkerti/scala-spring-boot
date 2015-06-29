package org.jasoet.scholarship.config.auth

import org.jasoet.scholarship.config.auth.util.AltairPasswordEncoder
import org.springframework.security.authentication.dao.DaoAuthenticationProvider
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.core.userdetails.{UserDetails, UserDetailsService}

/**
 * Created by Deny Prasetyo
 * 29 June 2015
 * Principal Software Development Engineer
 * GDP Labs
 * deny.prasetyo@gdplabs.id
 */


trait AltairSecuritySupport extends WebSecurityConfigurerAdapter {
  def userResolver(username: String): AltairUserDetails[_]

  protected override def configure(auth: AuthenticationManagerBuilder) {
    auth.authenticationProvider(daoAuthenticationProvider)
  }


  def daoAuthenticationProvider: DaoAuthenticationProvider = {
    val o: DaoAuthenticationProvider = new DaoAuthenticationProvider
    o.setUserDetailsService(new UserDetailsService {
      override def loadUserByUsername(s: String): UserDetails = {
        userResolver(s)
      }
    })
    o.setPasswordEncoder(AltairPasswordEncoder())
    o
  }

}
