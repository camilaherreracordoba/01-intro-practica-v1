package ar.edu.unahur.obj2.ejercicio1;

import java.util.Random;

public class Matriz10x10 {
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];
        for(int i = 0; i<10; i++){
            for(int ii= 0; ii <10;ii++){
                Random r = new Random();
                int aleatorio = r.nextInt(100);
                matriz[i][ii] = aleatorio;
            }
        }
        for(int i = 0; i<10; i++){
            System.out.println(" ");
            for(int ii= 0; ii < matriz[i].length;ii++){
                System.out.print(matriz[i][ii]);
                if (ii != matriz[i].length-1) System.out.print("\t");
            }
        }
    }
}
