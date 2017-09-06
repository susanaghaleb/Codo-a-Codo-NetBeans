
package sentenciasdeiteracion;

import java.util.Scanner;

public class DoWhile {
    
    public static void main(String[] args) {
        int num;

        Scanner sc = new Scanner (System.in);
        System.out.println ("Por favor ingrese un numero");
        num = sc.nextInt();
          
        int x = 0;
        do {        
            x++;
            num = num+1;
            System.out.println (num);
          }        
          while (x < 100);
        System.out.println ("Este es el valor final incrementadon = " + num);
    }
    
}

