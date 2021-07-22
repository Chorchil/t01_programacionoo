package ejerciciosDiagramasDeFlujo;
import java.util.Scanner;
public class MainSegundoEjercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese un numero: ");
		Scanner lector= new Scanner(System.in);
		int Numero= lector.nextInt();
		//condicional
		if(Numero==1) {
			System.out.println("El numero es correcto");
		}
		else {
			System.out.println("El numero es incorrecto");
			System.out.println("El numero es: "+Numero);
		}
		
	}

}
