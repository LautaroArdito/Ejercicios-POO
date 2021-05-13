package Tp4_3;

import java.util.ArrayList;
import java.util.List;

public class Cereal {
    private List<String> minerales = new ArrayList<String>();
    private String nombre;
    private double peso;
    private String tipo;

    public boolean aceptable(Lote lote){
        if(minerales.equals(lote))
            return true;
        else return false;
    }

    public Cereal(String nombre, double peso,String tipo) {
        this.nombre = nombre;
        this.peso = peso;
        this.tipo = tipo;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo=tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    /*public class Cereal {
    private List<String> minerales;
    private String nombre;
    private double peso;
    private String tipo;



    public boolean aceptable(Lote lote){
        if(lote.equals(minerales))
            return true;
        else return false;
    }

    /*public Cereal(String nombre, double peso,String tipo,String... minerales) {
        this.minerales = new ArrayList<String>();
        for (String mineral : minerales) {
            this.minerales.add(mineral);
        }
        this.nombre = nombre;
        this.peso = peso;
        this.tipo = tipo;
    }   //

    public Cereal(String nombre, double peso,String tipo,List<String> lista) {
        this.minerales = new ArrayList<String>();
        for(int i=0;i<lista.size();i++)
            this.minerales.add(lista.get(i));
        this.nombre = nombre;
        this.peso = peso;
        this.tipo = tipo;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo=tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }*/

}
