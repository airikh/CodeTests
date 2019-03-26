package hexTo64

import com.google.common.io.BaseEncoding.{base16, base64}

import scala.util.{Failure, Success, Try}


object Main {

  /** Decodes the provided hexadecimal string and returns the base64 encoded version. */
  def base16to64(hex: String): Try[String] = {
    // Note: Input string is uppercased, because BaseEncoding's behavior is relatively strict and in accordance with
    // RFC 4648, but we want this tool to support any case for the A-F characters.
    val bytes = Try(base16.decode(hex.toUpperCase))

    bytes.map(base64.encode)
  }

  def main(args: Array[String]): Unit = {
    val conf = new Conf(args)

    val hex_string = conf.hex_string()

    val base64EncodedString = base16to64(hex_string)

    base64EncodedString match {
      case Success(v) => println(v)
      case Failure(e) =>
        println(s"Unable to base16 decode '$hex_string': ${e.getMessage}")
        sys.exit(1)
    }
  }
}
