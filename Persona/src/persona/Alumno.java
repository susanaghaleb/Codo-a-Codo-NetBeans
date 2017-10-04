package persona;

//Clase Alumno, hereda de la clase Persona
public class Alumno extends Persona{
     
    //Atributos
    private int nota;
  
    //Constructor
    public Alumno(){
        super();
         
        nota = Aula.NumeroAleatorio(0,10);
         
        super.setEdad(Aula.NumeroAleatorio(12,15));
         
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    
    //Indica si el alumno esta disponible (50%)
    @Override
    public void disponibilidad() {
        int asistio = 0;
         
        if(asistio < 50){
            super.setAsistencia(false);
        }else{
            super.setAsistencia(true);
        } 
    }
    
   //Muestra la informacion del alumno con nota

    @Override
    public String toString() {
        for (int i = 0; i < NOMBRES_CHICOS.length; i++) {
			
            System.out.println( NOMBRES_CHICOS[ i ] +" ---> "+ nota );
			
		}
        
        for (int x = 0 ; x < NOMBRES_CHICAS.length; x++) {
            System.out.println( NOMBRES_CHICAS[ x ] +" ---> "+ nota );
        }
        
        return null;
    }

}