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
public class Evento {

    Integer numSemanas;
    String nome;
    Integer limitePessoas;    

    public Evento(Integer numSemanas, String nome, Integer limite) {        
        this.numSemanas = numSemanas;
        this.nome = nome;
        this.limitePessoas = limite;
    }

    public Integer getLimitePessoas() {
        return limitePessoas;
    }

    public void setLimitePessoas(Integer limitePessoas) {
        this.limitePessoas = limitePessoas;
    }

    
    public Integer getLimite() {
        return limitePessoas;
    }

    public void setLimite(Integer limite) {
        this.limitePessoas = limite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumSemanas() {
        return numSemanas;
    }

    public void setNumSemanas(Integer numSemanas) {
        this.numSemanas = numSemanas;
    }

    public void decrementarLimite() {
        this.limitePessoas = this.limitePessoas--;
    }
 

}
