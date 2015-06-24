package org.vdms.scholarship.db.repository

import org.springframework.data.repository.PagingAndSortingRepository
import org.vdms.scholarship.db.entity.Discipline

/**
 * Created by Deny Prasetyo
 * 25 June 2015
 * Principal Software Development Engineer
 * GDP Labs
 * deny.prasetyo@gdplabs.id
 */


trait DisciplineRepository extends PagingAndSortingRepository[Discipline, String] {

}
