package org.jasoet.scholarship.config

import java.util.concurrent.TimeUnit

import com.google.common.cache.CacheBuilder
import org.springframework.cache.CacheManager
import org.springframework.cache.annotation.CachingConfigurerSupport
import org.springframework.cache.guava.GuavaCacheManager
import org.springframework.cache.interceptor._

/**
 * Created by Deny Prasetyo
 * 27 June 2015
 * Principal Software Development Engineer
 * GDP Labs
 * deny.prasetyo@gdplabs.id
 */

//@Configuration
//@EnableCaching
class GuavaCacheConfig extends CachingConfigurerSupport {

  override def cacheManager(): CacheManager = {
    val builder = CacheBuilder.newBuilder()
      .expireAfterAccess(1, TimeUnit.HOURS)
    val cacheManager = new GuavaCacheManager()
    cacheManager.setCacheBuilder(builder)
    cacheManager
  }

  override def cacheResolver(): CacheResolver = {
    new SimpleCacheResolver(cacheManager())
  }

  override def errorHandler(): CacheErrorHandler = {
    new SimpleCacheErrorHandler
  }

  override def keyGenerator(): KeyGenerator = {
    new SimpleKeyGenerator
  }
}
