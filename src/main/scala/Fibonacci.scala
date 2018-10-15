object Fibonacci {
  @annotation.tailrec
  def findFib(index : Int, prev: Int = 0, current: Int = 1): Int = {
    if (index <= 0 ){
      prev
    }
    else {
      findFib(index - 1, current, current + prev)
    }
  }
}
