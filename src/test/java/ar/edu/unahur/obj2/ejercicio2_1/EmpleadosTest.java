package ar.edu.unahur.obj2.ejercicio2_1;

import ar.edu.unahur.obj2.ejercicio1.Clases.Administrativo;
import ar.edu.unahur.obj2.ejercicio1.Clases.Empleado;
import ar.edu.unahur.obj2.ejercicio1.Clases.Vendedor;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EmpleadosTest {
    Empleado vendedor1, vendedor2, adminis1, adminis2;
    @BeforeMethod
    public void setUp() {
        vendedor1 = new Vendedor(14741369, "Marcos", "Perez",
                "marcosP89@gmail.com", 45000, 35, 40);
        vendedor2 = new Vendedor(27741369, "Ester", "Rios",
                "EsterRios77@gmail.com", 50000, 40, 55);
        adminis1 = new Administrativo(35710649, "Yamila", "Arroyo",
                "yamila4950@outlook.com", 60000, 30, 95);
        adminis2 = new Administrativo( 41704920,"Mario", "Rosas",
                "RojasMario75@gmail.com", 60000, 35, 110);
    }
    @Test
    public void testVendedor() {
        Assert.assertEquals(vendedor1.getSueldo(), 45014.0);
    }
    @Test
    public void testAdministrador(){
        Assert.assertEquals(adminis1.getSueldo(), 88421.05263157895);
    }
}
