package Tp2_03.rectangulo;

import Tp2_03.punto.Punto;

public class Rectangulo extends Punto {
    // Atributos
    private Punto v1, v2, v3, v4; // v1 y v3 representan la base    _____________
                                  // v1 y v2 representan la altura |               |

    // Constructor
    public Rectangulo(Punto v1, Punto v2, Punto v3, Punto v4) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        this.v4 = v4;
    }

    // Metodos
    public float getBase(){
        return v1.getDistancia(v3);
    }

    public float getAltura(){
        return v1.getDistancia(v2);
    }

    public Punto getUbicacion() {
        return v1;
    }

    public void desplazar(float x, float y) {
        v1.setDesplazar(x, y);
        v2.setDesplazar(x, y);
        v3.setDesplazar(x, y);
        v4.setDesplazar(x, y);
    }

    public void desplazar(Punto p1) {
        float x = p1.getX();
        float y = p1.getY();
        this.desplazar(x, y); // ¿Se puede hacer?¿Es valido conceptualmente?
    }

    public float getArea() {
        //return (v1.getDistancia(v3) * v1.getDistancia(v2));
        return this.getBase()*this.getAltura();
    }

    public int tamanio(Rectangulo r1){
        if (this.getArea() == r1.getArea())
            return 0;
        else{
            if(this.getArea() > r1.getArea())
                return 1;   //Es mayor el rectangulo de la clase
                else {return -1;}
        }
    }

    public boolean isCuadrado(){
        if (this.getBase() == this.getAltura())
            return true;
        else
            return false;
    }

    public float getLargoSup(){
        return v2.getDistancia(v4);
    }

    // ToString
    @Override
    public String toString() {
        return "Rectangulo [v1=" + v1 + ", v2=" + v2 + ", v3=" + v3 + ", v4=" + v4 + "]";
    }

    // Getters and Setters
    public Punto getV1() {
        return v1;
    }

    public void setV1(Punto v1) {
        this.v1 = v1;
    }

    public Punto getV2() {
        return v2;
    }

    public void setV2(Punto v2) {
        this.v2 = v2;
    }

    public Punto getV3() {
        return v3;
    }

    public void setV3(Punto v3) {
        this.v3 = v3;
    }

    public Punto getV4() {
        return v4;
    }

    public void setV4(Punto v4) {
        this.v4 = v4;
    }
}
