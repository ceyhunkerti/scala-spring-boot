package org.jasoet.scholarship.config

/**
 * Created by Deny Prasetyo
 * 25 June 2015
 * Principal Software Development Engineer
 * GDP Labs
 * deny.prasetyo@gdplabs.id
 */

import org.jasoet.scholarship.config.auth.{AltairSecuritySupport, AltairUserDetails}
import org.jasoet.scholarship.service.SecurityAuthService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession

@Configuration
@EnableWebMvcSecurity
@EnableConfigurationProperties
@EnableRedisHttpSession
class WebSecurityConfig extends AltairSecuritySupport {

  @Autowired
  var securityAuthService: SecurityAuthService = _

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
    securityAuthService.fetchUser(uname)
  }
}

