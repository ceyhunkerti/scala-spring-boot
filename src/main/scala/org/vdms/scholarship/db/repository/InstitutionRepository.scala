package org.vdms.scholarship.db.repository

import java.util.{List => JList}

import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.{RepositoryRestResource, RestResource}
import org.vdms.scholarship.db.entity.{Institution, Province}

/**
 * Created by Deny Prasetyo
 * 25 June 2015
 * Principal Software Development Engineer
 * GDP Labs
 * deny.prasetyo@gdplabs.id
 */

@RepositoryRestResource(collectionResourceRel = "institutions", path = "institutions")
trait InstitutionRepository extends PagingAndSortingRepository[Institution, String] {


  @RestResource(path = "province", rel = "province")
  @Query("SELECT o FROM Institution o WHERE o.province=:province")
  def findByProvince(@Param("province") province: Province): JList[Institution]
}
