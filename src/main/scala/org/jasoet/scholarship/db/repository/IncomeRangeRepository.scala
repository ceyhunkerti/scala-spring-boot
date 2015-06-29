package org.jasoet.scholarship.db.repository

import java.lang

import org.jasoet.scholarship.db.entity.IncomeRange
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

@RepositoryRestResource(collectionResourceRel = "income-ranges", path = "income-ranges")
trait IncomeRangeRepository extends PagingAndSortingRepository[IncomeRange, String] {

  @Cacheable(Array("income-ranges"))
  override def findAll(sort: Sort): lang.Iterable[IncomeRange]

  @Cacheable(Array("income-ranges"))
  override def findAll(pageable: Pageable): Page[IncomeRange]

  @Cacheable(Array("income-ranges"))
  override def count(): Long

  @Cacheable(Array("income-ranges"))
  override def exists(id: String): Boolean

  @Cacheable(Array("income-ranges"))
  override def findOne(id: String): IncomeRange

  @Cacheable(Array("income-ranges"))
  override def findAll(): lang.Iterable[IncomeRange]

  @Cacheable(Array("income-ranges"))
  override def findAll(ids: lang.Iterable[String]): lang.Iterable[IncomeRange]

  @CacheEvict(Array("income-ranges"))
  override def deleteAll(): Unit

  @CacheEvict(Array("income-ranges"))
  override def delete(id: String): Unit

  @CacheEvict(Array("income-ranges"))
  override def delete(entity: IncomeRange): Unit

  @CacheEvict(Array("income-ranges"))
  override def delete(entities: lang.Iterable[_ <: IncomeRange]): Unit

  @CacheEvict(Array("income-ranges"))
  override def save[S <: IncomeRange](entity: S): S

  @CacheEvict(Array("income-ranges"))
  override def save[S <: IncomeRange](entities: lang.Iterable[S]): lang.Iterable[S]

}
