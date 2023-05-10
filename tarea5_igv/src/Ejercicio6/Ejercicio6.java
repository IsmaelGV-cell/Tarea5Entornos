package Ejercicio6;

public class Ejercicio6 {

	public int ej6(int y, int x, int num) {
		if (x < y)
			if (x <= num && num <= y) {
				return 1;
			} else {
				return 0;
			}
		else {
			return -1;
		}

	}
}
