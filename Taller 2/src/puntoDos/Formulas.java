package puntoDos;

import java.util.Scanner;

public class Formulas {

	public void formulaA() {
		Scanner entrada = new Scanner(System.in);
		
		double x = 0;
		double A = 0;
		
		System.out.print("La Formula a resolver es:√X^5−6/4 \n");
		System.out.print("Ingrese el valor de X para resolver la Formular: \n");
		x = entrada.nextInt();
		
		double exponente = Math.pow(x, 5);
		x = exponente-6;
		double raiz = Math.sqrt(x);
		A = raiz/4;
		
		System.out.print("El valor de la Formula A es: \n" + A + "\n");
	}
	
	public void formulaB() {
		Scanner entrada = new Scanner(System.in);
		
		double x = 0;
		double y = 0;
		double B = 0;
		
		System.out.print("La formula a resolver es: X^Y-6^X \n");
		System.out.print("Ingrese el valor de X: \n");
		x = entrada.nextInt();
		System.out.print("Ingrese el valor de Y: \n");
		y = entrada.nextInt();
		
		double exponenteX = Math.pow(x, y);
		double exponenteY = Math.pow(6, x);
		B = exponenteX - exponenteY;
		
		System.out.print("El valor de la Formula B es: \n" + B + "\n");
	}
	
	public void formulaC() {
		Scanner entrada = new Scanner(System.in);
		
		double x = 0;
		double z = 0;
		double C = 0;
		
		System.out.print("La formula a resolver es: 4cos(z/5)-sinX^2 \n");
		System.out.print("Ingrese el valor de X: \n");
		x = entrada.nextInt();
		System.out.print("Ingrese el valor de z: \n");
		z = entrada.nextInt();
		
		double division = z/5;
		double cosD = Math.cos(division);
		double exponenteX = Math.pow(x, 2);
		double sinX = Math.sin(exponenteX);
		C = 4*cosD-sinX;
		
		System.out.print("El valor de la Formula C es:" + C + "\n");
	}
	
	public void formulaD() {
		Scanner entrada = new Scanner(System.in);
		
		double x = 0;
		double y = 0;
		double D = 0;
		
		System.out.print("La formula a resolver es: x^4-√6x-y^3 \n");
		System.out.print("Ingrese el valor de X: \n");
		x = entrada.nextInt();
		System.out.print("Ingrese el valor de y: \n");
		y = entrada.nextInt();
		
		double exponenteX = Math.pow(x, 4);
		double exponenteY = Math.pow(y, 3);
		double multiplicacion = 6*x;
		double resta = multiplicacion-exponenteY;
		double raiz = Math.sqrt(resta);
		D = exponenteX-raiz;
		
		System.out.print("El valor de la Formula D es:" + D + "\n");
	}
	
	public void formulaE() {
		Scanner entrada = new Scanner(System.in);
		
		double x = 0;
		double y = 0;
		double E = 0;
		
		System.out.print("La formula a resolver es: 1/y-(1/x-2*y) \n");
		System.out.print("Ingrese el valor de X: \n");
		x = entrada.nextInt();
		System.out.print("Ingrese el valor de y: \n");
		y = entrada.nextInt();
		
		double division = 1/(x-2*y);
		double resta = y-division;
		E = 1/resta;
		
		System.out.print("El valor de la Formula E es:" + E + "\n");
	}
	
	public void formulaF() {
		Scanner entrada = new Scanner(System.in);
		
		double x = 0;
		double F = 0;
		
		System.out.print("La formula a resolver es: 7(cos(√5-sin√3*x-4)) \n");
		System.out.print("Ingrese el valor de X: \n");
		x = entrada.nextInt();
		
		double raizX = Math.sqrt(3*x-4);
		double sin = Math.sin(raizX);
		double raiz5 = Math.sqrt(5-sin);
		double cos = Math.cos(raiz5);
		F=7*cos;
		
		System.out.print("El valor de la Formula F es:" + F + "\n");
	}
}
