package org.jasoet.scholarship.config

/**
 * Created by Deny Prasetyo
 * 25 June 2015
 * Principal Software Development Engineer
 * GDP Labs
 * deny.prasetyo@gdplabs.id
 */

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.{ViewControllerRegistry, WebMvcConfigurerAdapter}

@Configuration
class WebMvcConfig extends WebMvcConfigurerAdapter {
  override def addViewControllers(registry: ViewControllerRegistry) {
    registry.addViewController("/login").setViewName("login")
    registry.addViewController("/success").setViewName("success")
    registry.addViewController("/").setViewName("home")
  }
}

