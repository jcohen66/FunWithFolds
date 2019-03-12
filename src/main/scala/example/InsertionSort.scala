package example

object InsertionSort extends App {

  def insertionSort[A <% Ordered[A]](list: List[A]): List[A] =
    list.foldLeft(List[A]()) {(a,c) =>
      val (front, back) = a.span(_ < c)
      front ::: c :: back
    }

  val listFruit = List("apple", "pear", "banana", "apple")

  println(insertionSort(listFruit))
}