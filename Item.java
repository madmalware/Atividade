/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg;

/**
 *
 * @author msousa
 */
public class Item {
    
    private String name;
    private int dano, danoMagico;
    private boolean equipado;
    
    public Item(String name, int dano, int danoMagico) {
        this.name = name;
        this.dano = dano;
        this.danoMagico = danoMagico;
        this.equipado = false;
    }
    
    public boolean isEquipado(){
        return equipado;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the dano
     */
    public int getDano() {
        return dano;
    }

    /**
     * @return the danoMagico
     */
    public int getDanoMagico() {
        return danoMagico;
    }

    /**
     * @param equipado the equipado to set
     */
    public void setEquipado(boolean equipado) {
        this.equipado = equipado;
    }
    
}