package ar.edu.unahur.obj2.ejercicio1.Colecciones;

import java.util.List;

public class Ticket {
    List<LineaTicket> lineasTicket;

    public static void main(String[] args) {

    }
    public void agregarATicket(String nombreProducto, double precioUnidad, int cantidadUnidades){
        lineasTicket.add(new LineaTicket(nombreProducto, precioUnidad, cantidadUnidades));
    }

    public int totalLineas(){
        return lineasTicket.size();
    }
    public void listado(){
        lineasTicket.forEach(producto -> System.out.println(
                producto.cantidadUnidades+" | "+producto.nombreProducto+" |"+"$ "+producto.precioUnidad));
        System.out.println(totalLineas());
    }
}
