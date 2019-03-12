package example

object Double extends App {

  def double[A](list: List[A]): List[A] =
    list.foldLeft(List[A]()) {(a,c) => c :: c :: a}

  val listFruit = List("apple", "pear", "banana", "apple")

  println(double(listFruit))
}
