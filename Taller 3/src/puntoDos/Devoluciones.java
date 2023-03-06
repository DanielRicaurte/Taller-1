package puntoDos;

public class Devoluciones {

	public void objetos() {
		String s1 = "ABC"; 
		String s2 = new String("DEF"); 
		String s3 = "AB" + "C"; 
		
		System.out.print("\n Punto 2: \n");
		System.out.print(s1.compareTo(s2) + "\n"); //Devuelve el numero de caracteres identicos
		System.out.print(s2.equals(s3)  + "\n"); //Devuelve la coincidencia de los String en true o false
		System.out.print((s3==s1) + "\n"); //Devuelve la coincidencia de los String en true o false
		System.out.print(s2.compareTo(s3)  + "\n");//Devuelve el numero de caracteres identicos
		System.out.print(s3.equals(s1)  + "\n"); //Devuelve la coincidencia de los String en true o false
	}
	
}
