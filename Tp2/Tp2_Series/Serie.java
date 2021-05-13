package Tp2_Series;

import java.util.*;

public class Serie {
    //Atributos
    //private String titulo,descripcion,creador,genero;
    private List<Temporada> temporadas = new ArrayList<Temporada> ();

    //Metodos

    public int getCantEpVistos(){
        int visto=0;
        for (Temporada temp : temporadas) {
            visto+=temp.getEpisodiosVistos(); 
        }
        return visto;
    }

    public int getTamanio(){
        return temporadas.size();
    }

    public int getCalif(){
        int total=0;
        for (Temporada temp : temporadas) {
            total+=temp.getCalifTotal();
        }
        return total;
    }

    public float getPromCalif(){
        return this.getCalif() / this.getTamanio();
    }

    public boolean isVista(){   //NOSE SI ESTA BIEN GG
        for (Temporada temp : temporadas) {
            if(temp.getEpisodiosVistos() != temp.getTamanio())
                return false;
        }
        return true;
    }

    //Constructor
    /*public Serie(String titulo, String descripcion, String creador, String genero) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.creador = creador;
        this.genero = genero;
    }*/

}
