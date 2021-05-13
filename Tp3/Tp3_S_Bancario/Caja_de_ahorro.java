package Tp3_S_Bancario;

public class Caja_de_ahorro {
    private double saldo;
    private String nroCuenta;

    public Caja_de_ahorro() {
        this(0,"Ninguna cuenta");
    }

    public Caja_de_ahorro(double saldo,String nroCuenta){
        this.saldo = saldo;
        this.nroCuenta = nroCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNroCuenta(String nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNroCuenta() {
        return nroCuenta;
    }

//------------------M E T O D O S-----------------------

    public void depositarDinero (double dinero){
        this.saldo = saldo + dinero;
    }

    public boolean cuentaVacia(){
        if (this.getSaldo()== 0)
            return true;
        else
            return false;
    }

    public double retirarDinero(double dinero){
        if ((this.cuentaVacia()== false) && (dinero <= this.getSaldo())){
            this.saldo = saldo - dinero;
            return dinero;
        }
        else
            return -1;
    }


}
