package org.jasoet.scholarship.util.id

import java.time.LocalDateTime
import java.util.concurrent.atomic.AtomicInteger

import org.jasoet.scholarship.util.date.DateTimeUtil

/**
 * Created by Deny Prasetyo
 * 24 June 2015
 * Principal Software Development Engineer
 * GDP Labs
 * deny.prasetyo@gdplabs.id
 */


import org.jasoet.scholarship.util.date.DateTimeUtil._


case class AltairSnowFlakeId(timestamp: LocalDateTime, serverId: Int, inc: Int)

object AltairSnowFlake {
  val EPOCH: Long = 1420045200000L

  private object Increment extends AtomicInteger(0)

  def apply(serverId: Int) = new AltairSnowFlakeIdFactory(serverId, Increment)

  def parse(id: Long): AltairSnowFlakeId = {
    val ts = (id >> 22) + EPOCH
    val max: Long = 64 - 1l
    val machineId = (id >> 16) & max
    val i = id & max
    AltairSnowFlakeId(ts.toLocalDateTime, machineId.toInt, i.toInt)
  }

  def parse(hexId: String): AltairSnowFlakeId = {
    implicit def alpha2long(hex: String): Long = java.lang.Long.parseLong(hex.toLowerCase, 36)
    parse(hexId: Long)
  }
}

class AltairSnowFlakeIdFactory(serverId: Int, incr: AtomicInteger) {
  assert(serverId < 64, "Maximum machine id number is 63")

  def nextId(): Long = synchronized {
    val currentTs = System.currentTimeMillis()
    val ts: Long = currentTs - AltairSnowFlake.EPOCH
    val max = 16384 - 2
    if (incr.get() >= max) {
      incr.set(0)
    }
    val i = incr.incrementAndGet()
    val result: Long = (ts << 22) | (serverId << 16) | i
    result
  }

  def nextAlpha(): String = {
    val result = nextId()
    java.lang.Long.toString(result, 36).toUpperCase
  }
}
