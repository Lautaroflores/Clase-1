/*Ejercicio: Crear una Clase y un Objeto
Crear una clase llamada Estudiante que tenga los siguientes atributos:
Nombre (String)
Edad (int)
Carrera (String)
Materias (arreglo de String)
Luego, crear un objeto de tipo Estudiante con valores concretos para estos atributos
e imprimir la información del estudiante en la consola. */

package paquete1;

public class Estudiantes {
    
    //Defino los atributos
    private String estudianteNombre;
    private int Edad;
    private String Carrera;
    private String[] Materias;  //Array de strings
    
    //Creo el constructor
    public Estudiantes(String nombre, int edad, String carrera, String[] materias) {
        this.estudianteNombre = nombre;
        this.Edad= edad;
        this.Carrera= carrera;
        this.Materias = materias;
    }
    //Metodo para printear, uso VOID porque no voy a usar return
    public void imprimirInformacion() {
        System.out.print("Nombre: " + estudianteNombre +". " + "Edad: " + Edad +". "+ "Carrera: " + Carrera + ". " + "Materias: ");
        for (String materia: Materias){ //Entro al array para imprimir cada cosa
            System.out.print("," + materia);
        }
    }
}
