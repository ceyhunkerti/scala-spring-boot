package org.jasoet.scholarship.db.entity

import java.time.{LocalDate, Year}
import javax.persistence.{Column, Entity, GeneratedValue, Id}

import scala.beans.BeanProperty

/**
 * Created by Deny Prasetyo
 * 25 June 2015
 * Principal Software Development Engineer
 * GDP Labs
 * deny.prasetyo@gdplabs.id
 */

@Entity
class AcademicYear extends Serializable {

  @Id
  @GeneratedValue
  var id: Int = _
  @BeanProperty
  @Column(nullable = false)
  var startYear: Year = _
  @BeanProperty
  @Column(nullable = false)
  var endYear: Year = _
  @BeanProperty
  @Column(nullable = false)
  var remark: String = _
  @BeanProperty
  @Column(nullable = false)
  var paymentPeriod: Boolean = _
  @BeanProperty
  @Column(nullable = false)
  var registrationStart: LocalDate = _
  @BeanProperty
  @Column(nullable = false)
  var registrationEnd: LocalDate = _
  @BeanProperty
  @Column(nullable = false)
  var monitoringStart: LocalDate = _
  @BeanProperty
  @Column(nullable = false)
  var monitoringEnd: LocalDate = _
  @BeanProperty
  @Column(nullable = false)
  var active: Boolean = _


}

object AcademicYear {
  def apply(start: Year,
            end: Year,
            remark: String,
            paymentPeriod: Boolean,
            registrationStart: LocalDate,
            registrationEnd: LocalDate,
            monitoringStart: LocalDate,
            monitoringEnd: LocalDate,
            active: Boolean): AcademicYear = {
    val o = new AcademicYear()
    o.startYear = start
    o.endYear = end
    o.remark = remark
    o.paymentPeriod = paymentPeriod
    o.registrationStart = registrationStart
    o.registrationEnd = registrationEnd
    o.monitoringStart = monitoringStart
    o.monitoringEnd = monitoringEnd
    o.active = active
    o

  }

  def unapply(o: AcademicYear): Option[(Int, Year, Year, String, Boolean, LocalDate, LocalDate, LocalDate, LocalDate, Boolean)] = {
    Some(o.id, o.startYear, o.endYear, o.remark, o.paymentPeriod, o.registrationStart, o.registrationEnd, o.monitoringStart, o.monitoringEnd, o.active)
  }

}