package Tp2_Series;

import java.util.*;

public class Temporada {
    // Atributos
    private List<Episodio> episodios = new ArrayList<Episodio>();

    // Metodos
    public int getEpisodiosVistos() {
        int vistos = 0;
        for (Episodio ep : episodios) { // Recorre todo el arreglo
            if (ep.isFlag()) // Si el episodio fue visto
                vistos++;
        }
        return vistos;
    }

    public int getTamanio() {
        return episodios.size();
    }

    public int getCalifTotal() {
        int calif = 0;
        for (Episodio ep : episodios) {
            if (ep.isFlag())
                calif += ep.getCalif();
        }
        return calif;
    }

    public float getPromedioCalif() {
        return this.getCalifTotal() / this.getTamanio();
    }

}
