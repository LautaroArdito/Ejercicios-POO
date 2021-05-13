package Tp3_Avicola;

import java.util.Date;

public class Producto {
    private Date fechaVencimiento;
    private Date fechaEnvasado;
    private  int nrolote;
    private String granjaOrigen;

    public Producto (Date fechaVencimiento, Date fechaEnvasado, int nroLote, String granjaOrigen)
    {
        this.fechaEnvasado= fechaEnvasado;
        this.fechaVencimiento=fechaVencimiento;
        this.nrolote=nroLote;
        this.granjaOrigen=granjaOrigen;
    }

    public Date getFechaenvasado() {
        return fechaEnvasado;
    }

    public Date getFechavencimiento() {
        return fechaVencimiento;
    }

    public int getNrolote() {
        return nrolote;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "fechaVencimiento=" + fechaVencimiento +
                ", fechaEnvasado=" + fechaEnvasado +
                ", nrolote=" + nrolote +
                ", granjaOrigen='" + granjaOrigen + '\'' +
                '}';
    }

}
