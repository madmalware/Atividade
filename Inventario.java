/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg;

import java.util.ArrayList;

/**
 *
 * @author msousa
 */
public class Inventario <X extends Item> {
    
    private ArrayList<X> itens = new ArrayList<>();
    
    public void Inventario(Player jogador, ArrayList<X> itens){
        
        this.itens = itens;
        
        GameLogic.Titulo("Inventário: ");
        
        for (int i = 1; i < getItens().size(); i++) {
            Item item = getItens().get(i);
            System.out.println("(" + i + ") " + item.getName());
        }
        
        System.out.println("\n Deseja equipar algum item?");
        System.out.println("(1) Sim.");
        System.out.println("(2) Não.");
        
        int input = GameLogic.lerInt("-> ", 2);
        
        if(input == 1 ){
            equiparItem(jogador);
        }
    }
    
    public boolean equiparItem(Player jogador){
        int i;
        boolean equipado = false;
        
        GameLogic.Clean();
        
        GameLogic.Titulo("Escolha um item: ");
        
        for ( i = 1; i < getItens().size(); i++) {
            Item item = getItens().get(i);
            System.out.println("(" + i + ") " + item.getName());
        }
        
        int input = GameLogic.lerInt("-> ", i);
        
        if (input >= 1 && input < getItens().size()) {
            Item itemSelecionado = getItens().get(input);
        
        // Verificar se o item já está equipado
            if (itemSelecionado.isEquipado()) {
                System.out.println("Este item já está equipado!");
            } else {
            // Desequipar qualquer item já equipado, se houver
                for (Item item : getItens()) {
                    if (item.isEquipado()) {
                        item.setEquipado(false);
                    // Atualizar o dano do jogador para o valor base
                        jogador.setDano(item.getDano());
                    }
                }
            
            // Equipar o novo item e atualizar o dano do jogador
                itemSelecionado.setEquipado(true);
                jogador.setDano(itemSelecionado.getDano());
                equipado = true;
            }
        }
        return equipado;
        
    }
    
    public Item getItemEquipado(){
        for (Item item : getItens()) {
            if (item.isEquipado()) {
                return item;
            }
                
        }
        return null; 
    }
        
    
    public ArrayList <X> getItens(){
        return itens;
    }

    /**
     * @param itens the itens to set
     */
    public void setItens(ArrayList <X> itens) {
        this.itens = itens;
    }
    
}