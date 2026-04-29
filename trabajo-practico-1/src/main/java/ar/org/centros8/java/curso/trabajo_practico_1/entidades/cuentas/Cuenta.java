package ar.org.centros8.java.curso.trabajo_practico_1.entidades.cuentas;

import ar.org.centros8.java.curso.trabajo_practico_1.entidades.clientes.Cliente;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class Cuenta {
    private int nroDeCuenta;
    private Cliente clienteAsociado;
    private double saldo;

    public Cuenta(int nroDeCuenta, Cliente clienteAsociado) {
        this.nroDeCuenta = nroDeCuenta;
        this.clienteAsociado = clienteAsociado;
        this.saldo = 0.0; // Inicializa el saldo en 0.0
    }

    public abstract void depositar(double monto);
    public abstract void extraer(double monto);
}
