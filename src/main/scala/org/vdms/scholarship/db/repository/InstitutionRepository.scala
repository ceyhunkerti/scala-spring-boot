package org.vdms.scholarship.db.repository

import org.springframework.data.repository.PagingAndSortingRepository
import org.vdms.scholarship.db.entity.Institution

/**
 * Created by Deny Prasetyo
 * 25 June 2015
 * Principal Software Development Engineer
 * GDP Labs
 * deny.prasetyo@gdplabs.id
 */


trait InstitutionRepository extends PagingAndSortingRepository[Institution, String] {

}
