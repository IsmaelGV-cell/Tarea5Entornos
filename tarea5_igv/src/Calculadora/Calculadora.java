package Calculadora;

/**
 * Clase que funciona como una calculadora.
 * Realiza operaciones como suma, resta, multiplicación y división.
 * La clase contiene dos variables de valores enteros. 
 * @author Juan Simón
 */
public class Calculadora {

	/**
	 * Método constructor por defecto.
	 */
	public Calculadora() {
		// Constructor vacío
	}

	/**
	 * Realiza la suma entre dos números enteros.
	 * @param num1 El primer número entero.
	 * @param num2 El segundo número entero.
	 * @return El resultado de la suma.
	 */
	public int suma(int num1, int num2) {
		return num1 + num2;
	}

	/**
	 * Realiza la resta entre dos números enteros.
	 * @param num1 El primer número entero.
	 * @param num2 El segundo número entero.
	 * @return El resultado de la resta.
	 */
	public int resta(int num1, int num2) {
		return num1 - num2;
	}

	/**
	 * Realiza la multiplicación entre num1 y num2.
	 * @param num1 El primer número entero.
	 * @param num2 El segundo número entero.
	 * @return El resultado de la multiplicación.
	 */
	public int multiplica(int num1, int num2) {
		return num1 * num2;
	}

	/**
	 * Realiza división entre num1 y num2.
	 * Si el divisor es cero, lanza una excepción de tipo ArithmeticException.
	 * @param num1 El dividendo.
	 * @param num2 El divisor.
	 * @return El resultado de la división.
	 * @throws lanza una excepción de tipo ArithmeticException.
	 */
	public int divide(int num1, int num2) {
		if (num2 == 0)
			throw new ArithmeticException("NO PUEDES DIVIDIR POR CERO, MELÓN");
		return num1 / num2;
	}

	private int valor1;
	private int valor2;
}

