
package panaderia;


public class Panaderia {

    public int CantidadDePromociones(int AlfajoresChocolate, int AlfajoresDulceDeLeche, int AlfajoresFruta){
       
       int CCH = AlfajoresChocolate/4;
       int CDDL = AlfajoresDulceDeLeche;
       int CF = AlfajoresFruta;
       int aux = 0;
               
       if (CCH < CDDL && CCH < CF){
         return CCH;
       
       }else if (CDDL < CCH && CDDL < CF){
         return CDDL;
       
       }else if (CF < CCH && CF < CDDL){
         return CF;
       }
       return aux;
    }
    
    public static void main(String[] args) {
       
    }
    
}
