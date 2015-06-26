package org.jasoet.scholarship.db.converter

import javax.persistence.{AttributeConverter, Converter}

import org.jasoet.scholarship.db.value.StudentStatus
import org.jasoet.scholarship.db.value.StudentStatus.StudentStatus


/**
 * Created by Deny Prasetyo
 * 24 June 2015
 * Principal Software Development Engineer
 * GDP Labs
 * deny.prasetyo@gdplabs.id
 */

@Converter(autoApply = true)
class StudentStatusConverter extends AttributeConverter[StudentStatus, String] {
  override def convertToDatabaseColumn(attribute: StudentStatus): String = attribute match {
    case StudentStatus.ACTIVE => "ACTIVE"
    case StudentStatus.INACTIVE => "INACTIVE"
    case StudentStatus.SUSPENDED => "SUSPENDED"
    case StudentStatus.GRADUATED => "GRADUATED"
    case _ => "NOT_APPLICABLE"
  }

  override def convertToEntityAttribute(dbData: String): StudentStatus = dbData.toUpperCase match {
    case "ACTIVE" => StudentStatus.ACTIVE
    case "INACTIVE" => StudentStatus.INACTIVE
    case "SUSPENDED" => StudentStatus.SUSPENDED
    case "GRADUATED" => StudentStatus.GRADUATED
    case _ => StudentStatus.NOT_APPLICABLE
  }
}
