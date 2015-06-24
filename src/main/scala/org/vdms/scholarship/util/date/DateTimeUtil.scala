package org.vdms.scholarship.util.date


import java.time._
import java.util.Date

/**
 * Created by Deny Prasetyo
 * 24 June 2015
 * Principal Software Development Engineer
 * GDP Labs
 * deny.prasetyo@gdplabs.id
 */


object DateTimeUtil {

  implicit class DateImprovement(val o: Date) {
    def toLocalDate: LocalDate = {
      toLocalDateTime.toLocalDate
    }

    def toLocalTime: LocalTime = {
      toLocalDateTime.toLocalTime
    }

    def toLocalDateTime: LocalDateTime = {
      val instant: Instant = Instant.ofEpochMilli(o.getTime)
      LocalDateTime.ofInstant(instant, ZoneId.systemDefault)
    }
  }

  implicit class LocalDateTimeImprovement(val o: LocalDateTime) {
    def toMilliSeconds: Long = o.atZone(ZoneId.systemDefault).toInstant.toEpochMilli

    def toTimeStamp: java.sql.Timestamp = new java.sql.Timestamp(toMilliSeconds)

    def toDate: Date = new Date(toMilliSeconds)
  }

  implicit class LocalDateImprovement(val o: LocalDate) {
    def toMilliSeconds: Long = o.atStartOfDay().atZone(ZoneId.systemDefault).toInstant.toEpochMilli

    def toSqlDate: java.sql.Date = new java.sql.Date(o.atStartOfDay().atZone(ZoneId.systemDefault).toInstant.toEpochMilli)

    def toDate: Date = new Date(toMilliSeconds)
  }

  implicit class SqlDateToLocalDate(val o: java.sql.Date) {
    def toLocalDate: LocalDate = o.getTime.toLocalDate
  }

  implicit class MilliSecondsToDateTime(val o: Long) {
    def toLocalDateTime: LocalDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(o), ZoneId.systemDefault)

    def toLocalDate: LocalDate = LocalDateTime.ofInstant(Instant.ofEpochMilli(o), ZoneId.systemDefault).toLocalDate
  }

  implicit class OptionLocalDateTimeImprovement(val o: Option[LocalDateTime]) {
    def toOptionMilliSeconds: Option[Long] = o match {
      case Some(i) => Some(i.atZone(ZoneId.systemDefault).toInstant.toEpochMilli)
      case None => None
    }
  }

  implicit class OptionLocalDateImprovement(val o: Option[LocalDate]) {
    def toOptionMilliSeconds: Option[Long] = o match {
      case Some(i) => Some(i.atStartOfDay().atZone(ZoneId.systemDefault).toInstant.toEpochMilli)
      case None => None
    }

    def toOptionSqlDate: Option[java.sql.Date] = o match {
      case Some(i) => Some(new java.sql.Date(i.atStartOfDay().atZone(ZoneId.systemDefault).toInstant.toEpochMilli))
      case None => None
    }
  }

  implicit class OptionMilliSecondsToDateTime(val o: Option[Long]) {
    def toOptionLocalDateTime: Option[LocalDateTime] = o match {
      case Some(i) => Some(LocalDateTime.ofInstant(Instant.ofEpochMilli(i), ZoneId.systemDefault))
      case None => None
    }


    def toOptionLocalDate: Option[LocalDate] = o match {
      case Some(i) => Some(LocalDateTime.ofInstant(Instant.ofEpochMilli(i), ZoneId.systemDefault).toLocalDate)
      case None => None
    }
  }

  implicit class OptionSqlDateToLocalDate(val o: Option[java.sql.Date]) {
    def toOptionLocalDate: Option[LocalDate] = o match {
      case Some(i) => Some(i.getTime.toLocalDate)
      case None => None
    }

  }

}
