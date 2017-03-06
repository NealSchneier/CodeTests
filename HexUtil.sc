import com.sun.deploy.util.Base64Wrapper

//In any language of your choice, write a utility that will translate a hexadecimal string to base64.
//Here's a test: this string `45766964696e74` should be converted into this string `RXZpZGludA== `.
val hexString = "45766964696e74"
val base64String = "RXZpZGludA== "


def str2hex(str: String): BigInt = BigInt.apply(str, 16)

val num: BigInt = str2hex(hexString)

Base64Wrapper.encodeToString(num.toByteArray).trim == base64String.trim