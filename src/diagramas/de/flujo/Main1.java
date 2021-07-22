package diagramas.de.flujo;
import java.util.Scanner;
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Se ingreso por teclado un numero y se desea imprimir los siguientes 5 nunmeros
		System.out.println ("ingrese un numero");
		Scanner entrada=new Scanner(System.in);
		int N= entrada.nextInt();
		int i;
		for(i=N+1;i<=N+5;i++) {
			System.out.println("los numeros son " + i);
			
		}
	}

}
