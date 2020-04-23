
package ar.edu.unahur.obj2.ejercicio1;

//import java.util.Arrays;
//import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {

    }

    public int[] ordenar(int[] anArray){
        if(anArray.length == 10) {
            for (int i= 0; i<5; i++){
                intercambiar(anArray, i, anArray.length-1 -i );
            }
        }
        return anArray;
    }

    public void intercambiar(int[] anArray, int indice1, int indice2) {
        int aux = anArray[indice1];
        anArray[indice1] = anArray[indice2];
        anArray[indice2] = aux;
    }
}
