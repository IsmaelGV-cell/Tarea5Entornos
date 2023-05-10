package Ejercicio3;

import static org.junit.Assert.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class Ejercicio3Test {

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
		Ejercicio3 test = new Ejercicio3();

		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));

		test.ej3(1);

		assertEquals("1\n", outContent.toString());

	}
	
	@Test
	void testEj21() {
		Ejercicio3 test = new Ejercicio3();

		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));

		test.ej3(0);

		assertEquals("", outContent.toString());

	}

}
