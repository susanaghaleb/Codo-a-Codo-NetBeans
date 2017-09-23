
public class VideoJuego implements Entregable {
    
    //Constante para declarar las horas estimadas por defecto
    private final static int HORASESTIMADASPORDEFECTO =10;
  
   //Constantes para comparar q un objeto es menor , igual o m,ayor q otro
    public final static int MAYOR = 1;
    public final static int MENOR = -1;
    public final static int IGUAL = 0;
    
    // Atributos
    private String titulo; 
    private  int horasEstimadas;
    private  boolean entregado;
    private static String genero;
    private static String compania;
    
    // Construstor por defecto
    public VideoJuego(){
        this("",HORASESTIMADASPORDEFECTO, "", "");
    }
  
    //Constructor con 2 parametros
    public VideoJuego(String titulo, int horasEstimadas){
        this(titulo,HORASESTIMADASPORDEFECTO, "", compania);
    }
  
    // Constructor con 4 parametros
    public VideoJuego(String titulo, int horasEstimadas, String genero, String compania){
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
        this.entregado = false;
    }
 
    public void setTitulo (String nombre) {
       this.titulo = nombre; 
    } 
     public String getTitulo () {
        return titulo; 
    } 
     
    public void setHorasEstimadas (int numero) {
        this.horasEstimadas = numero;
    } 
     public int getHorasEstimadas () {
        return horasEstimadas; 
    }
     
    public void setGenero (String nombre) {
       this.genero = nombre;
    }
    public String getGenero () {
        return genero; 
    } 
    
    public void setCompania (String nombre) {
       this.compania = nombre;
    }
    public String getCompania () {
        return compania; 
    } 
    
    //Cambia el estado de entregado a true
    @Override
    public void entregar() {
        entregado =true;
    }
    
    //Cambia el estado de entregado a false
    @Override
    public void devolver(){
        entregado = false;
    }
    
    //Indica el estado de entregado
      @Override
    public boolean isEntregado() {
        if(entregado){
            return true;
        }else
        return false;
    }
   
    //Muestra informacion del videojuego
    @Override
    public String toString() {
        return ("Informacion del Video Juego: " + " \n Titulo = " + titulo + " \n Horas Estimadas = " + horasEstimadas + 
                " \n Genero = " + genero + "\n Compania = " + compania );
    }

    //Indica si dos videojuegos son iguales, siendo el titulo y compañia iguales
    public boolean equals(VideoJuego a){
        if (titulo.equalsIgnoreCase(a.getTitulo()) && compania.equalsIgnoreCase(a.getCompania())){
            return true;
        }else
        return false;
    }
    
    //Compara dos videojuegos
    @Override
    public int compareTo(Object a) {
        int estado = MENOR;
        //Hacemos un casting de objetos para usar el metodo get
        VideoJuego x = (VideoJuego)a;
        if (horasEstimadas > x.getHorasEstimadas()){
            estado=MAYOR;
        }else if(horasEstimadas == x.getHorasEstimadas()){
            estado = IGUAL;
        }
        return estado;
    }
  
}
