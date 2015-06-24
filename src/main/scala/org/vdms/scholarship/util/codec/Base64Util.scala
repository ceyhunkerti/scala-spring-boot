package org.vdms.scholarship.util.codec

import org.apache.commons.codec.binary.{Base64, StringUtils}
import org.apache.commons.lang3.SerializationUtils


/**
 * Created by Deny Prasetyo
 * 24 June 2015
 * Principal Software Development Engineer
 * GDP Labs
 * deny.prasetyo@gdplabs.id
 */


object Base64Util {
  val codec = new Base64()

  implicit class Base64StringUtil(val o: String) {
    def toBase64String: String = codec.encodeToString(StringUtils.getBytesUtf8(o))

    def toBase64ByteArray: Array[Byte] = codec.encode(StringUtils.getBytesUtf8(o))

    def fromBase64String: String = {
      assert(codec.isInAlphabet(o), "Invalid Base64 Format")
      StringUtils.newStringUtf8(codec.decode(o))
    }

    def fromBase64ToObject[T <: Serializable]: T = {
      assert(codec.isInAlphabet(o), "Invalid Base64 Format")
      SerializationUtils.deserialize[T](codec.decode(o))
    }
  }

  implicit class Base64ObjectUtil(val o: Serializable) {
    def toBase64String: String = {
      codec.encodeToString(SerializationUtils.serialize(o))
    }

    def toBase64ByteArray: Array[Byte] = codec.encode(SerializationUtils.serialize(o))
  }

  implicit class Base64ByteArrayUtil(val o: Array[Byte]) {
    def toBase64String: String = {
      codec.encodeAsString(o)
    }

    def fromBase64ToObject[T <: Serializable]: T = {
      SerializationUtils.deserialize[T](codec.decode(o))
    }

  }

}
