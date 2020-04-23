package ar.edu.unahur.obj2.ejercicio1.Clases;

public class Vendedor extends Empleado {
    double porcentajeComision, totalVentas;
    public Vendedor(int dni, String nombre, String apellido, String email, double sueldoBase, double porcentajeComision, double totalVentas){
        super(dni, nombre, apellido, email, sueldoBase);
        this.porcentajeComision = porcentajeComision;
        this.totalVentas = totalVentas;
    }

    @Override
    public double getSueldo(){
        return sueldoBase + (porcentajeComision*totalVentas/100);
    }

}
