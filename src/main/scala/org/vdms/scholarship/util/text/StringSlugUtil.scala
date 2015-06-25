package org.vdms.scholarship.util.text

import com.github.slugify.Slugify

/**
 * Created by Deny Prasetyo
 * 25 June 2015
 * Principal Software Development Engineer
 * GDP Labs
 * deny.prasetyo@gdplabs.id
 */


object StringSlugUtil {
  val slug = new Slugify()
  val slugCaseSensitive = new Slugify(false)

  implicit class StringSlugImprovement(val o: String) {
    def toSlug: String = slug.slugify(o)

    def toCaseSensitiveSlug: String = slugCaseSensitive.slugify(o)
  }

}
