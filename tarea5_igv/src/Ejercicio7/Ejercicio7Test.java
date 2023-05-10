package Ejercicio7;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Ejercicio7Test {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testEj7() {
        String input = "-1\n3\n0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Ejercicio7 test = new Ejercicio7();
        test.ej7(-1, 6);
        assertEquals("Escribe un numero. 0 Para salir\n"
        		+ "Número fuera de rango\n"
        		+ "Escribe un numero. 0 Para salir\n"
        		+ "Número dentro del rango\n"
        		+ "Escribe un numero. 0 Para salir\n"
        		+ "Número dentro del rango\n"
        		+ "", outContent.toString());

        input = "-1\n0\n";
        in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        outContent.reset();
        test.ej7(-2, -1);
        assertEquals("Escribe un numero. 0 Para salir\n"
        		+ "Número dentro del rango\n"
        		+ "Escribe un numero. 0 Para salir\n"
        		+ "Número fuera de rango\n"
        		+ "", outContent.toString());

        input = "6\n8\n0\n";
        in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        outContent.reset();
        test.ej7(-1, 6);
        assertEquals("Escribe un numero. 0 Para salir\n"
        		+ "Número dentro del rango\n"
        		+ "Escribe un numero. 0 Para salir\n"
        		+ "Número fuera de rango\n"
        		+ "Escribe un numero. 0 Para salir\n"
        		+ "Número dentro del rango\n"
        		+ "", outContent.toString());

        input = "3\n0\n";
        in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        outContent.reset();
        test.ej7(5, 4);
        assertEquals("Rango invalido\n"
        		+ "Programa terminado\n"
        		+ "", outContent.toString());
    }

}

