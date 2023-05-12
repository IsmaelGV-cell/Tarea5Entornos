package Selection;

/**
 * Esta es una clase que sirve para ordenar matrices.
 */
public class Ordenacion {

	/**
	 * Ordena la matriz de menor a mayor.
	 * @param array La matriz de enteros.
	 */
	public void ordenarMatriz(int[] array) {
		for (int i = array.length - 1; i > 0; i--) {
			int maxValue = 0;
			for (int j = 0; j < i; j++) {
				if (array[j + 1] > array[maxValue]) {
					maxValue = j + 1;
				}
			}
			intercambio(array, i, maxValue);
			imprimirMatriz(array);
		}
	}

	/**
	 * Ordena la matriz de menor a mayor.
	 * @param numbers La matriz de enteros a ordenar.
	 * @return La matriz de enteros ordenada.
	 */
	public int[] ordenarMatriz2(int[] numbers) {
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] > numbers[j]) {
					int auxiliar = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = auxiliar;
				}
			}
		}
		return numbers;
	}

	/**
	 * Imprime los elementos de una matriz.
	 * @param array La matriz que va a imprimir.
	 */
	public void imprimirMatriz(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%d \t", array[i]);
		}
		System.out.println();
	}

	/**
	 * Cambia dos elementos dentro de una matriz.
	 * @param array La matriz donde se haran los cambios.
	 * @param a     El índice del primer elemento a intercambiar.
	 * @param b     El índice del segundo elemento a intercambiar.
	 */
	public void intercambio(int[] array, int a, int b) {
		int value = array[b];
		array[b] = array[a];
		array[a] = value;
	}
}
