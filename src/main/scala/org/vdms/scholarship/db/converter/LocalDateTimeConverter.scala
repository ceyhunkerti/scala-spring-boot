package org.vdms.scholarship.db.converter

import java.time.LocalDateTime
import java.util.Date
import javax.persistence.{AttributeConverter, Converter}

import org.vdms.scholarship.util.date.DateTimeUtil._

/**
 * Created by Deny Prasetyo
 * 24 June 2015
 * Principal Software Development Engineer
 * GDP Labs
 * deny.prasetyo@gdplabs.id
 */
@Converter(autoApply = true)
class LocalDateTimeConverter extends AttributeConverter[LocalDateTime, Date] {
  override def convertToDatabaseColumn(attribute: LocalDateTime): Date = attribute.toDate

  override def convertToEntityAttribute(dbData: Date): LocalDateTime = dbData.toLocalDateTime
}
