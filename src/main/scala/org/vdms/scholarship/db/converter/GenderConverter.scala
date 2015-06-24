package org.vdms.scholarship.db.converter

import javax.persistence.{AttributeConverter, Converter}

import org.vdms.scholarship.util.value.Gender
import org.vdms.scholarship.util.value.Gender.Gender


/**
 * Created by Deny Prasetyo
 * 24 June 2015
 * Principal Software Development Engineer
 * GDP Labs
 * deny.prasetyo@gdplabs.id
 */
@Converter(autoApply = true)
class GenderConverter extends AttributeConverter[Gender, Integer] {

  override def convertToDatabaseColumn(attribute: Gender): Integer = attribute match {
    case Gender.NOT_KNOWN => new Integer(0)
    case Gender.MALE => new Integer(1)
    case Gender.FEMALE => new Integer(2)
    case _ => new Integer(9)
  }

  override def convertToEntityAttribute(dbData: Integer): Gender = dbData.intValue() match {
    case 0 => Gender.NOT_KNOWN
    case 1 => Gender.MALE
    case 2 => Gender.FEMALE
    case _ => Gender.NOT_APPLICABLE
  }
}
