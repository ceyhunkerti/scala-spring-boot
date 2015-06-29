package org.jasoet.scholarship.db.repository

import java.lang

import org.jasoet.scholarship.db.entity.WorkingStatus
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

@RepositoryRestResource(collectionResourceRel = "working-statuses", path = "working-statuses")
trait WorkingStatusRepository extends PagingAndSortingRepository[WorkingStatus, String] {
  @Cacheable(Array("working-statuses"))
  override def findAll(sort: Sort): lang.Iterable[WorkingStatus]

  @Cacheable(Array("working-statuses"))
  override def findAll(pageable: Pageable): Page[WorkingStatus]

  @Cacheable(Array("working-statuses"))
  override def count(): Long

  @Cacheable(Array("working-statuses"))
  override def exists(id: String): Boolean

  @Cacheable(Array("working-statuses"))
  override def findOne(id: String): WorkingStatus

  @Cacheable(Array("working-statuses"))
  override def findAll(): lang.Iterable[WorkingStatus]

  @Cacheable(Array("working-statuses"))
  override def findAll(ids: lang.Iterable[String]): lang.Iterable[WorkingStatus]

  @CacheEvict(Array("working-statuses"))
  override def deleteAll(): Unit

  @CacheEvict(Array("working-statuses"))
  override def delete(id: String): Unit

  @CacheEvict(Array("working-statuses"))
  override def delete(entity: WorkingStatus): Unit

  @CacheEvict(Array("working-statuses"))
  override def delete(entities: lang.Iterable[_ <: WorkingStatus]): Unit

  @CacheEvict(Array("working-statuses"))
  override def save[S <: WorkingStatus](entity: S): S

  @CacheEvict(Array("working-statuses"))
  override def save[S <: WorkingStatus](entities: lang.Iterable[S]): lang.Iterable[S]

}
