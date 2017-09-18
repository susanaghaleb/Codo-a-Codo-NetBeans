
package mdc;

import java.util.Scanner;


public class MDC {

    private static int PRECIO = 1;
    private static int DINERO = 0;
    private static int MONEDAS;
    private static int STOCKCHICLES = 20;
    
    
  
    Scanner sc = new Scanner (System.in);
     
    public int  Chicles (int MONEDAS){
        int cantidadChicles= 0;
        System.out.println("Por favor ingrese Monedas");
        MONEDAS = sc.nextInt();
        cantidadChicles = STOCKCHICLES - MONEDAS;
        System.out.println("Quedan disponibles : " + cantidadChicles + " chicles");
       
        if (STOCKCHICLES < 0){
        System.out.println("Agotado");
        cantidadChicles = cantidadChicles + MONEDAS;
        MONEDAS=0;
        }
        DINERO = (MONEDAS * PRECIO);
        System.out.println("Por favor gire la manivela y Retira su " + MONEDAS + " chicle");
        
        return cantidadChicles;
    }
    
     
     
  
   public static void main(String[] args) {
        
       Scanner sc = new Scanner (System.in);
       
       MDC x = new MDC();
       
       x.Chicles(MONEDAS);
       
       if (MONEDAS <= 0 || MONEDAS >= 5){
           MONEDAS = sc.nextInt();
           System.out.println("Fuera de rango");
       }else {
           System.out.println("Stock AGOTADO");
           MONEDAS = 0;
       }    
   
    }
    
}
