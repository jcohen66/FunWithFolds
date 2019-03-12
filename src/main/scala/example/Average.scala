package example

object Average extends App {

  val z = 0.0

  def average(list: List[Double]): Double = list.foldLeft(z)(_ + _) / list.foldLeft(z){(a, c) => a + 1}

  val list = List(1.0, 6.0, 9.0, 10.0)

  println(average(list))


}
