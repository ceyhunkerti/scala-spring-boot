package org.jasoet.scholarship.db.converter

import javax.persistence.{AttributeConverter, Converter}

import org.jasoet.scholarship.db.value.PropertyType
import org.jasoet.scholarship.db.value.PropertyType.PropertyType


/**
 * Created by Deny Prasetyo
 * 24 June 2015
 * Principal Software Development Engineer
 * GDP Labs
 * deny.prasetyo@gdplabs.id
 */
@Converter(autoApply = true)
class PropertyTypeConverter extends AttributeConverter[PropertyType, String] {
  override def convertToDatabaseColumn(attribute: PropertyType): String = attribute match {
    case PropertyType.JSON => "JSON"
    case PropertyType.ARRAY => "ARRAY"
    case PropertyType.DOUBLE => "DOUBLE"
    case PropertyType.INTEGER => "INTEGER"
    case _ => "STRING"
  }
  override def convertToEntityAttribute(dbData: String): PropertyType = dbData.toUpperCase match {
    case  "JSON" => PropertyType.JSON
    case  "ARRAY" => PropertyType.ARRAY
    case  "DOUBLE" => PropertyType.DOUBLE
    case  "INTEGER" => PropertyType.INTEGER
    case _ => PropertyType.STRING
  }
}
