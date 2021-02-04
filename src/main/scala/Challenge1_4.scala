/*
We're going to create an employee case class.
Then inside the case class we're going to override the toString method and we're going to create and print a list of employees.
Each employee should have an id number, a five digit integer. The first name and a last name.
And I want you to print the name in this format.
Employee space id colon and list the five digit number. Then full name, colon, the employee first name, followed by the employee last name.
 */




object Challenge1_4 extends App {
  val myList = List(Employee(12345, "Aija", "XYZ"),Employee(67890, "Ieva", "ABC"))
  myList.foreach(println)

  case class Employee(val idNumber: Int, val fName: String, val lName: String) {
    override def toString: String = "\nEmployee id: " + idNumber + "\nFull name: " + fName + " " + lName
  }


}
