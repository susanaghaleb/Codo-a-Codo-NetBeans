package numerosromanos;

import java.util.Scanner;

public class App{
    
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor introduzca un numero en el rango de los miles");
        num = sc.nextInt();
        System.out.println(num);
    
        NumerosRomanos x = new NumerosRomanos(); 
        String coso = x.convertirANumerosRomanos(num);  
        System.out.println(num + " en numeros romanos  = " + coso);
               
                
    }
    
    
}