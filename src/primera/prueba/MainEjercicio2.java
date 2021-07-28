package primera.prueba;
import java.util.Scanner;
public class MainEjercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		int SP=0;
		int SI=0;
		int CI=0;
		float PI=0;
		for(int i=0; i!=-1; i++) {
			System.out.println("Ingrese un numero positivo: ");
			int n=entrada.nextInt();
			if(n==-1) {
				i=-2;
			}else if(n%2==0) {
				SP=SP+n;
			}else {
				SI=SI+n;
				CI=CI+n;
				PI=SI/CI;
			}
		}
		System.out.println("La suma de los pares es: " +SP);
		System.out.println("El promedio de los impares es: " +PI);

	}

}
