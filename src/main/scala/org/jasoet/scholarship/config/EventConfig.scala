package org.jasoet.scholarship.config

import org.jasoet.scholarship.config.bootstrap.EventBootstrap
import org.springframework.context.annotation.{Bean, Configuration}
import reactor.Environment
import reactor.bus.{Event, EventBus}
import reactor.fn.Consumer

/**
 * Created by Deny Prasetyo
 * 25 June 2015
 * Principal Software Development Engineer
 * GDP Labs
 * deny.prasetyo@gdplabs.id
 */

@Configuration
class EventConfig {
  @Bean
  def env: Environment = {
    Environment.initializeIfEmpty.assignErrorJournal
  }

  @Bean
  def createEventBus(env: Environment): EventBus = {
    EventBus.create(env, Environment.THREAD_POOL)
  }


  @Bean
  def bootstrap(eventBus: EventBus): EventBootstrap = {
    val eventMap: Map[String, Consumer[Event[_]]] = Map()
    new EventBootstrap(eventBus, eventMap)
  }
}
