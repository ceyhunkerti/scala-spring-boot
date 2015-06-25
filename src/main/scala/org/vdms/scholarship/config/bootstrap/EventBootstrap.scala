package org.vdms.scholarship.config.bootstrap

import org.springframework.beans.factory.SmartInitializingSingleton
import reactor.bus.selector.Selectors.$
import reactor.bus.{Event, EventBus}
import reactor.fn.Consumer

/**
 * Created by Deny Prasetyo
 * 24 June 2015
 * Principal Software Development Engineer
 * GDP Labs
 * deny.prasetyo@gdplabs.id
 */

class EventBootstrap(eventBus: EventBus,
                     eventMap: Map[String, Consumer[Event[_]]],
                     afterInitFunction: (EventBus, Map[String, Consumer[Event[_]]]) => Unit = (e, m) => Unit)
  extends SmartInitializingSingleton {

  def afterSingletonsInstantiated() {
    eventMap.foreach((m) => {
      val (k, c) = m
      eventBus.on($(k), c)
    })

    afterInitFunction(eventBus, eventMap)
  }
}