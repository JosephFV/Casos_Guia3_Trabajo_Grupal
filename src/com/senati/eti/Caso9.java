package com.senati.eti;

import java.util.Scanner;

public class Caso9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nr = 0, n1 = 0, n2 = 0, n3 = 0;
		
		float promedio = 0, asistencia = 0;
		
		String nombre = "", continuar = "S", estado = "";
		
		while (continuar.equals("S") || continuar.equals("s")){
			nr++;
			System.out.println("-----------------------------");
			System.out.println(">>>> R E G I S T R O " +  "["+nr+"]" + " <<<<");
			System.out.println("-----------------------------");
			
			System.out.print("Nombre del alumno");
			System.out.print("\n>>> ");
			nombre = sc.nextLine();
			
			System.out.print("Nota 1");
			System.out.print("\n>>> ");
			n1 = sc.nextInt();
			
			System.out.print("Nota 2");
			System.out.print("\n>>> ");
			n2 = sc.nextInt();
			
			System.out.print("Nota 3");
			System.out.print("\n>>> ");
			n3 = sc.nextInt();
			
			promedio = (n1 + n2 + n3) / 3;
			
			System.out.print("Asistencia [1-12]");
			System.out.print("\n>>>");
			asistencia = sc.nextFloat();
			
			if (asistencia == 12)
				asistencia = 100;
			
			if (asistencia == 11)
				asistencia = 92;
			
			if (asistencia == 10)
				asistencia = 83;
			
			if (asistencia == 9)
				asistencia = 75;
			
			if (asistencia == 8)
				asistencia = 67;
			
			if (asistencia == 7)
				asistencia = 58;
			
			if (asistencia == 6)
				asistencia = 50;
			
			if (asistencia == 5)
				asistencia = 42;
			
			if (asistencia == 4)
				asistencia = 33;
			
			if (asistencia == 3)
				asistencia = 25;
			
			if (asistencia == 2)
				asistencia = 17;
			
			if (asistencia == 1)
				asistencia = 8;
			
			if (asistencia >= 70)
				estado = "Obtiene certificado";
			
			if (asistencia < 70)
				estado = "Sin certificado";
			
			
			System.out.println("-----------------------------");
			System.out.println(">>>> R E S U L T A D O S <<<<");
			System.out.println("-----------------------------");
			System.out.println("Promedio: " + promedio);
			System.out.println("Asistencia: " + asistencia + "%");
			System.out.println("Estado: " + estado);
			sc.nextLine();
			
			System.out.print("\n¿Desea registrar otro participante <S/N>?");
			System.out.print("\n>>> ");
			continuar = sc.nextLine();
		}
		
		System.out.println("\n-----------------------");
		System.out.println(">>>> R E S Ú M E N <<<<");
		System.out.println("-----------------------");
		System.out.println("Número de alumnos: " + nr);
		System.out.println("Mayor promedio: " );
		System.out.println("Menor promedio: ");
		System.out.println("Número de alumnos certificados: ");
		System.out.println("Numero de alumnos sin certificado: ");
		

	}

}
