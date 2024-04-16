package javaStartclass;

import java.util.Scanner;

public class cToF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double c = 0, f = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter temp in Fahrenheit: ");
		f = input.nextDouble();
		c = (f-32)*(5.0/9);
		System.out.println("Temp in Celsisu is:" + c);
		
		
			

	}




}

