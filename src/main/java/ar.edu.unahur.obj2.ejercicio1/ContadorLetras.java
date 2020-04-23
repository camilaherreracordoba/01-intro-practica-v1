package ar.edu.unahur.obj2.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class ContadorLetras {
    String texto;
    List<Integer> letrasRepetidas = new ArrayList<>();
    public ContadorLetras(String texto) {
        this.texto = texto;
    }

    public void contarLetras(){
        int contadorAux = 0;
        for (int i =0; i< texto.length(); i++){
            for(int ii = 0; ii < texto.length(); ii++){
                if(texto.charAt(ii) == texto.charAt(i)){
                    contadorAux+=1;
                }
            }
            letrasRepetidas.add(contadorAux);
            contadorAux = 0;
        }
    }

    public List<Integer> visualizarRecuento() {
        return letrasRepetidas;
    }
}
