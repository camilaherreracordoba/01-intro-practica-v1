package ar.edu.unahur.obj2.ejercicio1.Colecciones;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Operacion {
    public static void main(String[] args){
        List<Alumno> alumnos = new ArrayList<>();
        Scanner nombreAlumno = new Scanner(System.in);
        Scanner apellidoAlumno = new Scanner(System.in);
        Scanner emailAlumno = new Scanner(System.in);

        Scanner nombreAsignatura = new Scanner(System.in);
        Scanner hsAsignatura = new Scanner(System.in);
        Scanner eleccion = new Scanner(System.in);
        Scanner respuesta = new Scanner(System.in);
        Scanner respuesta2 = new Scanner(System.in);

                Boolean fin = false;
                while(!fin.equals(true)){
                    System.out.println("Elegir");
                    System.out.println("1_ Salir");
                    System.out.println("2_ Agregar un alumno");
                    System.out.println("3_ Matricular al ultimo inscripto");
                    System.out.println("4_ Listar");
                    int ingresoMeno = eleccion.nextInt();
                    switch (ingresoMeno){
                        case 1:
                            fin = true;
                            break;
                        case 2:
                            String ultima = "nada";
                            while(!ultima.equals("no")){
                                System.out.println("¿desea agregar un alumno?(si/no) ");
                                ultima = respuesta.nextLine();
                                if(ultima.equals("si")){
                                    System.out.println("nombre de alumno ");
                                    String nombre = nombreAlumno.nextLine();
                                    System.out.println("apellido de alumno ");
                                    String apellido = apellidoAlumno.nextLine();
                                    System.out.println("email de alumno ");
                                    String email = emailAlumno.nextLine();
                                    Alumno aux = new Alumno(nombre, apellido, email);
                                    aux.datosAlumno();
                                    alumnos.add(aux);
                                }
                            break;
                            }
                        case 3:
                            String ultima2 = "nada";
                            while(!ultima2.equals("no")){
                                System.out.println("matricular estudiante(si/no)");
                                Asignatura aux2;
                                ultima2 = respuesta2.nextLine();
                                if(ultima2.equals("si")){
                                    System.out.println("nombre materia ");
                                    String nombreAsigna = nombreAsignatura.nextLine();
                                    System.out.println("horas ");
                                    int horas = hsAsignatura.nextInt();
                                    aux2 = new Asignatura(nombreAsigna,horas);
                                    Alumno actual = alumnos.get(alumnos.size()-1);
                                    actual.matricular(aux2);
                                }
                            }
                        case (4):
                            for (Alumno a:
                                    alumnos) {
                                a.datosAlumno();
                            }
                            break;
            }
        }
    }
}
