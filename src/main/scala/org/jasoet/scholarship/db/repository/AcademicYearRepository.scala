package org.jasoet.scholarship.db.repository

import java.lang

import org.jasoet.scholarship.db.entity.AcademicYear
import org.springframework.cache.annotation.{CacheEvict, Cacheable}
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

@RepositoryRestResource(collectionResourceRel = "academic-years", path = "academic-years")
trait AcademicYearRepository extends PagingAndSortingRepository[AcademicYear, Integer] {

  @Cacheable(Array("academic-years"))
  override def findAll(sort: Sort): lang.Iterable[AcademicYear]

  @Cacheable(Array("academic-years"))
  override def findAll(pageable: Pageable): Page[AcademicYear]

  @Cacheable(Array("academic-years"))
  override def count(): Long

  @Cacheable(Array("academic-years"))
  override def exists(id: Integer): Boolean

  @Cacheable(Array("academic-years"))
  override def findOne(id: Integer): AcademicYear

  @Cacheable(Array("academic-years"))
  override def findAll(): lang.Iterable[AcademicYear]

  @Cacheable(Array("academic-years"))
  override def findAll(ids: lang.Iterable[Integer]): lang.Iterable[AcademicYear]


  @CacheEvict(Array("academic-years"))
  override def delete(id: Integer): Unit

  @CacheEvict(Array("academic-years"))
  override def delete(entity: AcademicYear): Unit

  @CacheEvict(Array("academic-years"))
  override def delete(entities: lang.Iterable[_ <: AcademicYear]): Unit

  @CacheEvict(Array("academic-years"))
  override def save[S <: AcademicYear](entity: S): S

  @CacheEvict(Array("academic-years"))
  override def save[S <: AcademicYear](entities: lang.Iterable[S]): lang.Iterable[S]

  @CacheEvict(Array("academic-years"))
  override def deleteAll(): Unit
}
