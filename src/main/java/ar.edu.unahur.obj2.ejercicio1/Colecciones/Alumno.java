package ar.edu.unahur.obj2.ejercicio1.Colecciones;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String nombre, apellido, email;
    List<Asignatura> asignaturas = new ArrayList<>();
    public Alumno(String nombre, String apellido, String email){
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }
    public void matricular(Asignatura asig){
        asignaturas.add(asig);
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    public String getEmail() {
        return this.email;
    }
    public void getAsignaturas(){
        for (Asignatura unaAsignatura:
             asignaturas) {
            System.out.println(unaAsignatura.nombre);
        }
    }
    public void datosAlumno() {
        System.out.println(getNombre()+" "+getApellido()+" - "+ getEmail());
    }
}
