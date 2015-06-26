package org.jasoet.scholarship

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
 * Created by Deny Prasetyo
 * 25 June 2015
 * Principal Software Development Engineer
 * GDP Labs
 * deny.prasetyo@gdplabs.id
 */

@SpringBootApplication
class SpringMainApplication {
}

object SpringMainApplication extends App {
  SpringApplication.run(classOf[SpringMainApplication], args: _*)
}
