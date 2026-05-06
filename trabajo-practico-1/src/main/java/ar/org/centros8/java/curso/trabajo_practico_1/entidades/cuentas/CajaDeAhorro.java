package ar.org.centros8.java.curso.trabajo_practico_1.entidades.cuentas;

import ar.org.centros8.java.curso.trabajo_practico_1.entidades.clientes.Cliente;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)

public class CajaDeAhorro extends Cuenta {
    private double tasaDeInteres;

    public CajaDeAhorro(int nroDeCuenta, Cliente clienteAsociado, double tasaDeInteres) {
        super(nroDeCuenta, clienteAsociado);
        this.tasaDeInteres = tasaDeInteres;
    }
              

    @Override
    /**
     * Este metodo se encarga de depositar dinero en la caja de ahorro.
     * @param monto -> Monto a depositar.
     */
    public void depositar(double monto) {
        if (monto < 0) {
            System.out.println("No puede ingresar un monto negativo"); 
        }else{
            setSaldo(getSaldo() + monto);
        }
    }

    @Override
    /**
     * Este metodo se encarga de extraer dinero de la caja de ahorro.
     * @param monto -> Monto a extraer.
     */
    public void extraer(double monto) {
        if (monto < 0) {
            System.out.println("No puede ingresar un monto negativo"); 
        }else if (monto > (getSaldo())){
            System.out.println("Saldo insuficiente");
        }else{
            setSaldo(getSaldo() - monto);
        }
    }

    /**
     * Este metodo se encarga de cobrar el interes que corresponde a la caja de ahorro, sumando el interes al saldo actual.
     *
     */
    public void cobrarInteres() {
        setSaldo (getSaldo() + ((getSaldo() * getTasaDeInteres())/100));
        System.out.println("Se ha cobrado el interes correspondiente a la caja de ahorro, el nuevo saldo es: " + getSaldo());
    }
}
