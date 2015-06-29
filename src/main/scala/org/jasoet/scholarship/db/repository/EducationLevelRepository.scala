package org.jasoet.scholarship.db.repository

import java.lang

import org.jasoet.scholarship.db.entity.EducationLevel
import org.springframework.data.domain.{Page, Pageable, Sort}
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

/**
 * Created by Deny Prasetyo
 * 25 June 2015
 * Principal Software Development Engineer
 * GDP Labs
 * deny.prasetyo@gdplabs.id
 */

@RepositoryRestResource(collectionResourceRel = "education-levels", path = "education-levels")
trait EducationLevelRepository extends PagingAndSortingRepository[EducationLevel, String] {
  override def findAll(sort: Sort): lang.Iterable[EducationLevel]

  override def findAll(pageable: Pageable): Page[EducationLevel]

  override def count(): Long

  override def deleteAll(): Unit

  override def findOne(id: String): EducationLevel

  override def findAll(): lang.Iterable[EducationLevel]

  override def findAll(ids: lang.Iterable[String]): lang.Iterable[EducationLevel]

  override def delete(id: String): Unit

  override def delete(entity: EducationLevel): Unit

  override def delete(entities: lang.Iterable[_ <: EducationLevel]): Unit

  override def save[S <: EducationLevel](entity: S): S

  override def save[S <: EducationLevel](entities: lang.Iterable[S]): lang.Iterable[S]

  override def exists(id: String): Boolean
}
