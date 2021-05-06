package unidad3;

public class Principal {

    public static void main(String[] args) {
        Empleado empleado = new Empleado("Ernesto", "Lozoya", 36, 2);
        Directivo direc = new Directivo("Karla", "Estrada", 45, 5);
        Operario oper = new Operario("Alberto", "Álvarez", 39, 3);
        Oficial oficial = new Oficial("Marco", "Castro", 42, 4);
        Tecnico tecnico = new Tecnico("Susana", "Domínguez", 40, 3);
        
        empleado.mostrar();
        direc.mostrar();
        oper.mostrar();
        oficial.mostrar();
        tecnico.mostrar();
    }
    
}
