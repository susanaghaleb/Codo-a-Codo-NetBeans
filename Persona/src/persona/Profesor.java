package persona;

//Clase profesor que hereda de la clase Persona

import static persona.Aula.MATERIAS;

public class Profesor extends Persona{
     
    //Atributos
    private String materia;
    
    //Constructores
    public Profesor(){
       super();
       super.setEdad(Aula.NumeroAleatorio(25,50));
        
       materia = Aula.MATERIAS[Aula.NumeroAleatorio(0,2)];
    }

    //Calcula la asistencia del profesor
    @Override
    public void disponibilidad() {
        
        int prob = Aula.NumeroAleatorio(0, 100);
         
        if(prob < 20){
            super.setAsistencia(false);
        }else{
            super.setAsistencia(true);
        }
    }

    //Metodos
    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        for (int i = 0; i < MATERIAS.length; i++) {
			
            System.out.println( MATERIAS[ i ] +" ---> "+ materia );
			
		}
        return "Profesor{" + "materia=" + materia + '}';
    }

   
}