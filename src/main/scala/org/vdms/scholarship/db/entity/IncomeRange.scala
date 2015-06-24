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
class IncomeRange(i: String, d: String, st: Int, t: Int) {

  @Id
  @BeanProperty
  var id: String = i
  @BeanProperty
  @Column(nullable = false)
  var description: String = d
  @BeanProperty
  @Column(nullable = false)
  var start: Int = st
  @BeanProperty
  @Column(nullable = false)
  var end: Int = t


}
