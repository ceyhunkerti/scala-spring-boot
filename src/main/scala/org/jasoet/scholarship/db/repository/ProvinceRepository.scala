package org.jasoet.scholarship.db.repository

import java.lang

import org.jasoet.scholarship.db.entity.Province
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

@RepositoryRestResource(collectionResourceRel = "provinces", path = "provinces")
trait ProvinceRepository extends PagingAndSortingRepository[Province, String] {
  @Cacheable(Array("provinces"))
  override def findAll(sort: Sort): lang.Iterable[Province]

  @Cacheable(Array("provinces"))
  override def findAll(pageable: Pageable): Page[Province]

  @Cacheable(Array("provinces"))
  override def count(): Long

  @Cacheable(Array("provinces"))
  override def findOne(id: String): Province

  @Cacheable(Array("provinces"))
  override def findAll(): lang.Iterable[Province]

  @Cacheable(Array("provinces"))
  override def findAll(ids: lang.Iterable[String]): lang.Iterable[Province]

  @Cacheable(Array("provinces"))
  override def exists(id: String): Boolean

  @CacheEvict(Array("provinces"))
  override def deleteAll(): Unit

  @CacheEvict(Array("provinces"))
  override def delete(id: String): Unit

  @CacheEvict(Array("provinces"))
  override def delete(entity: Province): Unit

  @CacheEvict(Array("provinces"))
  override def delete(entities: lang.Iterable[_ <: Province]): Unit

  @CacheEvict(Array("provinces"))
  override def save[S <: Province](entity: S): S

  @CacheEvict(Array("provinces"))
  override def save[S <: Province](entities: lang.Iterable[S]): lang.Iterable[S]


}
