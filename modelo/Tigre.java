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
public class Tigre extends Felino {
    
    private String cor;

    public Tigre() {
    }
    
    public Tigre(String cor, String comida, String habitat) {
         super(comida, habitat);
         this.cor = cor;
    }
    
    @Override
    public void MakeNoise(){
        System.out.println("Urra");
    }
    @Override
    public void movimentar(){
        System.out.println("caminha Tigre");
    }
}
    
