package example

object Unique extends App {

  def unique[A](list: List[A]): List[A] =
    list.foldLeft(List[A]()) { (a,c) =>
      if (a.contains(c)) a else c :: a
    }.reverse



  val listFruit = List("apple", "pear", "banana", "apple")

  println(unique(listFruit))
}

