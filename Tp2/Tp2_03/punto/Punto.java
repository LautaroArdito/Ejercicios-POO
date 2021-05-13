package Tp2_03.punto;

public class Punto {
    // Atributos
    protected float x, y;

    // Metodos
    public void setDesplazar(float x, float y) {
        this.x = this.x + x;
        this.y = this.y + y;
    }

    public float getDistancia(Punto p1) {
        return (float) (Math.sqrt(((getX() - p1.getX()) * (getX() - p1.getX())) + ((getY() - p1.getY()) * (getY() - p1.getY()))));
    }

    // Constructores
    public Punto(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Punto() {
        this(0.0f, 0.0f);
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    // toString
    @Override
    public String toString() {
        return "Punto [x=" + x + ", y=" + y + "]";
    }
}
