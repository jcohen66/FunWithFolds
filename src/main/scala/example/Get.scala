package example

object Get extends App {

  def get[A](list: List[A], idx: A): A =
    list.tail.foldLeft( list.head, 0 ) {
      (a,c) => if (a._2 == idx) a else (c, a._2+1)
    } match {
      case (result, index) if (idx == index) => result
      case _ => throw new Exception("Bad index")
    }

  val list = List(1.0, 6.0, 9.0, 10.0)

  println(get(list, 2))

  val listFruit = List("apple", "pear", "banana")

  println(get(listFruit, 1))
}
