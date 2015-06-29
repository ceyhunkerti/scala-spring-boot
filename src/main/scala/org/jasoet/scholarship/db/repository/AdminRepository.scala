package org.jasoet.scholarship.db.repository

import org.jasoet.scholarship.db.entity.Admin
import org.springframework.data.repository.PagingAndSortingRepository

/**
 * Created by Deny Prasetyo
 * 30 June 2015
 * Principal Software Development Engineer
 * GDP Labs
 * deny.prasetyo@gdplabs.id
 */


trait AdminRepository extends PagingAndSortingRepository[Admin,String]{

}
