package puntoUno;

import java.util.Scanner;

public class Triangulo {

	public void calcularTriangulo() {

		try (Scanner entrada = new Scanner(System.in)) {
			double altura = 0;
			double base = 0;
			double A = 0;

			System.out.print("Ingrese la Altura del Triangulo: \n");
			altura = entrada.nextDouble();
			System.out.print("Ingrese la Base del Triangulo: \n");
			base = entrada.nextDouble();

			A = (base * altura) / 2;

			System.out.print("La Superficie del triangulo es:" + A);
		}
	}
}
