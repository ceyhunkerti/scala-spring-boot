package org.vdms.scholarship.db.entity

import java.time.LocalDate
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
class AcademicYear {

  @Id
  @GeneratedValue
  var id: Int = _
  @BeanProperty
  @Column(nullable = false)
  var start: Int = _
  @BeanProperty
  @Column(nullable = false)
  var end: Int = _
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
  def apply(startPar: Int,
            endPar: Int,
            remarkPar: String,
            paymentPeriodPar: Boolean,
            registrationStartPar: LocalDate,
            registrationEndPar: LocalDate,
            monitoringStartPar: LocalDate,
            monitoringEndPar: LocalDate,
            activePar: Boolean): AcademicYear = {
    val o = new AcademicYear()
    o.start = startPar
    o.end = endPar
    o.remark = remarkPar
    o.paymentPeriod = paymentPeriodPar
    o.registrationStart = registrationStartPar
    o.registrationEnd = registrationEndPar
    o.monitoringStart = monitoringStartPar
    o.monitoringEnd = monitoringEndPar
    o.active = activePar
    o

  }

  def unapply(o: AcademicYear): Option[(Int, Int, Int, String, Boolean, LocalDate, LocalDate, LocalDate, LocalDate, Boolean)] = {
    Some(o.id, o.start, o.end, o.remark, o.paymentPeriod, o.registrationStart, o.registrationEnd, o.monitoringStart, o.monitoringEnd, o.active)
  }

}