package org.jasoet.scholarship.db.entity

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
  var nameEng: String = _
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
  def apply(id: String, name: String, nameEng: String, province: Province, address: String, website: String, active: Boolean) = {
    val o = new Institution()
    o.id = id
    o.name = name
    o.nameEng = nameEng
    o.province = province
    o.address = address
    o.website = website
    o.active = active
    o
  }

  def unapply(o: Institution): Option[(String, String, String, Province, String, String, Boolean)] = {
    Some(o.id, o.name, o.nameEng, o.province, o.address, o.website, o.active)
  }
}