package br.ufjf.dcc192;

import java.util.ArrayList;
import java.util.List;

public class ListaInscritos {

    private static List<Pessoa> listaInscritos;

    public static List<Pessoa> getInstance() {

        if (listaInscritos == null) {
            listaInscritos = new ArrayList<>();
            listaInscritos.add(new Pessoa("intercambio", "João",2,"Evento A"));
            listaInscritos.add(new Pessoa("intercambio", "Silveirinha",2,"Evento W"));
            listaInscritos.add(new Pessoa("anfritrião", "Beatriz",2,"Evento A"));
            listaInscritos.add(new Pessoa("intercambio", "Maria",2,"Evento A"));

        }
        return listaInscritos;

    }

}
