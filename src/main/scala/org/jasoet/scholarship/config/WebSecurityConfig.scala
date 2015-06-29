package org.jasoet.scholarship.config

/**
 * Created by Deny Prasetyo
 * 25 June 2015
 * Principal Software Development Engineer
 * GDP Labs
 * deny.prasetyo@gdplabs.id
 */

import org.jasoet.scholarship.config.auth.util.AltairPasswordEncoder
import org.jasoet.scholarship.config.auth.{AltairUserDetails, AltairSecuritySupport, AltairUser}
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity

@Configuration
@EnableWebMvcSecurity
@EnableConfigurationProperties
class WebSecurityConfig extends AltairSecuritySupport {

  @throws(classOf[Exception])
  protected override def configure(http: HttpSecurity) {
    http
      .formLogin()
      .loginPage("/login")
      .failureUrl("/login?error")
      .defaultSuccessUrl("/success")
      .and()
      .logout()
      .and()
      .exceptionHandling()
      .accessDeniedPage("/access?error")
      .and().authorizeRequests().antMatchers("/", "/login").permitAll()
      .anyRequest().authenticated()
  }


  override def userResolver(uname: String): AltairUserDetails[_] = {
    AltairUserDetails(
      new AltairUser {
        override def username: String = uname

        override def name: String = "User"

        override def password: String = AltairPasswordEncoder.encode("localhost")

        override def email: String = "user@gdplabs.id"
      }, Seq("SUPER_ADMIN"))
  }
}

