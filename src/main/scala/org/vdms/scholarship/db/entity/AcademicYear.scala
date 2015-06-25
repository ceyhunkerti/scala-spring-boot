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
class AcademicYear(startPar: Int,
                   endPar: Int,
                   remarkPar: String,
                   paymentPeriodPar: Boolean,
                   registrationStartPar: LocalDate,
                   registrationEndPar: LocalDate,
                   monitoringStartPar: LocalDate,
                   monitoringEndPar: LocalDate,
                   activePar: Boolean) {

  @Id
  @GeneratedValue
  var id: Int = _
  @BeanProperty
  @Column(nullable = false)
  var start: Int = startPar
  @BeanProperty
  @Column(nullable = false)
  var end: Int = endPar
  @BeanProperty
  @Column(nullable = false)
  var remark: String = remarkPar
  @BeanProperty
  @Column(nullable = false)
  var paymentPeriod: Boolean = paymentPeriodPar
  @BeanProperty
  @Column(nullable = false)
  var registrationStart: LocalDate = registrationStartPar
  @BeanProperty
  @Column(nullable = false)
  var registrationEnd: LocalDate = registrationEndPar
  @BeanProperty
  @Column(nullable = false)
  var monitoringStart: LocalDate = monitoringStartPar
  @BeanProperty
  @Column(nullable = false)
  var monitoringEnd: LocalDate = monitoringEndPar
  @BeanProperty
  @Column(nullable = false)
  var active: Boolean = activePar


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
    new AcademicYear(startPar,
      endPar,
      remarkPar,
      paymentPeriodPar,
      registrationStartPar,
      registrationEndPar,
      monitoringStartPar,
      monitoringEndPar,
      activePar)
  }

  def unapply(o: AcademicYear): Option[(Int, Int, Int, String, Boolean, LocalDate, LocalDate, LocalDate, LocalDate, Boolean)] = {
    Some(o.id, o.start, o.end, o.remark, o.paymentPeriod, o.registrationStart, o.registrationEnd, o.monitoringStart, o.monitoringEnd, o.active)
  }

}