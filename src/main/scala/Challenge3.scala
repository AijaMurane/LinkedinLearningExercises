/*
In that app create a function that will find the average of an array of numbers.
Also write two more functions, one to find the minimum inside the array and one to find the max value inside the array.
 */


object Challenge3 extends App {

  def averageOfArray(a: Array[Int]): Double = {
    a.foldLeft(0.0)(_ + _)/a.length
  }

  def minOfArray(a: Array[Int]): Double = {
    a.min
  }

  def maxOfArray(a: Array[Int]): Double = {
    a.max
  }

  val myArray = Array(1,2,3,4,5,6)
  println(averageOfArray(myArray))
  println(minOfArray(myArray))
  println(maxOfArray(myArray))



}
