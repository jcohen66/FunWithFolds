package example

object Product extends App {

  val z = 1

  def product(list: List[Int]): Int = list.foldLeft(z)((a, c) => a * c)

  def productWild(list: List[Int]): Int = list.foldLeft(z)(_ * _)

  val list = List(1, 6, 9, 10)

  println(product(list))
  println(productWild(list))


}
