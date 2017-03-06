import sun.misc.BASE64Encoder

//In any language of your choice, write a utility that will translate a hexadecimal string to base64.
//Here's a test: this string `45766964696e74` should be converted into this string `RXZpZGludA== `.
val hexString = "45766964696e74"
val base64String = "RXZpZGludA== "


def str2hex(str: String): BigInt = BigInt.apply(str, 16)

/**
  * Must be big Int for the conversion. I thought it would be
  * eastiest to convert the HexString to an actual HexValue.
  * From there I could encode the HexValue into Base64 byte value
  */
val num: BigInt = str2hex(hexString)

/**
  * Leverage the Base64 Encoder from sun to convert the Hex value as an Int into Base64
  */
val base64Num =new BASE64Encoder().encode(num.toByteArray)

/**
  * Use trim to remove any trailing spaces.
  */
base64Num.trim == base64String.trim