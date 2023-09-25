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
public class Inimigo { 
        
    private String name; 
    int dano;
    int hp, xp;
    private int maxHp;
        
    public Inimigo(String name, int maxHp, int xp, int dano) { 
        this.name = name; 
        this.maxHp = maxHp; 
        this.hp = maxHp; 
        this.dano = dano; 
        this.xp = xp;
    } 
    
    public int ataque() { 
        Random rand = new Random(); 
        int ataque = rand.nextInt(this.dano); 
        return ataque; 
    }
    
    public int getmaxHp(){ 
        return maxHp; 
    } 
    
    public String getname(){ 
        return name; 
    }    
    
    public int getdano(){ 
        return dano; 
    }
    
    public int gethp(){ 
        return hp; 
    }
    
    public void setHp(int hp) {
        this.hp = hp;
    }
}