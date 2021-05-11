package unidad2;

public class Directivo extends Empleado{
    
    public Directivo(String nombre, String apellidos, int edad, int antiguedad) {
        super(nombre, apellidos, edad, antiguedad);
        puesto = "Directivo";
    }
    
    
}
