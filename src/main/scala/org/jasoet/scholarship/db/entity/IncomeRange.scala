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
class IncomeRange extends Serializable {

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
  var util: Int = _


}


object IncomeRange {
  def apply(id: String, description: String, start: Int = 0, util: Int = Int.MaxValue): IncomeRange = {
    val o = new IncomeRange()
    o.id = id
    o.description = description
    o.start = start
    o.util = util
    o
  }

  def unapply(o: IncomeRange): Option[(String, String, Int, Int)] = {
    Some(o.id, o.description, o.start, o.util)
  }
}