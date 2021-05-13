package Tp2_02.electrodomestico;

public class Electrodomestico {
    // Atributos
    private String nombre;
    private float precio;
    private String color;
    private float consumo; // Medido en Kw
    private float peso; // Medido en Kg

    // Metodos

    public boolean getBajoConsumo() {
        if (getConsumo() < 45.0f)
            return true;
        return false;
    }

    public float getBalance() {
        return (getPrecio() / getPeso());
    }

    public boolean getAltaGama() {
        if (getBalance() > 3)
            return true;
        return false;
    }

    // Constructores
    public Electrodomestico(String nombre, float precio, String color, float consumo, float peso) {
        this.nombre = nombre;
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public Electrodomestico(String nombre) {
        this(nombre, 100.0f, "Gris Plata", 10, 2.0f);
    }

    public Electrodomestico(String nombre, float precio) {
        this(nombre, precio, "Gris Plata", 10, 2.0f);
    }

    public Electrodomestico(String nombre, float precio, String color) {
        this(nombre, precio, color, 10, 2.0f);
    }

    public Electrodomestico(String nombre, float precio, String color, float consumo) {
        this(nombre, precio, color, consumo, 2.0f);
    }

    // Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getConsumo() {
        return consumo;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    // toString
    @Override
    public String toString() {
        return "Electrodomestico [color=" + color + ", consumo=" + consumo + " Kw " + ", nombre=" + nombre + ", peso="
                + peso + " Kg " + ", precio=" + precio + "]";
    }

}
