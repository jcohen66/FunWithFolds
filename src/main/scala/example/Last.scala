package example

object Last extends App {

  val z = 0.0

  def last[A](list: List[A]): A = list.foldLeft[A](list.head){(_,c) => c}

  val list = List(1.0, 6.0, 9.0, 10.0)

  println(last(list))

  val listFruit = List("apple", "pear", "banana")

  println(last(listFruit))
}

