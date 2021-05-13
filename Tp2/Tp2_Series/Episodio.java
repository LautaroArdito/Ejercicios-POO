package Tp2_Series;

public class Episodio {
    // Atributos
    private String titulo;
    private String descripcion;
    private boolean flag;
    private int calif; // Valores del 1 al 5 (-1 si no califica)

    // Metodos

    // Constructor
    public Episodio(String titulo, String descripcion, boolean flag, int calif) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.flag = flag; // Si esta visto el episodio
        this.calif = calif;
    }

    public Episodio() {
        this("N", "N", false, -1); // -1 si no lo vi aún
    }

    // Getters and Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getCalif() {
        return calif;
    }

    public void setCalif(int calif) {
        if (calif <= 5 && calif >= 1)
            this.calif = calif;
        else
            System.out.println("La calificacion no es correcta");
    }
}
