
package metodorecursivo;

import java.util.Scanner;

public class MetodoRecursivo {
    
     public static void Conversor(int num) {
        if (num < 2) {
            System.out.print(num);
            return;
        } else {
            Conversor(num / 2);
            System.out.print(num % 2);
            return;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num ;
        String resultado;
        long numero, aux, digito, decimal;
        int exponente;
        boolean NumBinario;
        do {
            System.out.println("Introduzca numero >0: ");
            num = sc.nextInt();
        } while (num < 0);
        System.out.print("Binario: ");
        Conversor(num);
        
        do {
          System.out.println("Introduce un numero binario: "  );
          numero = sc.nextLong();
          NumBinario = true;
          aux = numero;
          while (aux != 0) {
                     digito = aux % 10; 
                     if (digito != 0 && digito != 1) { 
                          NumBinario = false; 
                     }
                     aux = aux / 10; 
           }
      } while (!NumBinario); 
      exponente = 0;
      decimal = 0;
      while (numero != 0) {
                
                digito = numero % 10;
                
                decimal = decimal + digito * (int) Math.pow(2, exponente);
               
                exponente++;
               
                numero = numero / 10;
      }
      System.out.println("Decimal: " + decimal);
    }
}
    