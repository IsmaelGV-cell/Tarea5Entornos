package Ejercicio1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class Ejercicio1Test {
	
	Ejercicio1 test = new Ejercicio1();

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("---Inicio de las pruebas---");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("---Final de las pruebas---");
	}
	
	@Test
	void testEje1() {
		assertEquals(4, test.eje1(2, 6, 1));
        assertEquals(6, test.eje1(2, 6, 3));
        assertEquals(4, test.eje1(2, 4, 3));
        assertEquals(4, test.eje1(0, 4, 3));
	}

}
