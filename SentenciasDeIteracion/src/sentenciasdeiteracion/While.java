
package sentenciasdeiteracion;

import java.util.Scanner;


public class While {

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor introduzca un numero");
        num = sc.nextInt();
        
        
       int i = 0;
        while  (i<100){
             i++;
             num = num+1;
             System.out.println (num);
        }
         System.out.println (num);
    }
    
}
