package Ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public void ej7(int x, int y) {
		Scanner sc = new Scanner(System.in);
		int num = -1;
		if (x < y) {
			while (num != 0) {
				System.out.println("Escribe un numero. 0 Para salir");
				num = sc.nextInt();
				if (x < num && num <= y) {
					System.out.println("Número dentro del rango");

				} else {
					System.out.println("Número fuera de rango");
				}
			}
		} else {
			System.out.println("Rango invalido");
			System.out.println("Programa terminado");
			sc.close();
		}
	}

}
