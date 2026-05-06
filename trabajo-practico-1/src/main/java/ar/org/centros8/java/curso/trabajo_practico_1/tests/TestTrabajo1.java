package ar.org.centros8.java.curso.trabajo_practico_1.tests;

import java.time.LocalDate;

import ar.org.centros8.java.curso.trabajo_practico_1.entidades.cheques.Cheque;
import ar.org.centros8.java.curso.trabajo_practico_1.entidades.clientes.ClienteEmpresa;
import ar.org.centros8.java.curso.trabajo_practico_1.entidades.clientes.ClienteIndividual;
import ar.org.centros8.java.curso.trabajo_practico_1.entidades.cuentas.CajaDeAhorro;
import ar.org.centros8.java.curso.trabajo_practico_1.entidades.cuentas.CuentaConvertibilidad;
import ar.org.centros8.java.curso.trabajo_practico_1.entidades.cuentas.CuentaCorriente;

public class TestTrabajo1 {
    public static void main(String[] args) {
        System.out.println("######################Test de la clase ClienteIndividual######################");
        ClienteIndividual cliente1 = new ClienteIndividual(101, "Romina", "Arrayan", "23819074");
        System.out.println(cliente1);
        // cliente1.saludar();

        ClienteIndividual cliente2 = new ClienteIndividual(140, "Ricardo", "Montaner", "43944177");
        System.out.println(cliente2);
        // cliente2.saludar();
        System.out.println("######################Clase ClienteIndividual funciona correctamente######################\n");


        System.out.println("######################Test de la clase ClienteEmpresa######################");
        ClienteEmpresa empresa1 = new ClienteEmpresa(789, "Tremendo", "30-23123467-4");
        System.out.println(empresa1);
        // empresa1.saludar();

        ClienteEmpresa empresa2 = new ClienteEmpresa(123, "47 Street", "30-45678904-4");
        System.out.println(empresa2);
        // empresa2.saludar();
        System.out.println("######################Clase ClienteEmpresa funciona correctamente######################\n");


        System.out.println("######################Test de la clase CajaDeAhorro######################");
        CajaDeAhorro cajaDeAhorro1 = new CajaDeAhorro(89, cliente2, 2);
        System.out.println(cajaDeAhorro1);

        cajaDeAhorro1.depositar(100000);
        System.out.println(cajaDeAhorro1);

        cajaDeAhorro1.extraer(5);
        System.out.println(cajaDeAhorro1);

        cajaDeAhorro1.cobrarInteres();
        System.out.println("######################Clase CajaDeAhorro funciona correctamente######################\n");

        System.out.println("######################Test de la clase CuentaCorriente######################");
        CuentaCorriente cuentaCorriente1 = new CuentaCorriente(123, cliente2, 9000);
        System.out.println(cuentaCorriente1);

        cuentaCorriente1.depositar(100000);
        System.out.println(cuentaCorriente1);// saldo: 100000

        cuentaCorriente1.extraer(105000);
        System.out.println(cuentaCorriente1);// saldo: -5000
        cuentaCorriente1.extraer(5000);
        System.out.println(cuentaCorriente1);// saldo insuficiente
        cuentaCorriente1.extraer(4000);
        System.out.println(cuentaCorriente1);// saldo: -9000

        cuentaCorriente1.depositar(18000);
        System.out.println(cuentaCorriente1);// saldo: 9000
        

        cuentaCorriente1.depositarCheque(new Cheque(60000, "Banco Galicia", LocalDate.of(2026, 9, 15)));
        System.out.println(cuentaCorriente1);// saldo: 69000

        cuentaCorriente1.extraer(5000);
        System.out.println(cuentaCorriente1);// saldo: 64000 
        System.out.println("######################Clase CuentaCorriente funciona correctamente######################\n");


        System.out.println("######################Test de la clase CuentaConvertibilidad######################");
        CuentaConvertibilidad cuentaConvertibilidad1 = new CuentaConvertibilidad(12, empresa2, 1000);
        System.out.println(cuentaConvertibilidad1);

        CuentaConvertibilidad cuentaConvertibilidad2 = new CuentaConvertibilidad(789, new ClienteEmpresa(183, "Acer", "20-88553355-2"), 1000);
        System.out.println(cuentaConvertibilidad2);
        System.out.println();

        cuentaConvertibilidad2.depositar(5000);//sado: 5000
        System.out.println(cuentaConvertibilidad2);
        System.out.println();

        cuentaConvertibilidad2.extraer(70000);
        System.out.println(cuentaConvertibilidad2);// saldo insuficiente
        System.out.println();

        cuentaConvertibilidad2.convertirADolares(5000, 1400);
        System.out.println(cuentaConvertibilidad2);// saldo:0.0 saldoEnDolares:3.57
        cuentaConvertibilidad2.convertirADolares(50000,1400);
        System.out.println(cuentaConvertibilidad2);// saldo en pesos insuficiente
        System.out.println(); 

        cuentaConvertibilidad2.convertirAPesos(3, 1400);
        // saldo:4200 saldoEnDolares:0.57
        cuentaConvertibilidad2.convertirAPesos(100,1400);
        System.out.println(cuentaConvertibilidad2);// saldo en dolares insuficiente
        System.out.println();

        cuentaConvertibilidad2.depositarDolares(100);
        System.out.println(cuentaConvertibilidad2);// saldo:4200 saldoEnDolares:100.57
        System.out.println();

        cuentaConvertibilidad2.extraerDolares(10);
        System.out.println(cuentaConvertibilidad2);// saldo:4200 saldoEnDolares:90.57
        cuentaConvertibilidad2.extraerDolares(130);
        System.out.println(cuentaConvertibilidad2); // Saldo en dolares insuficiente
        System.out.println("######################Clase CuentaConvertibilidad funciona correctamente######################\n");

    }

}
