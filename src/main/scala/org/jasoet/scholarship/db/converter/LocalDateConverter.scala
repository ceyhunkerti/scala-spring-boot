package org.jasoet.scholarship.db.converter

import java.time.LocalDate
import java.util.Date
import javax.persistence.{AttributeConverter, Converter}

import org.jasoet.scholarship.util.date.DateTimeUtil._

/**
 * Created by Deny Prasetyo
 * 24 June 2015
 * Principal Software Development Engineer
 * GDP Labs
 * deny.prasetyo@gdplabs.id
 */

@Converter(autoApply = true)
class LocalDateConverter extends AttributeConverter[LocalDate, Date] {
  override def convertToDatabaseColumn(attribute: LocalDate): Date = attribute.toDate

  override def convertToEntityAttribute(dbData: Date): LocalDate = dbData.toLocalDate
}
