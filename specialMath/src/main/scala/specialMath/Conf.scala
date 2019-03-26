package specialMath

import org.rogach.scallop.{ScallopConf, ScallopOption}


/** CLI class. */
class Conf(arguments: Seq[String]) extends ScallopConf(arguments) {
  version(s"specialMath ${getClass.getPackage.getImplementationVersion}")
  banner("""Usage: specialMath N
           |specialMath calculates the Nth term in the integer sequence defined by
           |  f(N) = N + f(N-1) + f(N-2)
           |with initial terms f(0) = 0 and f(1) = 1
         """.stripMargin)

  val n: ScallopOption[Int] = trailArg[Int](
    name = "N",
    descr = "Term to calculate.")

  validate(n) { n =>
    if (n < 0) Left("N must be positive!")
    else Right(Unit)
  }

  verify()
}

