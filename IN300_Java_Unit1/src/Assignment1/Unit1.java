package Assignment1;

import java.util.Scanner;

public class Unit1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		//Prompt for the first number 
		System.out.println("Enter first number: ");
		double firstNumber = sc.nextDouble(); 
		
		//Prompt for second number
		System.out.println("Enter second number: "); 
		double secondNumber = sc.nextDouble();
		
		//Prompt for third number 
		System.out.println("Enter third number: "); 
		double thirdNumber = sc.nextDouble(); 
		
		//Close scanner object 
		sc.close();
		

		//sum is also a double and keeping whole numbers and/or decimals when calculating
		double sum = firstNumber + secondNumber + thirdNumber; 
		
		//find average  
				final int COUNT = 3; 
				double average = sum / COUNT;  // by sum being double, safe decimal division 
		
				
		//check if sum has a decimal 
		if (sum % 1 == 0) {
			//Show sum 
			System.out.println("The sum is: " + (int) sum);
			} else {System.out.println("The sum is:" + sum);
				}
	
		//check if average has decimal
		if (average % 1 == 0) {
			//Show average 
			System.out.println("The average is: " + (int) average);
			} else {System.out.println("The average is: " + average);
				}	
	}

}
