package example

object Reverse extends App {

  def reverse[A](list: List[A]): List[A] =
    list.foldLeft(List[A]()) { (a,c) => c :: a }


  val listFruit = List("apple", "pear", "banana")

  println(reverse(listFruit))
}

