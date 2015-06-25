package org.vdms.scholarship.db.entity

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
class Province(i: String, n: String) {

  @Id
  @BeanProperty
  var id: String = i
  @BeanProperty
  @Column(nullable = false)
  var name: String = n

  def this()={
    this(null,null)
  }
}


object Province {
  def apply(i: String, n: String=""): Province = {
    new Province(i, n)
  }

  def unapply(o: Province): Option[(String, String)] = {
    Some(o.id, o.name)
  }
}