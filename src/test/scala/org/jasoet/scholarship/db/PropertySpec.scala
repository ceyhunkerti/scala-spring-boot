package org.jasoet.scholarship.db

import org.jasoet.scholarship.db.entity.Property
import org.json4s.JsonAST.{JField, JString, JObject}
import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Deny Prasetyo
 * 27 June 2015
 * Principal Software Development Engineer
 * GDP Labs
 * deny.prasetyo@gdplabs.id
 */


class PropertySpec extends FlatSpec with Matchers {

  "a property" should "can insert several Value Type" in {
    println(Property("key-1", "Woke"))
    println(Property("key-1", 1))
    println(Property("key-1", 5.6))
    println(Property("json-x",JObject(JField("Name",JString("Jasoet")))))
    Property("key-1", Array("Joss","Jee","JUSS")) match {
      case Property(id,v,typz)=> println()
    }
  }

}