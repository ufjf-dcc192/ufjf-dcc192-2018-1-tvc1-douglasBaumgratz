package br.ufjf.dcc192;

import java.util.ArrayList;
import java.util.List;

public class ListaEventos {

    private static List<Evento> listaEventos;

    public static List<Evento> getInstance() {

        if (listaEventos == null) {
            listaEventos = new ArrayList<>();
            listaEventos.add(new Evento(1, "Evento A", 50));
            listaEventos.add(new Evento(2, "Evento W", 100));
            listaEventos.add(new Evento(1, "Evento Y", 10));

        }
        return listaEventos;

    }

}
