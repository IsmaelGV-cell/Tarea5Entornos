package Ejercicio5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Ejercicio2.Ejercicio2;

class Ejercicio5Test {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testEj5() {
		Ejercicio5 test = new Ejercicio5();
		assertEquals(1, test.ej5(5, 4));
		assertEquals(2, test.ej5(2, 4));
		assertEquals(1, test.ej5(1, 1));
	}

}
