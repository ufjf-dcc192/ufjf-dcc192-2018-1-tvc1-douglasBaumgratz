/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc192;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ice
 */
public class Comunidade {

    List<Evento> listaEventos ;
    List<Pessoa> listaInscritos;

    public Comunidade() {
        listaEventos = new ListaEventos().getInstance();
        listaInscritos = new ListaInscritos().getInstance();
    }

}
