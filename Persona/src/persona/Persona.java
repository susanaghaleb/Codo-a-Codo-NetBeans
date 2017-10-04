package persona;

    //Clase Persona
public abstract class Persona {
     
    //Atributos
    private String nombre;
    private int edad;
    private String sexo;
    private boolean asistencia;
     
    //Contantes
    
    final String[] NOMBRES_CHICOS = {"Kelman", "Brian", "Derek", "Juan", "Pedro"};
    final String[] NOMBRES_CHICAS = {"Kate", "Laura", "Alicia", "Matilde", "Valeria"}; 
    private final int CHICO = 0;
    private final int CHICA = 1;
    
    //Constructores
    public Persona(){
        
       //entre 0 y 1
        int determinar_sexo = Aula.NumeroAleatorio(0,1);
         
        //Si es 0 es un chico y si es 1 es chica
        if(determinar_sexo == CHICO){
            nombre = NOMBRES_CHICOS[Aula.NumeroAleatorio(0,4)];
            sexo = "M";
        }else{
            nombre=NOMBRES_CHICAS[Aula.NumeroAleatorio(0,4)];
            sexo = "F";
        }
      disponibilidad();
}
     //Metodos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
     
    //Indica la asistencia de la persona
    public boolean isAsistencia() {
        return asistencia;
    }
    public boolean getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(boolean asistencia) {
        this.asistencia = asistencia;
    }
    
    //Sirve para calcular el porcentaje de asistencia en las clases hijos
    public abstract void disponibilidad();
}