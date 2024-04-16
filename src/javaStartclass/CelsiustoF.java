package javaStartclass;

import java.util.Scanner;

public class CelsiustoF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double c = 0, f = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter temp in Celsius: ");
		c = input.nextDouble();
		f = ( c * (9.0/5) ) + 32;
		System.out.println("Temp in Fahrenhei is:" + f);
		
			

	}

}
