/* 16) Implemente la clase Empleado, que contenga como atributos miembros el número y
 * nombre de empleado, y los siguientes métodos miembros:
 * a) getNumero(): Obtiene el número del empleado dado
 * b) getNombre(): Obtiene el nombre del empleado dado
 * c) setNumero(int num): Modifica el número del empleado dado
 * d) setNombre(String nom): Modifica el nombre del empleado dado
 * e) verDatos(): Visualiza los datos del empleado por standard output
 * Luego escribir un método que cree varios empleados, los complete con datos de
 * empleados y luego visualice los datos de los mismos
 */
public class Empleados {

    private int numero;
    private String nombre;

    public Empleados(int numero, String nombre) {
        this.numero = numero;
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNumero(int num) {
        this.numero = num;
    }

    public void setNombre(String nom) {
        this.nombre = nom;
    }

    public void verDatos() {
        System.out.println("Numero: " + numero + " Nombre: " + nombre);
    }

    public static void main(String[] args) {
        Empleados empleado1 = new Empleados(1, "Juan");
        Empleados empleado2 = new Empleados(2, "Pedro");
        Empleados empleado3 = new Empleados(3, "Maria");

        empleado1.verDatos();
        empleado2.verDatos();
        empleado3.verDatos();
        //Ademas necesito usar las funciones setNumero y setNombre

        empleado1.setNumero(4);
        empleado1.setNombre("Jose");
        empleado1.verDatos();
    }
}
