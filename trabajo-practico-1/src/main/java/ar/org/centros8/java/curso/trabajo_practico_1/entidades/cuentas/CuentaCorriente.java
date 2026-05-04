package ar.org.centros8.java.curso.trabajo_practico_1.entidades.cuentas;

import ar.org.centros8.java.curso.trabajo_practico_1.entidades.clientes.Cliente;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString (callSuper = true)

public class CuentaCorriente extends Cuenta{
    private double giroEnDescubierto;

    public CuentaCorriente(int nroDeCuenta, Cliente clienteAsociado, double giroEnDescubierto) {
        super(nroDeCuenta, clienteAsociado);
        this.giroEnDescubierto = giroEnDescubierto;
    }

    @Override
    /**
     * Este metodo se encarga de depositar dinero en la cuenta corriente.
     * @param monto -> Monto a depositar.
     */
    public void depositar(double monto){
          if (monto < 0) {
            System.out.println("No puede ingresar un monto negativo");  
        }else{
            setSaldo(getSaldo() + monto);
    }

    @Override
    /**
     * Este metodo se encarga de extraer dinero de la cuenta corriente.
     * Si el monto actual no es sufieciente se utiliza el giro en descubierto para cubrir la extraccion.
     * Si el monto a extraer supera el tope del giro en descubierto, entoces sale un mensaje -> "Saldo insuficiente".
     * @param monto -> Monto a extraer.
     */
    public void extraer(double monto){

        if ( (getSaldo() - monto) >= (-getGiroEnDescubierto())) {
            setSaldo(getSaldo() - monto);
        } else {
            System.out.println("Saldo es insuficiente ");
        }

    }

    /**
     * Este metodo se encarga de depositar el monto de un cheque en la cuenta corriente.
     * @param cheque -> Cheque a depositar.
     */
    public void depositarCheque (Cheque cheque){
        setSaldo(getSaldo() + cheque.getMonto());
    }
}
