package Tp2_03.sistema;

import Tp2_03.punto.Punto;
import Tp2_03.rectangulo.Rectangulo;

public class Sistema {
    public static void main(String[] args) {
        Punto p1 = new Punto(3,3);
        Punto p2 = new Punto(3,4);
        Punto p3 = new Punto(6,3);
        Punto p4 = new Punto(6,4);

        Punto p5 = new Punto(3,3);
        Punto p6 = new Punto(3,4);
        Punto p7 = new Punto(4,3);
        Punto p8 = new Punto(4,4);

        /*System.out.println(p1.toString());
        p1.setDesplazar(3, 1);
        p2.setX(3);
        p2.setY(2);

        System.out.println(p1.getDistancia(p2));*/

        Rectangulo r1=new Rectangulo(p1,p2,p3,p4);
        Rectangulo r2=new Rectangulo(p5,p6,p7,p8);

        r1.desplazar(p1);
        System.out.println(r1.toString());
        System.out.println(r1.getArea());

        if (r2.isCuadrado())
            System.out.println("ES UN CUADRADO MAN");
        else
            System.out.println("NO LO ES MAN");
        
    


    }
}
