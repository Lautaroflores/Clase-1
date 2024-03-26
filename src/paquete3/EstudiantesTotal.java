/*Ejericio: Clase y Objeto con miembros estáticos
Modificar la clase Estudiante previa de forma que tenga
 los siguientes miembros:

 -Un atributo de clase llamado estudiantesTotales
para realizar un seguimiento del número total de estudiantes.

-Dos atributos de instancia: nombre y edad.

-Un constructor que acepte un nombre y una edad como parámetros
y los asigne a las variables de instancia correspondientes.

-Un método de instancia llamado presentarse()
que imprima un mensaje que incluya el nombre y la edad.

-Un método de clase llamado getEstudiantesTotales()
que devuelva el valor actual de estudiantesTotales.

-Un método de clase llamado agregarEstudiante(nombre, edad)
que incremente estudiantesTotales en 1 cada vez que se llame
y cree una nueva instancia de Estudiante con los parámetros
 proporcionados. */


package paquete3;

public class EstudiantesTotal {
    
    //Defino los atributos
    private String estudianteNombre;
    private int Edad;
    private static int estudiantesTotales = 0;
    
    //Creo el constructor
    public EstudiantesTotal(String nombre, int edad) {
        this.estudianteNombre = nombre;
        this.Edad= edad;
        estudiantesTotales++; //Cada vez que agrego un estudiante, sumo uno al contador
        
    }
    //Metodo para printear, uso VOID porque no voy a usar return
    public void presentarse() {
      System.out.println("\nNombre: " + estudianteNombre + ". Edad: " + Edad);
    }

    public static int getEstudiantesTotales(){
        return EstudiantesTotal.estudiantesTotales;
    }

    public static EstudiantesTotal agregarEstudiante(String nombre, int edad) {
        return new EstudiantesTotal(nombre, edad);
    }
}
