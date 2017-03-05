import scala.annotation.tailrec

//When you run it from the command line, it takes one parameter. So `$> python specialMath.py 7` will produce `79`.
// Also, `$> python specialMath.py 17` will produce `10926`. This question has two parts: first, convert it to Scala;
// second, have the script calculate `$> specialMath 90`.
val input = 0
def specialMath(n: Long): Long = {

  def specialMathHelper(n: Long, prev: Int = 0, next:Int = 1): Long = {
    n match {
      case 0 => prev
      case 1 => next
      case _ => n + specialMathHelper(n - 1) + specialMathHelper(n - 2)
    }
  }
  specialMathHelper(n)
}
specialMath(input) == 0L
specialMath(1) == 1L
specialMath(2) == 3L
specialMath(3) == 7L
specialMath(4) == 14L
specialMath(5) == 26L
specialMath(6) == 46L
specialMath(17) == 10926L
