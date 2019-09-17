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
public abstract class Felino extends Animal {

    public Felino() {
    }
    
    
    
    public Felino(String comida, String habitat) {
        //palavra reservada SUPER
        super(comida, habitat);
    }
    
    @Override
    public void MakeNoise(){
        System.out.println("fazer Barulhgo");
    }
}

