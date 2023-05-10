package Ejercicio5;

public class Ejercicio5 {

	public int ej5(int x, int y) {

		while (x != y) {
			if (x > y) {
				x = x - y;
			} else {
				y = y - x;
			}
		}
		return x;
	}

}
