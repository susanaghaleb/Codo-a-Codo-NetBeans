
package maquinadechicles;

import java.util.Scanner;

public class MaquinaDeChicles {
    
    
    private static String AGOTADO = "Agotado";
    private static String SINMONEDA = "Sin Moneda";
    private static String CONNMONEDA = "Con Moneda";
    private static String VENDIDO = "Vendido";
    String manivela;
    String nuevamente ="N";
    String moneda = "";
    String salir = "";
    int coin = 0;
    int girar = 5;
    
    Scanner sc = new Scanner(System.in);
    
    public  void init(){
  
        System.out.println("Por favor inserte moneda");
        coin++;
        moneda = sc.next();
        System.out.println("Gira la manivela");
        manivela = sc.next();
        System.out.println("Queres continuar? \'S\' \'N\'");
        nuevamente = sc.next();
        System.out.println("Queres cacelar la operacion? \'S\' " );
        salir = sc.next();
    }
    
    
    public static void main(String[] args) {

       MaquinaDeChicles var = new MaquinaDeChicles();
       
       var.init();
       
       
        System.out.println(var.nuevamente + "inicio");
       
        while(var.nuevamente.equalsIgnoreCase("S") && var.coin<=4){
            System.out.println(var.nuevamente);
            var.init();
        } 
        System.out.println("Toma tus " + var.coin +" chicles y vete a la mierda ");
        
        
    }
        
    
}
