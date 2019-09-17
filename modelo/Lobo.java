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
public class Lobo extends Canino {
    
    private double peso;

    public Lobo() {
    }
    
    public Lobo(double peso, String comida, String habitat) {
         super(comida, habitat);
         this.peso = peso;
    }
    
    @Override
    public void MakeNoise(){
        System.out.println("Uiva");
    }
    @Override
    public void movimentar(){
        System.out.println("caminha Lobo");
    }
}

