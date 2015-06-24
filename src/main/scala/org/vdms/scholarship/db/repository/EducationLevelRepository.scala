package org.vdms.scholarship.db.repository

import org.springframework.data.repository.PagingAndSortingRepository
import org.vdms.scholarship.db.entity.EducationLevel

/**
 * Created by Deny Prasetyo
 * 25 June 2015
 * Principal Software Development Engineer
 * GDP Labs
 * deny.prasetyo@gdplabs.id
 */


trait EducationLevelRepository extends PagingAndSortingRepository[EducationLevel, String] {

}
