package hexTo64

import org.scalatest.FunSuite
import org.scalatest.TryValues._


class MainSpec extends FunSuite {
  test("Main.base16to64 correctly re-encodes a base16 string to base64") {
    assert(Main.base16to64("45766964696e74").success.value == "RXZpZGludA==")
    assert(Main.base16to64("000000").success.value == "AAAA")
    assert(Main.base16to64("FF0000").success.value == "/wAA")
    assert(Main.base16to64("FFFF00").success.value == "//8A")
    assert(Main.base16to64("FFFFFF").success.value == "////")
  }
}
