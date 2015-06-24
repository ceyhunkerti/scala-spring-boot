package org.vdms.scholarship.db.value


/**
 * Created by Deny Prasetyo
 * 25 June 2015
 * Principal Software Development Engineer
 * GDP Labs
 * deny.prasetyo@gdplabs.id
 */

object StudentStatus extends Enumeration {
  type StudentStatus = Value
  val ACTIVE, INACTIVE, SUSPENDED, GRADUATED, NOT_APPLICABLE = Value
}
