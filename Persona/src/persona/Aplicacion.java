
package persona;

public class Aplicacion {
    public static void main(String[] args) {
        
        //Creamos el objeto
        Aula aula = new Aula();
        aula.notas();
        Alumno a = new Alumno();
        a.disponibilidad();
        a.getNota();
        Profesor p =new Profesor ();
        p.disponibilidad();
        p.getMateria();
        if(aula.darClase()){
            aula.notas();
    }
       
        
    }
     
}
