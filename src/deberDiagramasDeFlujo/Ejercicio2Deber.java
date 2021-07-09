package deberDiagramasDeFlujo;
import java.util.Scanner;
public class Ejercicio2Deber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese dos numeros");
		Scanner lector=new Scanner (System.in);
		int A= lector.nextInt();
		int B= lector.nextInt();
		int M= A%B;
		if(M==0) {
			System.out.println("El numero: "+ A + " es multiplo de; " + B);
		}
		else {
			System.out.println("El numero: "+ A + " no es multiplo de; " + B);

		}
	}

}
