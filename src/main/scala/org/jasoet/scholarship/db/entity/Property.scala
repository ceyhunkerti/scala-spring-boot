package org.jasoet.scholarship.db.entity

import javax.persistence.{Column, Entity, Id}

import org.jasoet.scholarship.db.value.PropertyType
import org.jasoet.scholarship.db.value.PropertyType.PropertyType

import scala.beans.BeanProperty
import scala.util.{Failure, Success, Try}

/**
 * Created by Deny Prasetyo
 * 27 June 2015
 * Principal Software Development Engineer
 * GDP Labs
 * deny.prasetyo@gdplabs.id
 */

@Entity
class Property {

  @Id
  @BeanProperty
  @Column(nullable = false, length = 500)
  var id: String = _

  @BeanProperty
  @Column(nullable = false, length = 3500)
  var value: String = _

  @BeanProperty
  @Column(nullable = false, name = "type")
  var typez: PropertyType = _

  def fetchValue[T]: Try[T] = Try {
    import org.json4s._
    import org.json4s.jackson.JsonMethods._
    typez match {
      case PropertyType.JSON => parse(value).asInstanceOf[T]
      case PropertyType.ARRAY => value.split(",").asInstanceOf[T]
      case PropertyType.DOUBLE => value.toDouble.asInstanceOf[T]
      case PropertyType.INTEGER => value.toInt.asInstanceOf[T]
      case PropertyType.STRING => value.asInstanceOf[T]
      case _ => value.asInstanceOf[T]
    }
  }

  override def toString = s"Property($id, $value, $typez)"
}

object Property {
  private def insertValue[T](p: Property, o: T): Try[PropertyType] = Try {
    import org.json4s._
    import org.json4s.jackson.JsonMethods._
    o match {
      case obj if obj.isInstanceOf[Int] =>
        p.value = o.toString
        PropertyType.INTEGER
      case obj if obj.isInstanceOf[Double] =>
        p.value = o.toString
        PropertyType.INTEGER
      case obj if obj.isInstanceOf[String] =>
        p.value = o.toString
        PropertyType.STRING
      case obj if obj.isInstanceOf[Array[String]] =>
        p.value = o.asInstanceOf[Array[String]].toList.mkString(",")
        PropertyType.ARRAY
      case obj if obj.isInstanceOf[JValue] =>
        p.value = compact(render(o.asInstanceOf[JValue]))
        PropertyType.JSON
      case _ => throw new IllegalArgumentException("Type Not Allowed. Only String, Int, Double, Array[String], and org.json4s.JValue allowed")
    }
  }

  @throws[IllegalArgumentException]
  def apply[T](id: String, value: T): Property = {
    val o = new Property()
    o.id = id
    insertValue(o, value) match {
      case Success(t) => o.typez = t
      case Failure(x) => throw x
    }
    o
  }

  def unapply(o: Property): Option[(String, String, PropertyType)] = {
    Some(o.id, o.value, o.typez)
  }
}