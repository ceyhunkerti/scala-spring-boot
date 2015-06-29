package org.jasoet.scholarship.db.repository

import java.lang

import org.jasoet.scholarship.db.entity.Discipline
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

@RepositoryRestResource(collectionResourceRel = "disciplines", path = "disciplines")
trait DisciplineRepository extends PagingAndSortingRepository[Discipline, String] {
  @Cacheable(Array("disciplines"))
  override def findAll(sort: Sort): lang.Iterable[Discipline]

  @Cacheable(Array("disciplines"))
  override def findAll(pageable: Pageable): Page[Discipline]

  @Cacheable(Array("disciplines"))
  override def count(): Long

  @Cacheable(Array("disciplines"))
  override def exists(id: String): Boolean

  @Cacheable(Array("disciplines"))
  override def findOne(id: String): Discipline

  @Cacheable(Array("disciplines"))
  override def findAll(): lang.Iterable[Discipline]

  @Cacheable(Array("disciplines"))
  override def findAll(ids: lang.Iterable[String]): lang.Iterable[Discipline]

  @CacheEvict(Array("disciplines"))
  override def deleteAll(): Unit

  @CacheEvict(Array("disciplines"))
  override def delete(id: String): Unit

  @CacheEvict(Array("disciplines"))
  override def delete(entity: Discipline): Unit

  @CacheEvict(Array("disciplines"))
  override def delete(entities: lang.Iterable[_ <: Discipline]): Unit

  @CacheEvict(Array("disciplines"))
  override def save[S <: Discipline](entity: S): S

  @CacheEvict(Array("disciplines"))
  override def save[S <: Discipline](entities: lang.Iterable[S]): lang.Iterable[S]


}
