package org.vdms.scholarship.db.converter

import java.time.Year
import javax.persistence.{AttributeConverter, Converter}

/**
 * Created by Deny Prasetyo
 * 24 June 2015
 * Principal Software Development Engineer
 * GDP Labs
 * deny.prasetyo@gdplabs.id
 */
@Converter(autoApply = true)
class YearConverter extends AttributeConverter[Year, Integer] {
  override def convertToDatabaseColumn(attribute: Year): Integer = new Integer(attribute.getValue)

  override def convertToEntityAttribute(dbData: Integer): Year = Year.of(dbData.intValue())
}
