package org.jasoet.scholarship.db.repository

import java.util.{List => JList}

import org.jasoet.scholarship.db.entity.{Institution, Student}
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.{RepositoryRestResource, RestResource}

/**
 * Created by Deny Prasetyo
 * 25 June 2015
 * Principal Software Development Engineer
 * GDP Labs
 * deny.prasetyo@gdplabs.id
 */

@RepositoryRestResource(collectionResourceRel = "students", path = "students")
trait StudentRepository extends PagingAndSortingRepository[Student, String] {

  @RestResource(path = "institution", rel = "institution")
  @Query("SELECT s FROM Student s WHERE s.institution=:institution")
  def findByInstitution(@Param("institution") institution: Institution): JList[Student]

}
