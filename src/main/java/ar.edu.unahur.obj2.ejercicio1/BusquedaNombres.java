package ar.edu.unahur.obj2.ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BusquedaNombres{
    public static void main(String[] args) {
        List<String> nombresCompanieros = new ArrayList<>();
        Scanner cantidad = new Scanner(System.in);
        Scanner nombres = new Scanner(System.in);
        Scanner letra = new Scanner(System.in);

        System.out.println("cantidad de nombres a ingresar: ");
        int cantidadNombres = cantidad.nextInt();

        for (int i = 0; i< cantidadNombres; i++){
            System.out.println("ingrese nombre ");
            nombresCompanieros.add(i, nombres.nextLine());
        }
        String ultima = "0";
        while(!ultima.equals("fin")){
            System.out.println("ingrese una letra: ");
            ultima = letra.nextLine();
            if(!ultima.equals("fin")){
                for(String i: nombresCompanieros){
                    if(i.charAt(0) == ultima.charAt(0)){
                        System.out.println(i);
                    }
                }
            }
        }
    }
}
