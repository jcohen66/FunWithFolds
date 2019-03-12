package example

object Sum extends App {

  val z = 0

  def sum(list: List[Int]): Int = list.foldLeft(z)((a, c) => a + c)

  def sumWild(list: List[Int]): Int = list.foldLeft(z)(_ + _)

  val list = List(1, 6, 9, 10)

  println(sum(list))
  println(sumWild(list))


}
