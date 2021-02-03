object Challenge3 extends App {

  def averageOfArray(a: Array[Int]): Int = {
    a.foreach(sum += _) / (a.length - 1)
  }

  val myArray = Array(1,2,3,4,5,6)
  println(averageOfArray(myArray))

}
