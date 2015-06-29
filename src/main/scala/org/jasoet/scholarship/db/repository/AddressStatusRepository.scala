package org.jasoet.scholarship.db.repository

import java.lang

import org.jasoet.scholarship.db.entity.AddressStatus
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

@RepositoryRestResource(collectionResourceRel = "address-statuses", path = "address-statuses")
trait AddressStatusRepository extends PagingAndSortingRepository[AddressStatus, String] {

  @Cacheable(Array("address-statuses"))
  override def findAll(sort: Sort): lang.Iterable[AddressStatus]

  @Cacheable(Array("address-statuses"))
  override def findAll(pageable: Pageable): Page[AddressStatus]

  @Cacheable(Array("address-statuses"))
  override def count(): Long

  @Cacheable(Array("address-statuses"))
  override def findOne(id: String): AddressStatus

  @Cacheable(Array("address-statuses"))
  override def findAll(): lang.Iterable[AddressStatus]

  @Cacheable(Array("address-statuses"))
  override def findAll(ids: lang.Iterable[String]): lang.Iterable[AddressStatus]

  @Cacheable(Array("address-statuses"))
  override def exists(id: String): Boolean


  @CacheEvict(Array("address-statuses"))
  override def deleteAll(): Unit

  @CacheEvict(Array("address-statuses"))
  override def delete(id: String): Unit

  @CacheEvict(Array("address-statuses"))
  override def delete(entity: AddressStatus): Unit

  @CacheEvict(Array("address-statuses"))
  override def delete(entities: lang.Iterable[_ <: AddressStatus]): Unit

  @CacheEvict(Array("address-statuses"))
  override def save[S <: AddressStatus](entity: S): S

  @CacheEvict(Array("address-statuses"))
  override def save[S <: AddressStatus](entities: lang.Iterable[S]): lang.Iterable[S]


}
