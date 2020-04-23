package ar.edu.unahur.obj2.ejercicio5;
import ar.edu.unahur.obj2.ejercicio1.ContadorLetras;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio5Test {
    @Test
    public void contadorLetras(){
        ContadorLetras prueba = new ContadorLetras("nananaHeyJude");
        prueba.contarLetras();
        List<Integer> resultado = new ArrayList<>(Arrays.asList(
                3, 3, 3, 3, 3, 3, 1, 2, 1, 1, 1, 1, 2));
        Assert.assertEquals(prueba.visualizarRecuento(), resultado);
    }
}
