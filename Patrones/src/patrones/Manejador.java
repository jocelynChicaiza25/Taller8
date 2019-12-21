/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones;

public class Manejador
{
    protected int monto;
    protected int denominacion;

    public Manejador(int monto, int denominacion){
        this.monto = monto; // Total de billetes
        this.denominacion = denominacion; // Valor de cada billete
    }

    public int getMonto(){ return monto; }
    public int getDenominacion(){ return denominacion; }
    public void setMonto(int monto){ this.monto = monto; }

    public boolean retirar(int monto){
        if(monto%this.denominacion==0){
            return true;
        }
        return false;
    }
    public boolean depositar(int monto, int denominacion){
        if(denominacion==this.denominacion){
            return true;
        }
        return false;
    }
}