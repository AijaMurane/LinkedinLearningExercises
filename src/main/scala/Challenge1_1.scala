/*
In this challenge, I'm going to give you a sample Java program, and you're going to translate that to Scala.
The program is a simple calculator program, that allows the user to do addition, division, multiplication and subtraction.

Java code:

public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        System.out.println(addition(x,y));
        System.out.println(quotient(x,y));
        System.out.println(times(x,y));
        System.out.println(minus(x,y));

    }
    public static int addition(int a, int b)
	{
		return a + b;
	}
	public static int quotient(int a, int b)
	{
            if(b == 0)
                return 0;
            return a/b;
	}
	public static int times(int c, int d)
	{
		return c * d;
	}
	public static int minus(int a, int b)
	{
		return a - b;
	}

}


 */

object Challenge1_1 extends App {

  val x = 10
  val y = 5
  println(addition(x,y))
  println(quotient(x,y))
  println(times(x,y))
  println(minus(x,y))

  def addition(a: Int, b: Int) = a + b
  def quotient(a: Int, b: Int) = {
    if (b != 0) a/b else println("You shall not divide by 0")
  }
  def times(a: Int, b: Int) = a * b
  def minus(a: Int, b: Int) = a - b

}
