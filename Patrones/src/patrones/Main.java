/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones;

import ChainResponsibility.Manejador;
import ChainResponsibility.ManejadorCash;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Crear un único cajero Automático de dólares con 100 billetes de 20, 100 de 10, 
        // 10 monedas de 0.50, 10 de 0.25 y 1000 de 0.05
        AtmUK cajero = new AtmUK();
        Manejador manejador20 = new ManejadorCash(100, 20);
        Manejador manejador10 = new ManejadorCash(100, 10);
        Manejador manejador050 = new ManejadorCash(10, 0.50);
        Manejador manejador025 = new ManejadorCash(10, 0.25);
        Manejador manejador005 = new ManejadorCash(1000, 0.05);
        cajero.addManejador(manejador005);
        cajero.addManejador(manejador025);
        cajero.addManejador(manejador050);
        cajero.addManejador(manejador20);
        cajero.addManejador(manejador10);

        // Crear 10 cuentas nuevas en dólares locale.US con un saldo inicial entre 100.00 y 1000.00 USD cada una.
        ArrayList<Account> cuentas = new ArrayList<Account>();
        Account cuenta1 = new Account(1, 500);
        Account cuenta2 = new Account(2, 1000);
        Account cuenta3 = new Account(3, 220);
        Account cuenta4 = new Account(4, 950);
        Account cuenta5 = new Account(5, 660);
        Account cuenta6 = new Account(6, 250);
        Account cuenta7 = new Account(7, 580);
        Account cuenta8 = new Account(8, 230);
        Account cuenta9 = new Account(9, 750);
        Account cuenta10 = new Account(10,150);
        cuentas.add(cuenta1);
        cuentas.add(cuenta2);
        cuentas.add(cuenta3);
        cuentas.add(cuenta4);
        cuentas.add(cuenta5);
        cuentas.add(cuenta6);
        cuentas.add(cuenta7);
        cuentas.add(cuenta8);
        cuentas.add(cuenta9);
        cuentas.add(cuenta10);

        // Menú principal para seleccionar una de las 10 cuentas solo con el id
        // Mostrar el menú para realizar transacciones en el cajero automático
        //transaccion(ac);// escoger cuenta primero 
    }

}
