package org.jasoet.scholarship.db.repository

import java.lang

import org.jasoet.scholarship.db.entity.Occupation
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

@RepositoryRestResource(collectionResourceRel = "occupations", path = "occupations")
trait OccupationRepository extends PagingAndSortingRepository[Occupation, String] {
  @Cacheable(Array("occupations"))
  override def findAll(sort: Sort): lang.Iterable[Occupation]

  @Cacheable(Array("occupations"))
  override def findAll(pageable: Pageable): Page[Occupation]

  @Cacheable(Array("occupations"))
  override def count(): Long

  @Cacheable(Array("occupations"))
  override def findOne(id: String): Occupation

  @Cacheable(Array("occupations"))
  override def findAll(): lang.Iterable[Occupation]

  @Cacheable(Array("occupations"))
  override def findAll(ids: lang.Iterable[String]): lang.Iterable[Occupation]

  @Cacheable(Array("occupations"))
  override def exists(id: String): Boolean

  @CacheEvict(Array("occupations"))
  override def deleteAll(): Unit

  @CacheEvict(Array("occupations"))
  override def delete(id: String): Unit

  @CacheEvict(Array("occupations"))
  override def delete(entity: Occupation): Unit

  @CacheEvict(Array("occupations"))
  override def delete(entities: lang.Iterable[_ <: Occupation]): Unit

  @CacheEvict(Array("occupations"))
  override def save[S <: Occupation](entity: S): S

  @CacheEvict(Array("occupations"))
  override def save[S <: Occupation](entities: lang.Iterable[S]): lang.Iterable[S]


}
