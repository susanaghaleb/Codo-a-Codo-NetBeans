package biblioteca;

public class Revistas {
    
 //Atributos
    private int codigo ;
    private String titulo ;
    private int anodepub ;
    private boolean prestado;

    public Revistas() {
    }
    
    public Revistas(int codigo, String titulo, int anodepub) {
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
    public String toString() {
        return "Revistas{" + "codigo = " + codigo + ", titulo = " + titulo + ", anodepub = " + anodepub + '}';
    }
   
}
