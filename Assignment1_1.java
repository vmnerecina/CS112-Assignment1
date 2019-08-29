# CS112-Assignment1
CS112 - Assignment 1 
/*Assignment1 - 1
  Victoria Nerecina
  this program demonstrates  :
  - takes the input of number of seconds from the user
  - converts the number of seconds to hours, minutes, and seconds

  */

  import java.util.Scanner;

  public class Assignment1_1

 {
 	public static void main(String [] args) 
 	{
 		Scanner Input =new Scanner(System.in); 

 		float secondsInput;

 		System.out.print("enter number of seconds: ");
 		secondsInput = Input.nextFloat();

 		float hours = secondsInput / 3600;

 		float minutes = (secondsInput  % 3600) / 60; //remainder divided by 60

 		float seconds = (secondsInput % 3600 ) % 60 ; //remainder divided by 60 again 

 		System.out.println("hours = " + (int)hours);
 		System.out.println("minutes = " + (int)minutes);
 		System.out.println("seconds = " + (int)seconds);

 	}
 }
