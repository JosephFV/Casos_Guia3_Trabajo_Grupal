package com.senati.eti;

import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		// Factorial
		// 1 x 2 x 3 x . . . x n
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese número: ");
		int num1 = sc.nextInt();
		
		int res = 0;
		
		String res2 = "";
		
		res = num1 * (num1 - 1) * (num1 - 2);
		
		if (num1 <= 7)
			System.out.println("El factorial de " + num1 + " es: " + res);				
			
		else
			res2  = ("El número es superior de 7");
			System.out.println(res2);
		
	}

}
