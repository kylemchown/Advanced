object Subsequence {

  //Incomplete
  //Sometimes works, other times not
  //Issue might be to fo with when strings are equal length and last character doesn't match


    def subseq(string1: String, string2: String, subs: String = ""): String={
      val a = string1.toCharArray.reverse
      val b = string2.toCharArray.reverse
      val c = subs.toCharArray.reverse
      (string1, string2) match {
        case (_, "") => subs.reverse
        case ("",_) => subs.reverse
        case _ if a(0) == b(0) => subseq(a.drop(1).reverse.mkString, b.drop(1).reverse.mkString, subs.+(a(0)))
        case _ if a.length > b.length => subseq(a.drop(1).reverse.mkString, string2, subs)
        case _ => subseq(string1, b.drop(1).reverse.mkString, subs)
      }


    }

  //gfg

}