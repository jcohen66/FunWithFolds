package example

object Count extends App {

  val z = 0

  def count(list: List[Int]): Int = list.foldLeft(z)((a, _) => a + 1)

  val list = List(1, 6, 9, 10)

  println(count(list))


}