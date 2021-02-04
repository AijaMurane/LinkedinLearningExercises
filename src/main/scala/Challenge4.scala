/*
What I'd like you to do is inside that app, I want you to add a class to create a bank account.
The bank account will include the client name, the starting balance and the account type, checking or savings.
Then, use a singleton for the account number, start it at 5000.
In the main program, create several instances of bank accounts and print out your results.
 */

object Challenge4 extends App {
  var b1 = new BankAccount("Aija", 200.00, 's')
  var b2 = new BankAccount("Ieva", 2000.00, 'c')
  var b3 = new BankAccount("Eva", 20000.00, 's')
  println(b1)
  println(b2)
  println(b3)

}

  class BankAccount(val clientName: String, val startingBalance: Double, val accountType: Char) {
    var accountNumber = BankAccount.newAccountNumber()
    override def toString = "Client name: " + clientName + "\nAccount number: " + accountNumber +
      (if(accountType == 'c') "\nChecking account" else "\nSavings account") +
      ("\n" + "-"*25)
  }

  object BankAccount {
    var accountNumber = 5000
    def newAccountNumber() = {
      accountNumber += 1
      accountNumber
    }
  }

