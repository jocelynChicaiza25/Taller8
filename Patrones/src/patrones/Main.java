/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones;

import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        // Crear un único cajero Automático de dólares con 100 billetes de 20, 100 de 10, 
        // 10 monedas de 0.50, 10 de 0.25 y 1000 de 0.05
        AtmUK cajero = new AtmUK();
        Manejador m1=new Manejador(100,20);
        Manejador m2=new Manejador(100,10);
        ManejadorMonedas m3=new ManejadorMonedas(10,0.50);// corregir manejador monedas
        ManejadorMonedas m4=new ManejadorMonedas(10,0.25);
        ManejadorMonedas m5=new ManejadorMonedas(1000,0.05);
        cajero.addManejador(m1);
        cajero.addManejador(m2);
        cajero.addManejador(m3);
        cajero.addManejador(m4);
        cajero.addManejador(m5);

        // Crear 10 cuentas nuevas en dólares locale.US con un saldo inicial entre 100.00 y 1000.00 USD cada una.
         for (int i=0; i<10;i++){
             
             Account ac = new Account(1+i,100+i*100);    
         }
        
        // Menú principal para seleccionar una de las 10 cuentas solo con el id
        
        
        // Mostrar el menú para realizar transacciones en el cajero automático
        //transaccion(ac);// escoger cuenta primero 
        
    }

    
}
