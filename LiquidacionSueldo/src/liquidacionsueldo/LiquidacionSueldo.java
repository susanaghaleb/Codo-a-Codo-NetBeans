package liquidacionsueldo;

public class LiquidacionSueldo {
    
    //Atributos
    private int HorasTr = 160;
    private int Antiguedad = 6;
    private int Sueldo;
    
    //Metodo
    public  int SueldoBruto(){
        if (HorasTr <= 160){
        Sueldo = HorasTr * 120;
        System.out.println("Su sueldo total correspondiente es de : " + Sueldo);
        }else{
        Sueldo = (HorasTr - 160) * 30 + (HorasTr * 120) ;
        System.out.println("Su sueldo total con horas extras " + Sueldo);
        }
        Antiguedad = Sueldo + ((Antiguedad / 5 ) * 800) + ((Antiguedad % 5 ) * 300);
        System.out.println ("Su total correspondiente por los años trabajados con antiguedad es de : " + Antiguedad);
    return Sueldo + Antiguedad ;
    }
     
    public  int Descuentos(){
        if (Sueldo > 18000){
        Sueldo = (Sueldo - (Sueldo *  24/100));
        System.out.println("Su sueldo bruto es de : " + Sueldo);
        }else{
        Sueldo = (Sueldo - (Sueldo *  20/100));
        System.out.println("Su sueldo bruto es de : " + Sueldo);
        }
        return Sueldo;
    }
       
        
    public static void main(String[] args) {
      LiquidacionSueldo x = new LiquidacionSueldo();
      x.SueldoBruto();
      x.Descuentos();
    }
    
}
