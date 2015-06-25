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
class IncomeRange {

  @Id
  @BeanProperty
  var id: String = _
  @BeanProperty
  @Column(nullable = false)
  var description: String = _
  @BeanProperty
  @Column(nullable = false)
  var start: Int = _
  @BeanProperty
  @Column(nullable = false)
  var end: Int = _


}


object IncomeRange {
  def apply(i: String, d: String, st: Int = 0, t: Int = Int.MaxValue): IncomeRange = {
    val o = new IncomeRange()
    o.id = i
    o.description = d
    o.start = st
    o.end = t
    o
  }

  def unapply(o: IncomeRange): Option[(String, String, Int, Int)] = {
    Some(o.id, o.description, o.start, o.end)
  }
}