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
public class Gato extends Felino{
    
    private String raca;

    public Gato() {
    }
    
    public Gato(String raca, String comida, String habitat) {
         super(comida, habitat);
         this.raca = raca;
    }
    
    @Override
    public void MakeNoise(){
        System.out.println("Mia");
    }
    @Override
    public void movimentar(){
        System.out.println("caminha Gato");
    }
}
