package example

object Pivot extends App {

  def pivot[A <% Ordered[A]](list: List[A]): (List[A], A, List[A]) =
    list.tail.foldLeft[(List[A], A, List[A])] ((Nil, list.head, Nil)) {
      (result, item) =>
      val (r1, pivot, r2) = result
      if (item < pivot) (item :: r1, pivot, r2) else (r1, pivot, item :: r2)
    }

  def quicksort[A <% Ordered[A]](list: List[A]): List[A] = list match {
    case head :: _ :: _ =>
      println(list)
      list.foldLeft[(List[A],List[A],List[A])]( (Nil, Nil, Nil) ) {
        (result, item) =>
          val (r1, r2, r3) = result
          if      (item < head) (item :: r1, r2, r3)
          else if (item > head) (r1, r2, item :: r3)
          else                  (r1, item :: r2, r3)
      } match {
        case (list1, list2, list3) =>
          quicksort(list1) ::: list2  ::: quicksort(list3)
      }
    case _ => list
  }

  val listFruit = List("apple", "pear", "banana", "apple")

  println(quicksort(listFruit))
}
