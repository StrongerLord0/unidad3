package unidad3;

public class Empleado {
    
    protected String nombre;
    protected String apellidos;
    protected int edad;
    protected int antiguedad;
    public String puesto = "Sin especificar";
    
    public Empleado(String nombre, String apellidos, int edad, int antiguedad){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.antiguedad = antiguedad;
        
    }
    public void mostrar(){
        System.out.println("DATOS DEL EMPLEADO\nNombre: " + nombre + " " + apellidos
        + "\nEdad: " + edad + "\nAntigüedad: " + antiguedad + "\nPuesto: " + puesto +"\n");
    }
    
}
