package ar.edu.unahur.obj2.ejercicio1;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
public class Ejercicio1Test {

    @Test
    public void testOrdenar() {
        Ejercicio1 inverso = new Ejercicio1();
        int[] unalista = inverso.ordenar(new int[] {1, 2, 3, 4, 5 , 6, 7, 8, 9, 10});
        assertEquals(unalista, new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1});

    }
}