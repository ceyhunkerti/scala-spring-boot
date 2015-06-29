package org.jasoet.scholarship.config.properties

import java.util.{HashMap => JHashMap, Map => JMap}

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

import scala.beans.BeanProperty
import scala.collection.JavaConversions._

/**
 * Created by Deny Prasetyo
 * 29 June 2015
 * Principal Software Development Engineer
 * GDP Labs
 * deny.prasetyo@gdplabs.id
 */

@Component
@ConfigurationProperties(prefix = "security-util")
class SecurityUtilProperties {

  @BeanProperty
  var rolePrefix: JMap[String, String] = new JHashMap[String, String]

  override def toString = s"SecurityUtilProperties(${rolePrefix.mkString(",")})"
}
