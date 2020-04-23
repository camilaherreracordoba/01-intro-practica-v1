package ar.edu.unahur.obj2.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class NrosMayores {
    public static void main(String[] args) {

    }
    public List<Integer> buscar(int unnro, List<Integer> anArray) {
        List<Integer> lista = new ArrayList<>();
        for(int i = 0; i <anArray.size(); i++){
            if (anArray.get(i) > unnro) {
                lista.add(anArray.get(i));
            }
        }
        return lista;
    }
}
