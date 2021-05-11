package unidad2;

public class Tecnico extends Operario{
    
    public Tecnico(String nombre, String apellidos, int edad, int antiguedad) {
        super(nombre, apellidos, edad, antiguedad);
        puesto = "Operario - Técnico";
    }
    
}
