package ar.edu.unahur.obj2.ejercicio1.Clases;

public class Administrativo extends Empleado{
    double hsExtra, hsMes;

    public Administrativo(int dni, String nombre, String apellido, String email, double sueldoBase, double hsExtra, double hsMes){
       super(dni, nombre, apellido, email, sueldoBase);
       this.hsExtra = hsExtra;
       this.hsMes = hsMes;
    }
    @Override
    public double getSueldo(){
        return sueldoBase*((hsExtra * 1.5)+hsMes) / hsMes;
    }

}
