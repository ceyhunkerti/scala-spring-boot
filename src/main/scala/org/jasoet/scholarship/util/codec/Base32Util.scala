package org.jasoet.scholarship.util.codec

import org.apache.commons.codec.binary.{Base32, StringUtils}
import org.apache.commons.lang3.SerializationUtils

/**
 * Created by Deny Prasetyo
 * 24 June 2015
 * Principal Software Development Engineer
 * GDP Labs
 * deny.prasetyo@gdplabs.id
 */


object Base32Util {
  val codec = new Base32()

  implicit class Base32StringUtil(val o: String) {
    def toBase32String: String = codec.encodeToString(StringUtils.getBytesUtf8(o))

    def fromBase32String: String = {
      assert(codec.isInAlphabet(o), "Invalid Base32 Format")
      StringUtils.newStringUtf8(codec.decode(o))
    }

    def fromBase32ToObject[T <: Serializable]: T = {
      assert(codec.isInAlphabet(o), "Invalid Base32 Format")
      SerializationUtils.deserialize[T](codec.decode(o))
    }
  }

  implicit class Base32ObjectUtil(val o: Serializable) {
    def toBase32String: String = {
      codec.encodeToString(SerializationUtils.serialize(o))
    }
  }

}
