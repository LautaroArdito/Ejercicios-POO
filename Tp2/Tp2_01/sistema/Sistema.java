package Tp2_01.sistema;

import Tp2_01.persona.Persona;

public class Sistema {
    public static void main(String[] args) {
        Persona p1 = new Persona("41.687.678");
        Persona p2 = new Persona("Lautaro Ardito", 20, "10/05/1999", "41.687.678", 'M', 80, 6);
        //java.util.Date fecha1 = new java.util.Date();

        System.out.println("La masa corporal de " + p2.getNombre() + " es " + p2.getMasaCorporal());

        if (p2.getCumpleaños("10/05/1999"))
            System.out.println("FC");
        else
            System.out.println("No FC");
        
        System.out.println(p2.toString()); 
        System.out.println(p1.toString());

    }
}
