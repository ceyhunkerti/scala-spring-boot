package org.vdms.scholarship.db.entity

import javax.persistence._

import scala.beans.BeanProperty

/**
 * Created by Deny Prasetyo
 * 25 June 2015
 * Principal Software Development Engineer
 * GDP Labs
 * deny.prasetyo@gdplabs.id
 */

@Entity
class Institution(i: String, n: String, ne: String, pro: Province, add: String, web: String, act: Boolean) {

  @Id
  @BeanProperty
  var id: String = i
  @BeanProperty
  @Column(nullable = false)
  var name: String = n
  @BeanProperty
  @Column(nullable = false)
  var nameEn: String = ne
  @BeanProperty
  @JoinColumn(nullable = false)
  @ManyToOne(fetch = FetchType.EAGER)
  var province: Province = pro
  @BeanProperty
  @Column(nullable = false)
  var address: String = add
  @BeanProperty
  @Column(nullable = false)
  var website: String = web
  @BeanProperty
  @Column(nullable = false)
  var active: Boolean = act

}

object Institution {
  def apply(i: String, n: String, ne: String, pro: Province, add: String, web: String, act: Boolean) = {
    new Institution(i, n, ne, pro, add, web, act)
  }

  def unapply(o: Institution): Option[(String, String, String, Province, String, String, Boolean)] = {
    Some(o.id, o.name, o.nameEn, o.province, o.address, o.website, o.active)
  }
}