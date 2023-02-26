package conexion;

import puntoUno.*;
import puntoDos.*;
import puntoTres.*;

public class Main {

	public static void main(String[] args) {
		puntoUno();
		puntoDos();
		puntoTres();
	}
	
	public static void puntoUno() {
		Triangulo tr = new Triangulo();
		tr.calcularTriangulo();
	}
	
	public static void puntoDos() {
		Formulas fm = new Formulas();
		fm.formulaA();
		fm.formulaB();
		fm.formulaC();
		fm.formulaD();
		fm.formulaE();
		fm.formulaF();
	}
	
	public static void puntoTres() {
		Viaje vj = new Viaje();
		vj.personas();
	}
}
