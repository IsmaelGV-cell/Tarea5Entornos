package Ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


class Ejercicio2Test {
	
	Ejercicio2 test = new Ejercicio2();

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("---Inicio de las pruebas---");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("---Final de las pruebas---");
	}

	@Test
	void testEj2() {
		Ejercicio2 test = new Ejercicio2();
		assertEquals(6, test.ej2(0, 4, 3));
		assertEquals(4, test.ej2(0, 4, 1));
		assertEquals(6, test.ej2(0, 6, 3));
		assertEquals(6, test.ej2(2, 4, 3));
	}

}
