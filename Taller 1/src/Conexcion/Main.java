package Conexcion;

import puntoCinco.*;
import puntoSiete.*;

public class Main {

	public static void main(String[] args) {
		Student st = new Student();

		System.out.print(st.name + "\n");
		System.out.print(st.id + "\n");
		System.out.print(st.status + "\n");
		
		puntoSiete();
	}
	
	public static void puntoSiete() {
		
		Person p1 = new Person(46, "Raul");
		Person p2 = new Person(22, "Daniel");
		
		if(p1.getAge() == p2.getAge())
		{
			System.out.println(p1.getName()+" Tiene la misma edad "+p2.getName());
		}
		else
		{
			System.out.println(p1.getName()+" No tiene la misma edad "+p2.getName());
		}
	}
}
