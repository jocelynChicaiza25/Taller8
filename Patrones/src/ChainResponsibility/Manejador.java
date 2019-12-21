package ChainResponsibility;




public interface Manejador
{
  
    public double getMonto();
    public double getDenominacion();
    public void setMonto(double monto);
    public boolean retirar(double monto);     
    public boolean depositar(double monto, int denominacion);
}