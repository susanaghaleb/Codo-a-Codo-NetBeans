
package persona;

public class Aula {
    
     
    /*Atributos*/
    private int id;
    private Profesor profesor;
    private Alumno[] alumnos;
    private String materia;
     
    /*Constantes*/
    private final int MAX_ALUMNOS=20;
    
    public static final String[] MATERIAS ={"Matematicas", "Filosofia", "Fisica"};
     
    public static int NumeroAleatorio(int minimo, int maximo){
         
        int num=(int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));
        return num;
    }
    
    /*Constructores*/
    public Aula(){
         
        id=1;
         
        profesor=new Profesor();
        alumnos= new Alumno[MAX_ALUMNOS];
        creaAlumnos();
        materia = MATERIAS[NumeroAleatorio(0,2)];
         
    }
    
    //Metodo crea los alumnos para el aula
    private void creaAlumnos(){
         
        for(int i=0;i<alumnos.length;i++){
            alumnos[i]=new Alumno();
        }
         
    }
    
     //Indica si la asistencia de los alumnos es mayor del 50%
    private boolean asistenciaAlumnos(){
         
        int cuentaAsistencias=0;
         
        //contamos las asistencias
        for(int i=0;i<alumnos.length;i++){
             
            if(alumnos[i].isAsistencia()){
                cuentaAsistencias++;
            }
             
        }
         
        //Muestro la asistencia total
        System.out.println("Hay "+cuentaAsistencias+" alumnos");
         
        return cuentaAsistencias>=((int)(alumnos.length/2));
         
    }
     
   //Indicamos si se puede dar clase
    
    public boolean darClase(){
         
        //Indicamos las condiciones para que se pueda dar la clase
         
        if(!profesor.isAsistencia()){
            System.out.println("El profesor no esta, no se puede dar clase");
            return false;
        }else if(!profesor.getMateria().equals(materia)){
            System.out.println("La materia del profesor y del aula no es la misma, no se puede dar clase");
            return false;
        }else if (!asistenciaAlumnos()){
            System.out.println("La asistencia no es suficiente, no se puede dar clase");
            return false;
        }
         
        System.out.println("Se puede dar clase");
        return true;
         
    }
   
    //Indicamos las notas de los alumnos aprobados, chicos y chicas
    public void notas(){
         
        int chicosApro=0;
        int chicasApro=0;
         
         for(int i=0;i<alumnos.length;i++){
            
           //Comprobamos si el alumno esta aprobado
           if(alumnos[i].getNota()>=5){
               //Segun el sexo, aumentara uno o otro
               if(alumnos[i].getSexo()=="M"){
                   chicosApro++;
               }else{
                   chicasApro++;
               }
                
               System.out.println(alumnos[i].toString());
                
           }
             
        }
          
        System.out.println("Hay "+chicosApro+" chicos y "+chicasApro+" chicas aprobados/as " + " en " + materia);
         
    }

}
