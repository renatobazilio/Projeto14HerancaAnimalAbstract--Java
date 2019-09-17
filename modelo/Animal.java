/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author aluno
 */

//Classe é abstrata quando queremos impedir que
//um objeto seja instanciado dessa classe
//para isso usarei a palavra reservada abstract na 
//declaração da classe
public abstract class Animal {
    
    //atritudos 
    protected String comida;
    protected String habitat;
    
    //contrutores

    public Animal() {
    }

    public Animal(String comida, String habitat) {
        this.comida = comida;
        this.habitat = habitat;
    }
    
    //Getters e Setters

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    
    //metodo makenoise() passou a ser um metodo abstract
    // e portanto não tenho mais a implementação corpo do metodo
    //todo metodo abstrato obrigatoriamente deve ser 
    //implementado nas classes filhos (concretas)
    //para definir um metodo abstratic deveremos colocar
    // a palavra reservada 'abstract' na assinatura do 
    //metodo a colocar um ponto e virgula em bez de abre e fecha
    //as chaves do corpo do metodo
    public abstract void MakeNoise();
    
    public abstract void movimentar();
}
