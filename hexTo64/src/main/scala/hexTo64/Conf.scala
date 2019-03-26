package hexTo64

import org.rogach.scallop.{ScallopConf, ScallopOption}

/** CLI class. */
class Conf(arguments: Seq[String]) extends ScallopConf(arguments) {
  version(s"hexTo64 ${getClass.getPackage.getImplementationVersion}")
  banner("""Usage: hexTo64 HEX_STRING
           |hexTo64 converts the provided hexadecimal (base16) string to a base64-encoded string
         """.stripMargin)

  val hex_string: ScallopOption[String] = trailArg[String](name = "HEX_STRING", descr = "Hexadecimal (base16) string.")

  verify()
}
