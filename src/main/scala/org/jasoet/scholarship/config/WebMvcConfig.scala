package org.jasoet.scholarship.config

/**
 * Created by Deny Prasetyo
 * 25 June 2015
 * Principal Software Development Engineer
 * GDP Labs
 * deny.prasetyo@gdplabs.id
 */

import javax.validation.Validator

import org.springframework.context.annotation.{Bean, Configuration}
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean
import org.springframework.web.servlet.config.annotation.{ViewControllerRegistry, WebMvcConfigurerAdapter}

@Configuration
class WebMvcConfig extends WebMvcConfigurerAdapter {

  @Bean
  def validator: Validator = {
    new LocalValidatorFactoryBean()
  }

  override def addViewControllers(registry: ViewControllerRegistry) {
    registry.addViewController("/login").setViewName("login")
    registry.addViewController("/success").setViewName("success")
    registry.addViewController("/").setViewName("home")
  }
}

