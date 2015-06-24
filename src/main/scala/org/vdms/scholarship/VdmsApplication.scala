package org.vdms.scholarship

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.ApplicationContext

/**
 * Created by Deny Prasetyo
 * 25 June 2015
 * Principal Software Development Engineer
 * GDP Labs
 * deny.prasetyo@gdplabs.id
 */

@SpringBootApplication
class VdmsApplication {
}

object VdmsApplication extends App {
  val ctx: ApplicationContext = SpringApplication.run(classOf[VdmsApplication], args: _*)
  ctx.getBeanDefinitionNames.foreach(s => println(s))
}
