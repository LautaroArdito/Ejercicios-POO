package Tp3_Sueldos;

import java.time.LocalDate;

public class EmpleadoComision extends Empleado{
    private int cantVentas;
    private static int PORCENTAJE = 45;

    @Override
    public double getSalario() {
        return super.getSalario() + ((PORCENTAJE * cantVentas)/100);
    }

    public int getCantVentas() {
        return cantVentas;
    }

    public static int getPORCENTAJE() {
        return PORCENTAJE;
    }

    @Override
    public String toString() {
        return "EmpleadoComision{" + super.toString() +
                "cantVentas=" + cantVentas +
                '}';
    }

    public EmpleadoComision(String nombre, String apellido, int id, LocalDate fechaNac, double salario, int cantVentas) {
        super(nombre, apellido, id, fechaNac, salario);
        this.cantVentas = cantVentas;
    }
}
