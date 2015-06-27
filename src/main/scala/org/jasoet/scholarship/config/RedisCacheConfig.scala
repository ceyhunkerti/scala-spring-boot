package org.jasoet.scholarship.config

import java.lang.reflect.Method

import org.jasoet.scholarship.util.codec.Base64Util._
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.cache.CacheManager
import org.springframework.cache.annotation.{CachingConfigurerSupport, EnableCaching}
import org.springframework.cache.interceptor.KeyGenerator
import org.springframework.context.annotation.{Bean, Configuration}
import org.springframework.data.redis.cache.RedisCacheManager
import org.springframework.data.redis.connection.RedisConnectionFactory
import org.springframework.data.redis.core.RedisTemplate
import org.springframework.data.redis.serializer.{RedisSerializer, StringRedisSerializer}

/**
 * Created by Deny Prasetyo
 * 27 June 2015
 * Principal Software Development Engineer
 * GDP Labs
 * deny.prasetyo@gdplabs.id
 */

@Configuration
@EnableCaching
class RedisCacheConfig extends CachingConfigurerSupport {

  @Autowired
  var redisConnectionFactory: RedisConnectionFactory = _

  @Bean
  def redisTemplate: RedisTemplate[String, Any] = {
    val template = new RedisTemplate[String, Any]
    template.setConnectionFactory(redisConnectionFactory)
    template.setKeySerializer(new StringRedisSerializer())
    template
  }


  override def cacheManager(): CacheManager = {
    new RedisCacheManager(redisTemplate)
  }

  override def keyGenerator(): KeyGenerator = {
    new KeyGenerator {
      override def generate(o: scala.Any, method: Method, objects: AnyRef*): AnyRef = {
        s"${o.getClass.getName}${method.getName}${objects.map(_.toString).mkString("")}"
      }
    }
  }
}
