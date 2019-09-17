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
public class Leao extends Felino{
    
    private String origem;

    public Leao() {
    }
    
    public Leao(String origem, String comida, String habitat) {
         super(comida, habitat);
         this.origem = origem;
    }
    
    @Override
    public void MakeNoise(){
        System.out.println("ruge");
    }
    @Override
    public void movimentar(){
        System.out.println("caminha Leao");
    }
}

