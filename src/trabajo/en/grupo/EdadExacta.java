package trabajo.en.grupo;

import java.util.Scanner;

public class EdadExacta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Se ingresa por teclado 3 n�meros correspondientes a la fecha de nacimiento de
		 * la persona, el primer n�mero es el d�a, el segundo n�mero es el mes y el
		 * tercero n�mero es el a�o de nacimiento, de la misma manera se debe ingresar
		 * la fecha actual.
		 */
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese la fecha actual: ");
		int da = in.nextInt();
		int ma = in.nextInt();
		int aa = in.nextInt();

		System.out.println("Ingrese su fecha de nacimiento dia en numeros Dia/Mes/A�o:");

		int d = in.nextInt();
		if (d > 0 && d <= 31) {
		} else {
			System.out.println("El dia esta mal puesto");
		}
		int m = in.nextInt();
		if (m > 0 && m <= 12) {
		} else {
			System.out.println("El mes esta mal puesto");
		}
		if (d > da) {
			int meses = m - 1;
			int dias = 31 - (d - da);
			System.out.println("Dias: " + dias);
		}
		if (m == 2) {
			int mes = m - 1;
			int dia = 29 - (d - da);
			System.out.println("Dias: " + dia);
		}

		int a = in.nextInt();
		int at = aa - a;
		if (m > ma) {
			int a�o = at - 1;
			int tm = 12 - (m);
			System.out.println("a�os: " + a�o);
			System.out.println("Meses: " + tm);
		} else {
			int tm = ma - m;
			System.out.println("A�os: " + at);
			System.out.println("Meses: " + (tm - 1));

		}

		if ((a % 4 == 0) && (a % 100 != 0 || a % 400 == 0)) {
			System.out.println(a + " es un a�o bisiesto ");
		} else {
			System.out.println(a + " no es un a�o bisiesto");
		}
		if ((aa % 4 == 0) && (aa % 100 != 0 || aa % 400 == 0)) {
			System.out.println(aa + " es un a�o bisiesto ");

		} else {
			System.out.println(aa + " no es un a�o bisiesto");
		}

	}

}
