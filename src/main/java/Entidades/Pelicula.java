package Entidades;

public class Pelicula {
    private String Titulo;
    private String Autor;
    private Integer Duracion;

    public Pelicula(String Titulo, String Autor, int Duracion) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Duracion = Duracion;
    }

    public Pelicula() {
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

    public Integer getDuracion() {
        return Duracion;
    }

    public void setDuracion(Integer Duracion) {
        this.Duracion = Duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "Titulo=" + Titulo + ", Autor=" + Autor + ", Duracion=" + Duracion + '}';
    }
    
    
    
}
