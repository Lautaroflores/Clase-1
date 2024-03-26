import paquete1.Estudiantes;
import paquete2.Rectangulo;
import paquete3.EstudiantesTotal;

public class App {
    public static void main(String[] args) {
        
        System.out.println("Ejercicio estudiantes");
        
        Estudiantes estudiante1 = new Estudiantes("Alguien", 23, "LCD", new String[]{"Algo", "Análisis"});
        estudiante1.imprimirInformacion();

        /*-------------------------------------- */
        System.out.println("\nEjercicio Rectangulos");
        
        Rectangulo rectangulito = new Rectangulo(6.5, 4.2); 
        rectangulito.imprimirInformacion();
        /*-------------------------------------- */
        System.out.println("\nEjercicio Estudiantes Totales");
        
        EstudiantesTotal estudiante2 = new EstudiantesTotal("Lautaro", 23);
        estudiante2.presentarse();
        EstudiantesTotal.agregarEstudiante("Alguien", 19).presentarse();
        System.out.println(EstudiantesTotal.getEstudiantesTotales());
    }
    }