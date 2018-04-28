/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc192;

/**
 *
 * @author ice
 */
public class Pessoa {
    String tipo;
    String nome;
    Integer tempo; //em semanas
    String evento;

    public Pessoa(String tipo, String nome, Integer tempo) {
        this.tipo = tipo;
        this.nome = nome;
        this.tempo = tempo;
        
    }

    public Pessoa(String tipo, String nome, Integer tempo, String evento) {
        this.tipo = tipo;
        this.nome = nome;
        this.tempo = tempo;
        this.evento = evento;
    }
    
    

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public Integer getTempo() {
        return tempo;
    }

    public void setTempo(Integer tempo) {
        this.tempo = tempo;
    }

    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
        
}
