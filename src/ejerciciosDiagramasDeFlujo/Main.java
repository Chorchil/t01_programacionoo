package ejerciciosDiagramasDeFlujo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Primer ejercicio
		System.out.println("Ingrese dos numeros: ");
		Scanner teclado=new Scanner(System.in);
		int A= teclado.nextInt();
		System.out.println("El primer numero ingresado es: "+A);
		int B= teclado.nextInt();
		System.out.println("El segundo numero ingresado es: "+B);
		int S= A+B;
		int R= A-B;
		int P= A*B;
		double D= A/B;
		System.out.println("La suma es: " +S);
		System.out.println("La resta es: " +R);
		System.out.println("La multiplicacion es: " +P);
		System.out.println("La division es: " +D);
		
	
		

		
	}

}
