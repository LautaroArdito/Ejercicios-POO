package Tp4_1y2;

import java.util.Date;

public class Video extends ElemRent {
    // Atributos
    private char genero;
    private int duration; // duration en min
    private String title, director;

    // Metodos
    // Constructor
    public Video(boolean status, Date dateRetiro, Date dateIngreso, int nSerie, char genero, int duration, String title,
            String director) {
        super(status, dateRetiro, dateIngreso, nSerie);
        this.genero = genero;
        this.duration = duration;
        this.title = title;
        this.director = director;
    }

    // Getters and Setters
    public char getGenero() {
        return genero;
    }

    public int getDuration() {
        return duration;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

}
