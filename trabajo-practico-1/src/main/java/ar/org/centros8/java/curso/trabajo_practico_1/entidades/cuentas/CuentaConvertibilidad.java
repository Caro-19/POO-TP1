package ar.org.centros8.java.curso.trabajo_practico_1.entidades.cuentas;

import ar.org.centros8.java.curso.trabajo_practico_1.entidades.clientes.ClienteEmpresa;
import lombok.ToString;

@ToString(callSuper = true)
public class CuentaConvertibilidad extends CuentaCorriente {
    private double saldoEnDolares;

    public CuentaConvertibilidad(int nroDeCuenta, ClienteEmpresa clienteAsociado, double giroEnDescubierto) {
        super(nroDeCuenta, clienteAsociado, giroEnDescubierto);
        this.saldoEnDolares = 0.0;//inicializa saldo en dolares en 0
    }


    /**
     * Convierte un monto de pesos a dólares, siempre y cuando el monto a convertir no supere el saldo en pesos disponible.
     * @param monto -> El monto en pesos que se desea convertir a dólares.
     * @param tasaDeConversion -> Seria el precio del dolar.
     * @return -> El nuevo saldo en dólares después de la conversión, 
     * o el saldo en dólares sin modificar si el monto a convertir supera el saldo en pesos disponible.
     */
    public double convertirADolares(double monto, double tasaDeConversion){
        if (monto <= getSaldo()){
            setSaldo(getSaldo() - monto);
            saldoEnDolares = Math.round((saldoEnDolares + (monto / tasaDeConversion)) * 100.0) / 100.0;
        }else{
            System.out.println("Saldo en pesos insuficiente para realizar la operacion");
        }
        return saldoEnDolares;
    }

    /**
     * Convierte un monto de dólares a pesos, siempre y cuando el monto a convertir no supere el saldo en dólares disponible.
     * @param monto -> El monto en dólares que se desea convertir a pesos.
     * @param tasaDeConversion -> Seria el precio del dolar .
     * @return -> El nuevo saldo en pesos después de la conversión, 
     * o el saldo en pesos sin modificar si el monto a convertir supera el saldo en dólares disponible.
     */
    public double convertirAPesos(double monto, double tasaDeConversion){
        if (monto <= saldoEnDolares){
            saldoEnDolares = Math.round((saldoEnDolares - monto)* 100.0) / 100.0;
            setSaldo(getSaldo() + (monto * tasaDeConversion));
        }else{
            System.out.println("Saldo en dolares insuficiente para realizar la operacion");
        }
        return getSaldo();
    }

    /**
     * Este metodo se encarga de depositar dinero en la cuenta convertibilidad, el deposito se realiza en dólares.
     * @param monto -> El monto en dólares a depositar.
     */
    public void depositarDolares(double monto){
        saldoEnDolares = saldoEnDolares + monto;
    }

    /**
     * Este metodo se encarga de extraer dinero en la cuenta convertibilidad, la extraccion se realiza en dólares.
     * @param monto -> El monto en dólares a extraer.
     */
    public void extraerDolares(double monto){
        if (saldoEnDolares >= monto) {
            saldoEnDolares = saldoEnDolares - monto;
        }else{
            System.out.println("Saldo en dolares Insuficiente");
        }
    }
}
