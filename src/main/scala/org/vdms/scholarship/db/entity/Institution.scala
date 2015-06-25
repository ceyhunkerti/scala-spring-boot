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
class Institution {

  @Id
  @BeanProperty
  var id: String = _
  @BeanProperty
  @Column(nullable = false)
  var name: String = _
  @BeanProperty
  @Column(nullable = false)
  var nameEn: String = _
  @BeanProperty
  @JoinColumn(nullable = false)
  @ManyToOne(fetch = FetchType.EAGER)
  var province: Province = _
  @BeanProperty
  @Column(nullable = false)
  var address: String = _
  @BeanProperty
  @Column(nullable = false)
  var website: String = _
  @BeanProperty
  @Column(nullable = false)
  var active: Boolean = _

}

object Institution {
  def apply(i: String, n: String, ne: String, pro: Province, add: String, web: String, act: Boolean) = {
    val o = new Institution()
    o.id = i
    o.name = n
    o.nameEn = ne
    o.province = pro
    o.address = add
    o.website = web
    o.active = act
    o
  }

  def unapply(o: Institution): Option[(String, String, String, Province, String, String, Boolean)] = {
    Some(o.id, o.name, o.nameEn, o.province, o.address, o.website, o.active)
  }
}