package org.vdms.scholarship.db.entity

import java.time.LocalDate
import javax.persistence.{Column, Entity}

import org.springframework.data.jpa.domain.AbstractPersistable

import scala.beans.BeanProperty

/**
 * Created by Deny Prasetyo
 * 25 June 2015
 * Principal Software Development Engineer
 * GDP Labs
 * deny.prasetyo@gdplabs.id
 */

@Entity
class AcademicYear extends AbstractPersistable[Integer] {

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
