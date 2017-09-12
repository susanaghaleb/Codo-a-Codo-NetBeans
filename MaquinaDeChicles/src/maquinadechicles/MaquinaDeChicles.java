package maquinadechicles;

import java.util.Scanner;

public class MaquinaDeChicles {

    private static String AGOTADO = "Agotado";
    private static String SINMONEDA = "Sin Moneda";
    private static String CONNMONEDA = "Con Moneda";
    private static String VENDIDO = "Vendido";
    private static String INSERTARMONEDA = "Insertar moneda";
    private static String GIRARMANIVELA = "Girar manivela";
    private static String RETIRARCHICLE ="Retirar chicle";
    private static String CANCELAROPERACION = "Cancelar operación";
    private static String MANIVELA;
    private static String NUEVAMENTE 
            ;
    private static String MONEDARECIBIDA;
    private static int MONEDA;
    private static int COIN = 0;
    private static int GANACIA;
    private static String CHOOSEOPTION;

    Scanner sc = new Scanner(System.in);

    public int ganancia(int cantidadVendida, int coin) {
        int cantidadVendidad = MONEDA;
        int resultado = cantidadVendidad * coin;
        return resultado;
    }

    public void opciones() {
        System.out.println("[1]-"+INSERTARMONEDA);
        System.out.println("[2]-"+GIRARMANIVELA);
        System.out.println("[3]-"+RETIRARCHICLE);
        System.out.println("[4]-"+CANCELAROPERACION);
        System.out.println("Por favor ingrese una opcion");
        CHOOSEOPTION = sc.next();

    }

    public static void main(String[] args) {

        MaquinaDeChicles var = new MaquinaDeChicles();
        

        var.opciones();

        switch (Integer.parseInt(CHOOSEOPTION)) {
            case 1:
                System.out.println("Recibiendo Moneda");
                COIN++;
                System.out.println("Por favor tipea "+GIRARMANIVELA);
                MONEDARECIBIDA = var.sc.next();
                System.out.println ("quieres continuar  \'S\' \'N\'");
                NUEVAMENTE = var.sc.next();
                while(NUEVAMENTE.equalsIgnoreCase("s")&& COIN <= 4){
                    var.opciones();
                }
                System.out.println("Toma tus " + COIN +" chicles  ");
                break;
               // while(COIN >= 1){System.out.println(RETIRARCHICLE); COIN = 0;
                //}
               
                

            case 2:
                if(COIN == 0){System.out.println("No hay monedas en la ranura, por favor elige una opción");}
                    var.opciones();
                 break;
            case 3:
                System.out.println("Retirar chicle");
                 break;
            case 4:
                System.out.println("Cancelar");
                 break;
            default:
                System.out.println("Opcion invalida");
                 break;
        }
//        while (var.nuevamente.equalsIgnoreCase("S") && var.coin <= 4) {
//            var.init();
//        }
//        System.out.println("Toma tus " + var.coin + " chicles y vete a la mierda ");

    }
}
