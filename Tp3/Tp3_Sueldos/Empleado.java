package Tp3_Sueldos;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

public class Empleado {
    private String nombre,apellido;
    private int id;
    private LocalDate fechaNac;
    private double salario;

    //CONSTRUCTOR
    public Empleado(String nombre, String apellido, int id, LocalDate fechaNac, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.fechaNac = fechaNac;
        this.salario = salario;
    }

    //GETTERS
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getId() {
        return id;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", id=" + id +
                ", fechaNac=" + fechaNac +
                ", salario=" + salario +
                '}';
    }

    public static void main(String[] args) {
        LocalDate fecha = LocalDate.of(2020,10,12);
        Empleado e1 = new Empleado("Ramon","Gimenez",001,fecha,30000);
        Empleado e2 = new EmpleadoComision("Luis","Rodriguez",002,fecha,30000,20);
        Empleado e3 = new EmpleadoHorasExtras("Lautaro","Ardito",003,fecha,30000,5);
        System.out.println(e1.getSalario());
        System.out.println(e2.getSalario());
        System.out.println(e3.getSalario());
    }

}
