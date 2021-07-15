package diagramas.de.flujo;

import java.util.Scanner;

public class Main5FiguraInvertida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese el número de filas");
		Scanner lector=new Scanner(System.in);
		int n=lector.nextInt();
		
		for(int fila=n;fila>=1; fila--) {
			
			System.out.println();
			
			for(int ast=1;ast<=fila;ast++){
				
				System.out.print("*");
			}
			
			
		}
	}

}
