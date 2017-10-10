package biblioteca;

public class Libros implements Prestable{

    //Atributos
    private int codigo ;
    private String titulo ;
    private int anodepub ;
    private boolean prestado;
    
    public Libros() {
    }

    public Libros(int codigo, String titulo, int anodepub) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anodepub = anodepub;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnodepub() {
        return anodepub;
    }

    public void setAnodepub(int anodepub) {
        this.anodepub = anodepub;
    }

    @Override
    public void prestar() {
        prestado = false;
    }

    @Override
    public void devolver() {
        prestado = true;
    }

    @Override
    public boolean prestado() {
        if(prestado){
            return true;
        }else
        return false;
    }

    @Override
    public String toString() {
        return "Libros{" + "codigo = " + codigo + ", titulo = " + titulo + ", anodepub = " + anodepub + '}';
    }

}
