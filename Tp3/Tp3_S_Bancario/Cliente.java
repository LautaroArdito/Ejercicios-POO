package Tp3_S_Bancario;

import java.time.LocalDate;
import java.util.ArrayList;
//import java.util.Iterator;

public class Cliente {
    private String nombre;
    private String DNI;
    private char sexo;
    private LocalDate fecha_nac;
    private ArrayList<Caja_de_ahorro> misCuentas = new ArrayList<Caja_de_ahorro>();

    public Cliente(String nombre, String DNI, char sexo, LocalDate fecha_nac) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.sexo = sexo;
        this.fecha_nac = fecha_nac;
    }

    public int getEdad(){
        LocalDate hoy = LocalDate.now();
        return hoy.getYear() - fecha_nac.getYear();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDNI(){
        return DNI;
    }

    //Metodos
    public void depositar(String nroCuenta,double monto){
        
    }








    /* AGREGAR CAJA DE AHORRO A UN CLIENTE VA EN BANCO.
    public void agregarCuenta (double monto, String nroCuenta){
        Caja_de_ahorro caja = new Caja_de_ahorro(monto,nroCuenta);
        misCuentas.add(caja);
    }*/
    public static void main(String[] args) {
        LocalDate nacimiento = LocalDate.of(1999,5,10);
        Cliente c1 = new Cliente("Lautaro","41687678",'M',nacimiento);
        System.out.println(c1.getEdad());
        System.out.println(nacimiento);
    }
}

