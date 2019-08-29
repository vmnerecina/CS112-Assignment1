Assignment1_2/* - 2
  Victoria Nerecina
  this program:
  - deposit a certain amount of money into a savings account
  - leave it alone to draw interest for the next 10 years
  - after 10 years, you would like to have $10,000 in the account
  - how much do you need to deposit today to make that happen?
  - rate of interest is 2.99
  - use P=F/(1+r)**n
  	- P = present value, or the amount that you need to deposit today
  	- F = future value that you want in the account. (here F is $10,000.)
	- r = annual interest rate
	- n = number of years that you plan to let the money sit in account
	 usign exponents --- Math.pow(number, exponent);

  */

	import java.util.Scanner;
	
	public class Assignment1_2
	{
		public static void main(String [] args)
		{

			float denomCalculation = (float) Math.pow(1 + 2.99, 10); //10 years

			float presentValue = 10000/ denomCalculation;

			System.out.println("your present value: " + presentValue);

		}
	}
