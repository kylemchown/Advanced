object Runner{

  def main(args: Array[String]): Unit = {

//    val hash = Hashmap.readPrint()
//    //val a = "death".sorted
//    var a = 0
//    hash.keySet.foreach(i =>
//      if(hash.get(i).get.size > a) {
//        a = hash.get(i).get.size
//        println(i)
//        println(hash.get(i).get)
//      }
//    )
//
//    val now = java.util.Calendar.getInstance()
//    println("" + now.get(java.util.Calendar.SECOND) + ":" + now.get(java.util.Calendar.MINUTE) + ":" + now.get(java.util.Calendar.HOUR_OF_DAY))
//    println(Prime.countPrimes(100000000))
//    val the = java.util.Calendar.getInstance()
//    println("" + the.get(java.util.Calendar.SECOND) + ":" + the.get(java.util.Calendar.MINUTE) + ":" + the.get(java.util.Calendar.HOUR_OF_DAY))



    val t1 = System.nanoTime
    println(Prime.primesIterative(3000000).size + 1)

    println((System.nanoTime - t1) / 1e9d)


    //println(Subsequence.lcs(,))

  }




}
