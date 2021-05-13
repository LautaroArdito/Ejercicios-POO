package Tp3_Sueldos;

import java.time.LocalDate;

public class EmpleadoHorasExtras extends Empleado{
    private int cantHorasExtra;
    private static double MONTO = 100;

    @Override
    public double getSalario() { //SALARIO DE EMPLEADO + MONTO EXTRA POR HORA TRABAJADA
        return super.getSalario() + (cantHorasExtra * MONTO);
    }

    public int getCantHoras(){
        return cantHorasExtra;
    }

    public static double getMONTO() {
        return MONTO;
    }

    @Override
    public String toString() {
        return "EmpleadoHorasExtras{" + super.toString() +
                "cantHorasExtra=" + cantHorasExtra +
                '}';
    }

    public EmpleadoHorasExtras(String nombre, String apellido, int id, LocalDate fechaNac, float salario, int cantHoras) {
        super(nombre, apellido, id, fechaNac, salario);
        this.cantHorasExtra = cantHoras;
    }


}
