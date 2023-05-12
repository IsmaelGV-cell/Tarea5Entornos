package Ejercicio4;

public class Ejercicio4 {

	public void ej4(int edad) {
		if (edad < 16) {
			System.out.println("Eres demasiado pequeño para conducir y beber");
		} else if (edad < 21) {
			System.out.println("Puedes conducir pero no beber");
		} else {
			System.out.println("Puedes conducir y beber");
		}
	}

}
