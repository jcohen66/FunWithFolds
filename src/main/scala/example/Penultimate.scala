package example

object Penultimate extends App {

  val z = 0.0

  def penultimate[A](list: List[A]): A = list.foldLeft( (list.head, list.tail.head) )((a,c) => (a._2, c))._1

  val list = List(1.0, 6.0, 9.0, 10.0)

  println(penultimate(list))

  val listFruit = List("apple", "pear", "banana")

  println(penultimate(listFruit))
}
