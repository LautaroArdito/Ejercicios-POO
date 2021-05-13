package Tp2_02.sistema;

import Tp2_02.electrodomestico.Electrodomestico;

public class Sistema {
    public static void main(String[] args) {
        Electrodomestico e1=new Electrodomestico("Juan");
        Electrodomestico e2= new Electrodomestico("Robert", 200);
        Electrodomestico e3= new Electrodomestico("Julia", 40.0f, "Rosa", 40, 3);

        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());
    }
}
