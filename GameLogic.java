/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg;

import java.util.Scanner;

/**
 *
 * @author msousa
 */
public class GameLogic {
    
    public static boolean isRunning;
    Inventario inventario = new Inventario();
    public static int lugar = 0, ato = 1;
    public static String[] lugares = {"Midsommar", "Nix Gelidus", "Ardoris", "Tenebris"};
    Player jogador;
    
    static Scanner scanner = new Scanner(System.in);
    
    public static int lerInt(String prompt, int userEscolhas){
        int input;
        
        do{
            System.out.println(prompt);
            try{
                input = Integer.parseInt(scanner.next());
            }catch(Exception e){
                input = -1;
                System.out.println("Por favor digite um inteiro válido.");
            }
        }while(input < 1 || input > userEscolhas);
        return input;
    }
    
    public static void Clean(){
        for(int i = 0; i <= 100; i++){
            System.out.println();
        }
    }
    
    public static void separadorTexto(int n){
        for(int i = 0; i <= n; i++){
            System.out.print("-");   
        }
        System.out.println();   
    }
    
    public static void Titulo(String titulo){
        separadorTexto(30);
        System.out.println(titulo);
        separadorTexto(30);
    }
    
    public static void pressioneEnter(){
        System.out.println("Digite qualquer coisa e pressione Enter para continuar... ");
        scanner.next();
    }
    
    public static void Continuar(Player jogador){
        
        checkAto(jogador);
        
    }
    
    public static void checkAto(Player jogador){
        
        if(jogador.getXp()>= 10 && ato == 1 ){
             ato = 2;
             lugar = 1;
             
             Story.atoII();
        }else if(jogador.getXp()>= 40 && ato == 2 ){
            ato= 3;
            lugar = 2;
            
            Story.atoIII();
        }else if(jogador.getXp()>= 80 && ato == 3 ){
            ato= 4;
            lugar = 3;
            
            Story.atoIV();
        }
    }
    
    public static void Menu(){
        Clean();
        Titulo(lugares[lugar]);
        System.out.println("(1) Continuar jornada");
        System.out.println("(2) Status do personagem");
        System.out.println("(3) Descansar");
        System.out.println("(4) Sair do jogo");
        
    }
    
    public static void gameLoop(Player jogador){
        Menu();
        
        while(isRunning){
            Menu();
            
            int input = lerInt("->", 4);
            
            if(input == 1){
                Continuar(jogador);
            }else if(input == 2){
                jogador.Info();
            }else if(input == 3){
                jogador.Curar();
            }else{
                isRunning = false;
            }
        }
    }
    
    public void acaoBatalha(Player jogador){
        GameLogic.Titulo("Escolha uma ação: ");
        System.out.println("(1) Lutar");
        System.out.println("(2) Fugir");
        System.out.println("(3) Curar");
        System.out.println("(4) Trocar arma.");
        int input = GameLogic.lerInt("-> ", 4);
        
        //fazer if n else das escolhas
        switch (input) {
            case 1:
                GameLogic.Clean();
                
                break;
            case 2:
                GameLogic.Clean();
                //Story.Estrada();
                break;
            case 3:
                jogador.Curar();
                System.out.println("Você usou a poção.");
                break;
            case 4:
                inventario.equiparItem(jogador);
                break;
        }
    }
    
    public void Batalha(Player jogador, Inimigo inimigo){
        
        
        while(jogador.getHp() > 0 && inimigo.gethp() > 0){
            
            
        }
    }
    
    
    
}
    