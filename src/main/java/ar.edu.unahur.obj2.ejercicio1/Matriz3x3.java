package ar.edu.unahur.obj2.ejercicio1;

import java.util.Scanner;

public class Matriz3x3 {



    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        Scanner entradaMatriz = new Scanner(System.in);
        for(int i = 0; i<3; i++){
            for(int ii= 0; ii <3;ii++){
                System.out.println("ingrese un nro ");
                matriz[i][ii] = entradaMatriz.nextInt();
            }
        }
        for(int i = 0; i<3; i++){
            System.out.println(" ");
            for(int ii= 0; ii < matriz[i].length;ii++){
                System.out.print(matriz[i][ii]);
                if (ii != matriz[i].length-1) System.out.print("\t");
            }
        }
    }
}
