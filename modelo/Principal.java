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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Animal animal = new Animal("Geral", "Urbano, Cativeiro ou Silvestre");
        //Canino canino = new Canino("Carne ou Racao", "Urbano  Cativeito ou Silvestre");
        //Felino felino = new Felino("Carne ou Racao", "Urbano  Cativeiro ou Silvestre");
        Cao cao = new Cao(1.00, "Carne ou Racao", "Cativeiro");
        Lobo lobo = new Lobo (60, "Carne", "Silvestre");
        Gato gato = new Gato("Varias", "Racao", "Urbano");
        Leao leao = new Leao("Africa do Sul", "Carne", "Silvestre");
        Tigre tigre = new Tigre ("Pardo, Preto ou Albino", "Carne", "Silvestre");
        Siames siames =new Siames();
        
        System.out.println("\nAnimal Cao \nComida: "+ cao.getComida() + "\nHabitat: "+ cao.getHabitat());
        cao.MakeNoise();
        cao.movimentar();
        
        System.out.println("\n");
        lobo.MakeNoise();
        lobo.movimentar();
        
        System.out.println("\n");
        gato.MakeNoise();
        gato.movimentar();
        
        System.out.println("\n");
        leao.MakeNoise();
        leao.movimentar();
        
        System.out.println("\n");
        tigre.MakeNoise();
        tigre.movimentar();
        
        System.out.println("\n");
        siames.MakeNoise();
        siames.movimentar();
    }
    
}
