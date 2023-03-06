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
		Formas fm = new Formas();
		fm.tresFormas();
	}
	
	public static void puntoDos() {
		Devoluciones dv = new Devoluciones();
		dv.objetos();
	}
	
	public static void puntoTres() {
		Declaraciones dc = new Declaraciones();
		dc.instancia();
	}
}
