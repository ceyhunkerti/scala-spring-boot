package org.jasoet.scholarship.db.repository

import org.jasoet.scholarship.db.entity.Occupation
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

/**
 * Created by Deny Prasetyo
 * 25 June 2015
 * Principal Software Development Engineer
 * GDP Labs
 * deny.prasetyo@gdplabs.id
 */

@RepositoryRestResource(collectionResourceRel = "occupations", path = "occupations")
trait OccupationRepository extends PagingAndSortingRepository[Occupation, String] {

}
