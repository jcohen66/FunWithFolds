package example

object ToSet extends App {

  def toSet[A](list: List[A]): Set[A] =
    list.foldLeft(Set[A]()) {(a,c) => a + c}

  val listFruit = List("apple", "pear", "banana", "apple")

  println(toSet(listFruit))
}

