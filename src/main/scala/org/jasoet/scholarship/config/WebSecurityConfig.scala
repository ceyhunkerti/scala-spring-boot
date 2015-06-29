package org.jasoet.scholarship.config

/**
 * Created by Deny Prasetyo
 * 25 June 2015
 * Principal Software Development Engineer
 * GDP Labs
 * deny.prasetyo@gdplabs.id
 */

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity

@Configuration
@EnableWebMvcSecurity
@EnableConfigurationProperties
class WebSecurityConfig extends WebSecurityConfigurerAdapter {

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

  @Autowired
  @throws(classOf[Exception])
  def configureGlobal(auth: AuthenticationManagerBuilder) {
    auth.inMemoryAuthentication.withUser("user").password("password").roles("USER")
  }
}

