/*
In this challenge, we're going to write Scala code that starts with a list of 10 numbers, representing the numeric grades for 10 students on a recent test.
You'll loop through each of the grades and evaluate the grade and print out a letter grade for each of the scores.
You'll also calculate the average of all the grades.
Here is the scale for the letter grades.
93 to 100 is an A,
86 to 92 should be a B,
77 to 85 is a C,
69 to 76 is a D,
and, finally, anything below 69 is failing.
 */


object Challenge1_2 extends App {
  println("Welcome to the Scala worksheet")
  var grades = List(100, 99, 75, 67, 89, 85, 92, 93, 60, 97)

  for (g <- grades) {
    if (g>=93 && g<=100) println("A")
    else if (g>=86) println("B")
    else if (g>=77) println("C")
    else if (g>=69) println("D")
    else if (g<69) println("F")
    else println("Error")
  }

  println(s"Average of all grades is ${grades.sum.toDouble/grades.length.toDouble}")
}
