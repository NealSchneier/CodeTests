import scala.annotation.tailrec

//When you run it from the command line, it takes one parameter. So `$> python specialMath.py 7` will produce `79`.
// Also, `$> python specialMath.py 17` will produce `10926`. This question has two parts: first, convert it to Scala;
// second, have the script calculate `$> specialMath 90`.

/**
  * Cache to store the key value and then the special math value for that position.
  * Avoids the overflow by just making everything a lookup instead of creating a new stackframe.
  * Another way would be to use Tail Recursion.
  *
  * IF this was not just a script and production code then there would have been unit tests
  * put around the evaluation.
  */
val cache = scala.collection.mutable.Map[Int, BigInt]()
def specialMathCache(n: Int): BigInt = {

  def cacheHelper(x: Int): BigInt = {
    def evaluation = {
      val ret = n + specialMathCache(n - 1) + specialMathCache(n - 2)
      cache(n) = ret
      ret
    }
    x match {
      case 0 => 0
      case 1 => 1
      case n: Int => {
        cache.getOrElse(n, evaluation)
      }
    }
  }
  cacheHelper(n)
}
specialMathCache(1) == 1
specialMathCache(2) == 3
specialMathCache(3) == 7
specialMathCache(4) == 14
specialMathCache(5) == 26
specialMathCache(6) == 46
specialMathCache(7) == 79
specialMathCache(17) == 10926
specialMathCache(90)
