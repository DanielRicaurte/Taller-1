package conexion;

import puntoDos.Formulas;
import puntoUno.*;

public class Main {

	public static void main(String[] args) {
		puntoUno();
		puntoDos();
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
}
