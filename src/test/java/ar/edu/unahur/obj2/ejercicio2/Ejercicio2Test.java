
import ar.edu.unahur.obj2.ejercicio1.NrosMayores;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio2Test {
    @Test
    public void buscarNrosMayores() {
        NrosMayores nros = new NrosMayores();
        List<Integer> lista = nros.buscar(10, new ArrayList<>( Arrays.asList(2, 5, 7, 11, 6, 8, 9, 18, 15, 20) ));
        List<Integer> resultados = new ArrayList<>(Arrays.asList(11, 18, 15, 20));
        Assert.assertEquals(lista, resultados);
    }
}
