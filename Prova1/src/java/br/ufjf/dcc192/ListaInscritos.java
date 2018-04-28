package br.ufjf.dcc192;

import java.util.ArrayList;
import java.util.List;

public class ListaInscritos {

    private static List<Pessoa> listaInscritos;

    public static List<Pessoa> getInstance() {

        if (listaInscritos == null) {
            listaInscritos = new ArrayList<>();
            listaInscritos.add(new Pessoa("intercambio", "João",2));

        }
        return listaInscritos;

    }

}
