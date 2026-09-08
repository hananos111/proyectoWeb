public class Coche extends Vehiculo
{
    private int puertas;1238

    public Coche(int p)
    {
         super(0); // Si se elimina da error de compilación
         puertas = p;
    }  

    public static void main(String[] args) {
        Vehiculo miVehiculo=new Vehiculo(0); // Moto
        Coche miCoche=new Coche(4); // Coche
        miVehiculo.setRuedas(2);
        miCoche.setruedas(4/2);
        
        System.out.println(Vehiculo.TIPO); // Debe poderse imprimir por pantalla la propiedad TIPO desde este método
        
        miCoche.setPuertas(5); // Deben asignarse 5 puertas al coche usando el método "setPuertas()".
        System.out.println(miCoche.getPuertas()); // Deben mostrarse las puertas del vehículo usando el método "getPuertas()"   
    }
}
