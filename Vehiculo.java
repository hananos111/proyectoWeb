public class Vehiculo implements iVehiculo
{
    public int ruedas;
    private final String TIPO=new String("VEHICULO");

    public Vehiculo(int r)
    {
        ruedas = r;
    }

    public getRuedas() {
        return ruedas;
    }
    
    public void setRuedas(int r) {
        ruedas=r;
        System.out.println("Ruedas asignadas como "+this.getClass()+": "+r);
    }
}
