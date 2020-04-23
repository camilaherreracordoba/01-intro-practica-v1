package ar.edu.unahur.obj2.ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Grafico {
    public static void main(String[] args) {
        double maxima = 0, minima = 0, laMedia = 0;
        List<Double> temperaturas = new ArrayList<>();


        for (int i= 0; i < 5; i++){
            Scanner entrada = new Scanner(System.in);
            System.out.println("temperatura: ");
            double aux = entrada.nextDouble();
            temperaturas.add(i, aux);
            if(aux > maxima){
                maxima = aux;
            }
            if(aux <= minima) {
                minima = aux;
            }
        }
        for(int i = 0; i < temperaturas.size(); i++){
            double aux = temperaturas.get(i);
            System.out.print(i+" ");

            for(int j=0; j<(int)aux; j++){
                System.out.print("*");
            }
            if(aux == minima){
                System.out.println(aux + " -> Mínima");
            }
            else {
                System.out.println(aux);
            }
            if(aux == maxima){
                System.out.println(aux + " -> Máxima");
            }
            else {
                System.out.println(aux);
            }

        }
        for (int i = temperaturas.size()-1; i > 0; i-- ){
            laMedia += temperaturas.get(i);
        }
        laMedia = laMedia/temperaturas.size();
        System.out.print("Media: "+laMedia);

    }

}
