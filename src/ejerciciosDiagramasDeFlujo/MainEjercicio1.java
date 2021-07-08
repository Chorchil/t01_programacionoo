package ejerciciosDiagramasDeFlujo;
import java.util.Scanner;
public class MainEjercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector=new Scanner(System.in);
		System.out.println("Ingrese el sueldo:");
		int S=lector.nextInt();
		int B;
		if(S<300) {
			B=40;
		}
		else {
			B=0;
		}
		System.out.println("Su bonificacion es: "+ B);
		

	}

}
