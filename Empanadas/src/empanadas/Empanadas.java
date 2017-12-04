
package empanadas;

import java.util.*;


public class Empanadas {

    
    public enum Provincia {SALTA, TUCUMAN, CATAMARCA, JUJUY};
     
     
     public int PromocionLocal(Provincia provincia, int saltenas, int tucumanas){
             
       int numTipoEmTucu; int numTipoEmSal; int cantidadPromocion; int aux2 = 0;
         
         if(provincia == Provincia.SALTA ){
             if(saltenas< 4 || tucumanas < 2){
                aux2 = 0;
             }else{
                if( Objects.equals(saltenas / 4, tucumanas / 2)){
                     aux2 = (saltenas / 4) + (tucumanas / 2) / 6;
                }else{

                    aux2 = Math.min( (saltenas / 4),(tucumanas / 2) );
                }
             }
           
         }
        if(provincia == Provincia.TUCUMAN ){
             if(saltenas< 2 || tucumanas < 4){
                 System.out.println("no hay suficiente cantidad de empanadas para ofrecer promoción");
             }else{
                if( Objects.equals(saltenas / 2, tucumanas / 4)){
                     aux2 = (saltenas / 2) + (tucumanas / 4) / 6;
                }else{

                    aux2 = Math.min( (saltenas / 2),(tucumanas / 4) );
                }
             }
        }
        if(provincia != Provincia.SALTA && provincia !=Provincia.TUCUMAN){
            if(saltenas< 3 || tucumanas < 3){
                 System.out.println("no hay suficiente cantidad de empanadas para ofrecer promoción");
             }else{
                if( Objects.equals(saltenas / 3, tucumanas / 3)){
                     aux2 = (saltenas / 3) + (tucumanas / 3) / 6;
                }else{

                    aux2 = Math.min( (saltenas / 3),(tucumanas / 3) );
                }
             }
         }
         
        return aux2;
        
     }

    public static void main(String[] args) {
       
        Empanadas getPromocion = new Empanadas();
        Scanner sc = new Scanner(System.in);
        System.out.println("Indicame cual de estas provincias vas a consultar: SALTA, TUCUMAN, CATAMARCA, JUJUY");
        String provincia = sc.nextLine();
        System.out.println("Ingresa la cantidad de empanadas Salteñas por favor");
        int salteñas = sc.nextInt();
        System.out.println("Ingresa la cantidad de empanadas Tucumanas por favor");
        int tucumanas = sc.nextInt();
        Provincia ProvinciaSelecionada = Provincia.valueOf(Provincia.class, provincia.toUpperCase());
        System.out.println("La localidad de " + provincia.substring(0, 1).toUpperCase() + provincia.substring(1)
                + ":" + " tiene para ofrecer " + getPromocion.PromocionLocal(ProvinciaSelecionada, salteñas, tucumanas)+ " promoción");
       
    }
    
}
