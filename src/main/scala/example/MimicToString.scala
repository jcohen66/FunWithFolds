package example


object MimicToString extends App {

  def mimicToString[A](list: List[A]): String = list match {
      case head :: tail => tail.foldLeft("List(" + head)(_ + ", " + _) + ")"
      case Nil => "List()"
    }


  val listFruit = List("apple", "pear", "banana")

  println(mimicToString(listFruit))
}
