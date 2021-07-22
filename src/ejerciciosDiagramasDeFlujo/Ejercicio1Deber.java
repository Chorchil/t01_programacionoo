package ejerciciosDiagramasDeFlujo;
import java.util.Scanner;
public class Ejercicio1Deber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector=new Scanner (System.in);
		System.out.println("Ingrese los numeros a dividir");
		int A=lector.nextInt();
		int B=lector.nextInt();
		int D=A/B;
		if(B==0) {
			System.out.println("La division es imposible!!");
		}
		else {
			System.out.println("La division es: " +D);
		}
		
	}

}
