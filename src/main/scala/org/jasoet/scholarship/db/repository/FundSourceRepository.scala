package org.jasoet.scholarship.db.repository

import java.lang

import org.jasoet.scholarship.db.entity.FundSource
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

@RepositoryRestResource(collectionResourceRel = "fund-sources", path = "fund-sources")
trait FundSourceRepository extends PagingAndSortingRepository[FundSource, String] {
  override def findAll(sort: Sort): lang.Iterable[FundSource]

  override def findAll(pageable: Pageable): Page[FundSource]

  override def count(): Long

  override def deleteAll(): Unit

  override def findOne(id: String): FundSource

  override def findAll(): lang.Iterable[FundSource]

  override def findAll(ids: lang.Iterable[String]): lang.Iterable[FundSource]

  override def delete(id: String): Unit

  override def delete(entity: FundSource): Unit

  override def delete(entities: lang.Iterable[_ <: FundSource]): Unit

  override def save[S <: FundSource](entity: S): S

  override def save[S <: FundSource](entities: lang.Iterable[S]): lang.Iterable[S]

  override def exists(id: String): Boolean
}
