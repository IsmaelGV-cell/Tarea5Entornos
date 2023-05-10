package Ejercicio4;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Ejercicio4Test {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("---Inicio de las pruebas---");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("---Final de las pruebas---");
	}

	@Test
	void testEj4() {
		Ejercicio4 test = new Ejercicio4();

		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));

		test.ej4(22);

		assertEquals("Puedes conducir y beber\n", outContent.toString());

		outContent.reset();

		test.ej4(18);

		assertEquals("Puedes conducir pero no beber\n", outContent.toString());
		
		outContent.reset();
		
		test.ej4(14);

		assertEquals("Eres demasiado pequeño para conducir y beber\n", outContent.toString());
	}

}
