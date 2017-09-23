
public class Serie implements Entregable {
    
    //Constante para declarar el numero de temporada por defecto
    private final static int NUMERODETEMPORADAPORDEFECTO = 3;
    
    //Constantes para comparar q un objeto es menor , igual o m,ayor q otro
    public final static int MAYOR = 1;
    public final static int MENOR = -1;
    public final static int IGUAL = 0;
  
    //Atributos
    private String titulo;
    private int numeroTemporadas;
    private boolean entregado;
    private String genero;
    private String creador;
  
    // Constructor por defecto
    public Serie(){
        this("",NUMERODETEMPORADAPORDEFECTO, "", "");
    }
  
    // Contructor con 2 parametros
    public Serie(String titulo, String creador){
        this(titulo,NUMERODETEMPORADAPORDEFECTO, "", creador);
    }
  
    // Constructor con 4 parametros
    public Serie(String titulo, int numeroTemporadas, String genero, String creador){
        this.titulo=titulo;
        this.numeroTemporadas=numeroTemporadas;
        this.genero=genero;
        this.creador=creador;
        this.entregado=false;
    }
  
    public void setTitulo (String nombre) {
       this.titulo = nombre; 
    } 
    public String getTitulo () {
        return titulo; 
    } 
    
    public void setNumeroDeTemporada (int numero) {
        this.numeroTemporadas = numero;
    } 
    public int getNumeroDeTemporada () {
        return numeroTemporadas; 
    }
    
    public void setGenero (String nombre) {
       this.genero = nombre;
    }
    public String getGenero () {
        return genero; 
    }
    
    public void setCreador (String nombre) {
       this.creador = nombre;
    }
    public String getCreador () {
        return creador; 
    }
    
    //Cambia el estado de entregado a true
    @Override
    public void entregar() {
        entregado=true;
    }
  
    //Cambia el estado de entregado a false
    @Override
    public void devolver() {
        entregado=false;
    }
  
    //Indica el estado de entregado
    @Override
    public boolean isEntregado() {
        if(entregado){
            return true;
        }else
        return false;
    }

   // Muestra informacion de la Serie
    public String toString(){
        return ("Informacion de la Serie: " + "\n Titulo: " + titulo + "\n Numero de temporadas: " + numeroTemporadas + 
                "\n Genero: " + genero + "\n Creador: " + creador);
    }
  
    //Indica si dos Series son iguales, siendo el titulo y creador iguales
     public boolean equals(Serie a){
        if (titulo.equalsIgnoreCase(a.getTitulo()) && creador.equalsIgnoreCase(a.getCreador())){
            return true;
        }else
        return false;
    }

    //Compara dos series segun su numero de temporadas
    public int compareTo(Object a) {
        int estado = MENOR;
    //Hacemos un casting de objetos para usar el metodo get
        Serie x = (Serie) a;
        if (numeroTemporadas > x.getNumeroDeTemporada()){
            estado = MAYOR;
        }else if(numeroTemporadas== x.getNumeroDeTemporada()){
            estado = IGUAL;
        }
        return estado;
    }
    
}
