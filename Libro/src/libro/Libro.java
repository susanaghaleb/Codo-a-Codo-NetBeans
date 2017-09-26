
package libro;

public class Libro {
    
    
    //Crear los atributos
     public int ISBN;
     public int NumeroDePaginas;
     public String Titulo;
     public String Autor;
     public String Materia;

    //Constructor con los atributos como parametros
    public Libro(int ISBN, String Titulo, String Autor, String Materia, int NumeroDePaginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Materia = Materia;
        this.NumeroDePaginas = NumeroDePaginas;
    }

    //Getters y Setters
    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

      public int getNumeroDePaginas() {
        return NumeroDePaginas;
    }

    public void setNumeroDePaginas(int NumeroDePaginas) {
        this.NumeroDePaginas = NumeroDePaginas;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }
  
    @Override
    public String toString() {
        return ("Libro" + "\n ISBN=" + ISBN + "\n Titulo=" + Titulo + "\n Autor=" + Autor + "\n Materia=" + Materia + "\n NumeroDePaginas=" + NumeroDePaginas);
    }
     
    
    public static void main(String[] args) {
        
       //Creamos los objetos
       Libro L1 = new Libro(111111111, "Don Quijote de la Mancha ", "Miguel de Cervantes", "Novela de aventuras, caballerías y  realista", 150);
       Libro L2 = new Libro (222222222, "Alicia en el pais de las maravillas", "Lewis Carroll", "Aventura, Ciencia Ficcion", 300);
       
       //Mostramos su estado
        System.out.println(L1.toString());
        System.out.println(L2.toString());
        
        //Comparamos quien tiene mas paginas y mostramos por pantalla
        if(L1.getNumeroDePaginas() > L2.getNumeroDePaginas()){
            System.out.println(L1.getTitulo() + " tiene más páginas");
        }else{
            System.out.println(L2.getTitulo() + " tiene más páginas");
        }
    }
    
}
