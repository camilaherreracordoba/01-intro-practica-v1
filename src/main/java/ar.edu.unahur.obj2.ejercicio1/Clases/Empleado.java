package ar.edu.unahur.obj2.ejercicio1.Clases;

public abstract class Empleado {
    int dni;
    String nombre, apellido, email;
    double sueldoBase;

    public Empleado(int dni, String nombre, String apellido, String email, double sueldoBase){
        this.dni= dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.sueldoBase = sueldoBase;
    }

    public abstract double getSueldo();
}
