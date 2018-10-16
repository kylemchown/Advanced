object Prime {

//  def isPrime(num: Int): scala.collection.mutable.ArrayBuffer[Int] ={
//    var a = scala.collection.mutable.ArrayBuffer[Int]()
//    num match{
//      case 2 => a += num
//      case _ =>
//        (2 to num-1) foreach {i =>
//          num%i ==0
//        } yield
//
//        }
//    a
//    }

  def printPrimes(num:Int, primes: scala.collection.mutable.ArrayBuffer[Int] = scala.collection.mutable.ArrayBuffer[Int]()):scala.collection.mutable.ArrayBuffer[Int] ={
    num match {
      case 2 => primes += 2
      case _ if isPrime(num)=>
        printPrimes(num-1, primes += num)
      case _ => printPrimes(num-1, primes)
    }
  }

  def countPrimes(num:Int, count:Int = 0 ):Int ={
    num match {
      case 2 => count + 1
      case _ if isPrime(num)=>
        countPrimes(num-1, count + 1)
      case _ => countPrimes(num-1, count)
    }
  }


  def isPrime(num:Int):Boolean =
    (num > 1) && !(2 to scala.math.sqrt(num).toInt).exists(x =>num % x == 0)


  def calculatePrimesStream(end: Int): List[Int] = {
    val odds = Stream.from(3, 2).takeWhile(_ <= Math.sqrt(end).toInt)
    val composites = odds.flatMap(i => Stream.from(i * i, 2 * i).takeWhile(_ <= end))
    Stream.from(3, 2).takeWhile(_ <= end).diff(composites).toList
  }


  def primesIterative(end: Int): List[Int] = {
    val primeIndices = scala.collection.mutable.ArrayBuffer.fill((end + 1) / 2)(1)

    val intSqrt = Math.sqrt(end).toInt
    for (i <- 3 to end by 2 if i <= intSqrt) {
      for (nonPrime <- i * i to end by 2 * i) {
        primeIndices.update(nonPrime / 2, 0)
      }
    }

    (for (i <- primeIndices.indices if primeIndices(i) == 1) yield 2 * i + 1).tail.toList
  }

//  def isPrime(n: Long): Boolean = !(2 +: (3 to Math.sqrt(n).toInt by 2) exists (n%_ == 0))
}
