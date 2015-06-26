package org.jasoet.scholarship.db.entity

import javax.persistence.{Column, Entity, Id}

import scala.beans.BeanProperty

/**
 * Created by Deny Prasetyo
 * 25 June 2015
 * Principal Software Development Engineer
 * GDP Labs
 * deny.prasetyo@gdplabs.id
 */

@Entity
class EducationLevel(i: String, n: String, ne: String) {

  @Id
  @BeanProperty
  var id: String = i
  @BeanProperty
  @Column(nullable = false)
  var name: String = n
  @BeanProperty
  @Column(nullable = false)
  var nameEng: String = ne

  def this() = {
    this(null, null, null)
  }
}


object EducationLevel {
  def apply(id: String, name: String, nameEng: String): EducationLevel = {
    new EducationLevel(id, name, nameEng)
  }

  def unapply(o: EducationLevel): Option[(String, String, String)] = {
    Some(o.id, o.name, o.nameEng)
  }
}