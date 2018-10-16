import collection.mutable.{ HashMap, MultiMap, Set }

object Hashmap {

  def readPrint()= {
    val lines = scala.io.Source.fromFile("C:\\Users\\Admin\\Desktop\\files\\enable1.txt").getLines.toArray
    val hashMap1 = new HashMap[String, Set[String]] with MultiMap[String, String]
    lines.foreach(i => hashMap1.addBinding(i.sorted, i))
    //hashMap1.foreach(println)
    hashMap1
  }

  def sortString(toSort: String)={
    toSort.sorted
  }
  }
