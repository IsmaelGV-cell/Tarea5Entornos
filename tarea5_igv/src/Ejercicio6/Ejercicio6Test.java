package Ejercicio6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Ejercicio5.Ejercicio5;

class Ejercicio6Test {

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
	void test() {
		Ejercicio6 test = new Ejercicio6();
		assertEquals(1, test.ej6(6, 4, 5));
		assertEquals(0, test.ej6(5, 4, 6));
		assertEquals(0, test.ej6(6, 5, 4));
		assertEquals(-1, test.ej6(4, 6, 5));
	}

}
