package Tp2_01.persona;

public class Persona {
    private String nombre;
    private int edad;
    private String fechanac;
    private String dni;
    private char sexo; // M=masculino F=femenino
    private float peso;
    private float altura;

    // Constructores
    public Persona(String nombre, int edad, String fechanac, String dni, char sexo, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.fechanac = fechanac;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public Persona(String dni) {
        this("N N", -1, "01/01/2000", dni, 'F', 1, 1);
    }

    public Persona(String dni, String nombre) {
        this(nombre, -1, "01/01/2000", dni, 'F', 1, 1);
    }

    public Persona(String dni, String nombre, int edad) {
        this(nombre, edad, "01/01/2000", dni, 'F', 1, 1);
    }

    public Persona(String dni, String nombre, int edad, String fechanac) {
        this(nombre, edad, fechanac, dni, 'F', 1, 1);
    }

    public Persona(String dni, String nombre, int edad, String fechanac, char sexo) {
        this(nombre, edad, fechanac, dni, sexo, 1, 1);
    }

    public Persona(String dni, String nombre, int edad, String fechanac, char sexo, float peso) {
        this(nombre, edad, fechanac, dni, sexo, peso, 1);
    }

    // Metodos
    public float getMasaCorporal() {
        return (peso / (altura * altura));
    }

    public boolean getEstado() {
        if ((getMasaCorporal() >= 18.5) && (getMasaCorporal() <= 25f))
            return true;
        return false;
    }

    public boolean getCumpleaños(String fecha) {
        if (getFechanac() == fecha)
            return true;
        return false;
    }

    public boolean getMayor(){
        if (getEdad() >= 18)
            return true;
        return false;
    }

    

    // Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFechanac() {
        return fechanac;
    }

    public void setFechanac(String fechanac) {
        this.fechanac = fechanac;
    }

    public String getDni() {
        return dni;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    //Para imprimir todo
    @Override
    public String toString() {
        return "Persona [altura=" + altura + ", dni=" + dni + ", edad=" + edad + ", fechanac=" + fechanac + ", nombre="
                + nombre + ", peso=" + peso + ", sexo=" + sexo + "]";
    }

}
