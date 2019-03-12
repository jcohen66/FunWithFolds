package example

object Contains extends App {

  val z = false

  def contains[A](list: List[A], item: A): Boolean = list.foldLeft( z )(_ || _ == item)

  val list = List(1.0, 6.0, 9.0, 10.0)

  println(contains(list, 1.0))

  val listFruit = List("apple", "pear", "banana")

  println(contains(listFruit, "banana"))
}
