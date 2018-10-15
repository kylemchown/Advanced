object Runner{

  def main(args: Array[String]): Unit = {
//
//   val hash = Hashmap.readPrint()
//    val a = "death".sorted
//    hash.valuesIterator.reduceLeft(_.size max _.size)

    //(applyDiscount andThen prStr)(10.58)

    println(Fibonacci.findFib(9))
  }

  val applyDiscount = (amount: Double) => {
    println("apply dis")
    val dis = 0.1
    (amount - amount*dis).toString
  }

  val prStr = (string : String) => {
    println(string + "ajgvsb")
  }



}
