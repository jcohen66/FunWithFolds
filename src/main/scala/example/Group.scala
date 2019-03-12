package example


object Group extends App {

  def group[A](list: List[A], size: Int): List[List[A]] =
    list.foldLeft( (List[List[A]](),0) ) { (r,c) => r match {
      case (head :: tail, num) =>
        if (num < size)  ( (c :: head) :: tail , num + 1 )
        else             ( List(c) :: head :: tail , 1 )
      case (Nil, num) => (List(List(c)), 1)
    }
    }._1.foldLeft(List[List[A]]())( (r,c) => c.reverse :: r)

  val listFruit = List("pear", "banana", "apple", "apple", "apple")

  println(group(listFruit, 2))

}
