object Fibonacci {
  @annotation.tailrec
  def findFib(index: Int, prev: Int = 1, current: Int = 0): Int = {
    if (index <= 0) {
      current
    }
    else {
      findFib(index - 1, current, current + prev)
    }
  }


  @annotation.tailrec
  def findFib2(index: Int, prev: Int = 1, current: Int = 0): Int = {
   index match {
     case _ if index <= 0 => current
     case _ => findFib2(index - 1, current, current + prev)
   }
  }
}
