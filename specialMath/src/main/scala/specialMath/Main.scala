package specialMath

import scala.collection.mutable


object Main {

  /** Return nth term in the integer sequence, f(n) = n + f(n-1) + f(n-2) with initial terms f(0) = 0 and f(1) = 1. */
  def cachedSpecialMath(n: Int): BigInt = {
    // Note: Cache is initialized with size n + 1, because recursing from n to 0 will result in n + 1 cache terms.
    val cache = new mutable.OpenHashMap[Int, BigInt](n + 1)

    def specialMath(m: Int): BigInt = {
      cache.getOrElseUpdate(m,
        m match {
          case 0 => 0
          case 1 => 1
          case _ => m + specialMath(m - 1) + specialMath(m - 2)
        })
    }

    specialMath(n)
  }


  def main(args: Array[String]): Unit = {
    val conf = new Conf(args)

    val n = conf.n()

    println(cachedSpecialMath(n))
  }
}
