package org.jasoet.scholarship.db.repository

import java.lang
import java.util.{List => JList}

import org.jasoet.scholarship.db.entity.{Institution, Student}
import org.springframework.cache.annotation.{CacheEvict, Cacheable}
import org.springframework.data.domain.{Page, Pageable, Sort}
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
  @Cacheable(Array("students"))
  def findByInstitution(@Param("institution") institution: Institution): JList[Student]

  @Cacheable(Array("students"))
  override def findAll(sort: Sort): lang.Iterable[Student]

  @Cacheable(Array("students"))
  override def findAll(pageable: Pageable): Page[Student]

  @Cacheable(Array("students"))
  override def count(): Long

  @Cacheable(Array("students"))
  override def exists(id: String): Boolean


  @Cacheable(Array("students"))
  override def findOne(id: String): Student

  @Cacheable(Array("students"))
  override def findAll(): lang.Iterable[Student]

  @Cacheable(Array("students"))
  override def findAll(ids: lang.Iterable[String]): lang.Iterable[Student]

  @CacheEvict(Array("students"))
  override def deleteAll(): Unit

  @CacheEvict(Array("students"))
  override def delete(id: String): Unit

  @CacheEvict(Array("students"))
  override def delete(entity: Student): Unit

  @CacheEvict(Array("students"))
  override def delete(entities: lang.Iterable[_ <: Student]): Unit

  @CacheEvict(Array("students"))
  override def save[S <: Student](entity: S): S

  @CacheEvict(Array("students"))
  override def save[S <: Student](entities: lang.Iterable[S]): lang.Iterable[S]

}
