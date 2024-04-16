package javaStartclass;

import java.util.Scanner;

//Celsius to Fahrenheit: 9/5×(C+32)
//Fahrenheit to Celcius = 5/9 * (F-32)

public class TempConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("What do you want to convert the value from? \n1: C - F \n 2: F-C ");
		int userOption = input.nextInt();
		System.out.println("What do you want to convert the value from? \n1: C - F \n 2: F-C ");
		double temp = input.nextDouble();
		if(userOption == 1) {
			convertTemp(temp,True);
			
		}
		
		
	}

}
