/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg;

import java.util.Random;

/**
 *
 * @author msousa
 */
public class Guardiao extends Inimigo{
        
    private int danoMagico;

    public Guardiao(String name, int maxHp, int xp, int dano, int danoMagico) {
        super(name, maxHp, xp, dano);
        this.danoMagico = danoMagico;
    }
    
    @Override
     public int getmaxHp(){ 
        return super.getmaxHp(); 
    } 
    
    @Override
    public String getname(){ 
        return super.getname(); 
    }    
    
    @Override
    public int getdano(){ 
        return super.getdano(); 
    }
    
    @Override
    public int gethp(){ 
        return hp; 
    }
    
    @Override
    public int ataque() {
    Random rand = new Random();
    int ataque = rand.nextInt(this.dano);
    return ataque;
    }
    
    public int getDanoMagico() {
        return danoMagico;
    }
    
    
}