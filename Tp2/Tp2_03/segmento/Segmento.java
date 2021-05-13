package Tp2_03.segmento;

import Tp2_03.punto.Punto;

public class Segmento extends Punto{
    // Atributos
    private Punto ext1,ext2;

    // Metodos

    //Constructor
    public Segmento(Punto p1,Punto p2){
        ext1=p1;
        ext2=p2;
    }


    // Getters ands Setters
    public Punto getExt1() {
        return ext1;
    }

    public void setExt1(Punto ext1) {
        this.ext1 = ext1;
    }

    public Punto getExt2() {
        return ext2;
    }

    public void setExt2(Punto ext2) {
        this.ext2 = ext2;
    }
    

    
}
