package org.jasoet.scholarship.db.repository

import java.lang
import java.util.{List => JList}

import org.jasoet.scholarship.db.entity.{Institution, Province}
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

@RepositoryRestResource(collectionResourceRel = "institutions", path = "institutions")
trait InstitutionRepository extends PagingAndSortingRepository[Institution, String] {

  @RestResource(path = "province", rel = "province")
  @Query("SELECT o FROM Institution o WHERE o.province=:province")
  @Cacheable(Array("institutions"))
  def findByProvince(@Param("province") province: Province): JList[Institution]

  @Cacheable(Array("institutions"))
  override def findAll(sort: Sort): lang.Iterable[Institution]

  @Cacheable(Array("institutions"))
  override def findAll(pageable: Pageable): Page[Institution]

  @Cacheable(Array("institutions"))
  override def count(): Long

  @Cacheable(Array("institutions"))
  override def exists(id: String): Boolean

  @Cacheable(Array("institutions"))
  override def findOne(id: String): Institution

  @Cacheable(Array("institutions"))
  override def findAll(): lang.Iterable[Institution]

  @Cacheable(Array("institutions"))
  override def findAll(ids: lang.Iterable[String]): lang.Iterable[Institution]

  @CacheEvict(Array("institutions"))
  override def delete(id: String): Unit

  @CacheEvict(Array("institutions"))
  override def delete(entity: Institution): Unit

  @CacheEvict(Array("institutions"))
  override def delete(entities: lang.Iterable[_ <: Institution]): Unit

  @CacheEvict(Array("institutions"))
  override def save[S <: Institution](entity: S): S

  @CacheEvict(Array("institutions"))
  override def save[S <: Institution](entities: lang.Iterable[S]): lang.Iterable[S]

  @CacheEvict(Array("institutions"))
  override def deleteAll(): Unit

}
