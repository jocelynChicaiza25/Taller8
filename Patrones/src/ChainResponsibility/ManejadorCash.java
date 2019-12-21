
package ChainResponsibility;


public class ManejadorCash implements Manejador {
    
    protected double monto;
    protected double denominacion;
    Manejador siguiente;

   

    public ManejadorCash(double monto, double denominacion){
        this.monto = monto; // Total de billetes
        this.denominacion = denominacion; // Valor de cada billete
    }

    @Override
    public double getMonto(){ 
        return monto; }
    
    public double getDenominacion(){ 
        return denominacion; }
    
    @Override
    public void setMonto(double monto){ 
        this.monto = monto; }
   
    public void setSiguiente(ChainResponsibility.Manejador m) {
        this.siguiente = m;
    }


    @Override
    public boolean retirar(double monto){
      if(this.monto*denominacion>monto){
            this.monto-=(int)(monto/denominacion);
            return true;
        }
       return false;
    }
    @Override
    public boolean depositar(double monto, int denominacion){
        if(this.denominacion==denominacion){
            this.monto+=monto;
            return true;
        }
        return false;
    }

    
}
    

