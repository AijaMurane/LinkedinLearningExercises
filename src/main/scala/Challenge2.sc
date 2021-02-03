/*
Create a worksheet in this project, write code for a payroll function.
The payroll function will calculate the weekly paycheck for an hourly employee.
In our example hourly employees receive overtime, which means the first 40 hours are calculated at the regular rate.
Anything about 40 hours should be calculated at 1.5 times their hourly rate.
Use an hourly rate of $10.50.
Check to see if the employee is hourly or salaried before calculating their paycheck.
If they're salaried, just print a message.
 */

def payroll(typeOfEmployee: String, hoursWorked: Int): Unit = {
  val hourlyRate = 10.50
  val overtimeRate = 1.5
  if (typeOfEmployee != "salaried") {
    if (hoursWorked <= 40) {
      println("The remuneration is: " + hoursWorked * hourlyRate)
    }
    else
      println("The remuneration is: " + (40 * hourlyRate + (hoursWorked - 40) * hourlyRate * overtimeRate))
  }
  else
    println("The employee is a salaried employee.")
}

payroll("hourly", 20)
payroll("hourly", 40)
payroll("hourly", 50)
payroll("salaried", 35)
payroll("salaried", 55)
payroll("salaried", 0)