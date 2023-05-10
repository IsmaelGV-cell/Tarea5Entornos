package Ejercicio8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Ejercicio5.Ejercicio5;

class Ejercicio8Test {

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
	void testEj8() {
		Ejercicio8 test = new Ejercicio8();
		assertEquals(2, test.ej8(2, 4));
		assertEquals(2, test.ej8(1, 2));
		assertEquals(1, test.ej8(4, 2));
	}

}
