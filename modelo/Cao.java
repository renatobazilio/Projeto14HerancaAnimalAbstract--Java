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
public class Cao extends Canino{
    
    private double tamanho;

    public Cao() {
    }
    
    public Cao(double tamanho, String comida, String habitat) {
         super(comida, habitat);
         this.tamanho = tamanho;
    }
    
    @Override
    public void MakeNoise(){
        System.out.println("Late");
    }
    @Override
    public void movimentar(){
        System.out.println("caminha Cao");
    }
}
