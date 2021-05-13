package Tp4_1y2;

import java.util.Date;

public class Auto extends ElemRent{
    private String brand, color;
    private int model;

    public Auto(boolean status, Date dateRetiro, Date dateIngreso, int nSerie,String brand, String color, int model) {
        super(status,dateRetiro,dateIngreso,nSerie);
        this.brand = brand;
        this.color = color;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getModel() {
        return model;
    }

}
