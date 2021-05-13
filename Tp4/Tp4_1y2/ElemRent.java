package Tp4_1y2;

import java.util.Date;

public abstract class ElemRent { // No se puede instanciar.
    // Atributos
    protected boolean status;
    protected Date dateRetiro, dateIngreso;
    protected double nSerie;

    // Metodos

    // Constructor
    public ElemRent(boolean status, Date dateRetiro, Date dateIngreso, double nSerie) {
        this.status = status;
        this.dateRetiro = dateRetiro;
        this.dateIngreso = dateIngreso;
        this.nSerie = nSerie;
    }

    // Setters and getters
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getDateRetiro() {
        return dateRetiro;
    }

    public Date getDateIngreso() {
        return dateIngreso;
    }

    public double getnSerie() {
        return nSerie;
    }


}
