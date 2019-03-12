package example


object Encode extends App {

  /**
    * Take a list and return a tuple containing
    * the original value and the number of times
    * it is repeated.
    *
    * @param list
    * @tparam A
    * @return
    */
  def encode[A](list: List[A]): List[(A, Int)] =
    list.foldLeft(List[(A, Int)]()) { (r, c) =>
      r match {
        case (value, count) :: tail =>
          if (value == c) (c, count + 1) :: tail
          else (c, 1) :: r
        case Nil =>
          (c, 1) :: r
      }
    }.reverse

  def decode[A](list: List[(A,Int)]): List[A] =
    list.foldLeft(List[A]()){ (r,c) =>
      var result = r
      for (_ <- 1 to c._2) result = c._1 :: result
      result
    }.reverse

  val listFruit = List("pear", "banana", "apple", "apple")

  val encodedList = encode(listFruit)
  println(encodedList)

  println(decode(encodedList))


}
