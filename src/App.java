import java.util.Scanner;

import entrada.EntradaConsola;
import paquete1.Estudiantes;
import paquete2.Rectangulo;
import paquete3.EstudiantesTotal;
import calculadoraSimple.CalculadoraSimple;
import temperaturaMain.TemperaturaMain;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //El objeto Scanner lee entradas (esta vez del teclado indicada con System.in)
        System.out.println("Seleccione el proyecto a ejecutar:");
        System.out.println("1. Estudiantes");
        System.out.println("2. Rectangulo");
        System.out.println("3. Estudiantes Totales");
        System.out.println("4. Entrada y salida");
        System.out.println("5. Calculadora simple");
        System.out.println("6. Conversor de temperatura");
        int opcion = scanner.nextInt(); // Pido que lea el entero que le paso y lo guarde en "opcion"
        switch (opcion) {//Un switch comun. va a la funcion que pido por consola
            case 1:
                ejecutarEstudiantes();
                break;
            case 2:
                ejecutarRectangulo();
                break;
            case 3:
                ejecutarEstudiantesTotales();
                break;
            case 4:
                ejecutarEntradaSalida();
                break;
            case 5:
                ejecutarCalculadoraSimple();
                break;
            case 6:
                ejecutarConversorTemperatura();
                break;
            default:
                System.out.println("Opción no válida");
        }
        
        scanner.close(); //Cierro para que no haya mas uso de memoria
    }
        /*-------------ESTUDIANTES-------------- */
        public static void ejecutarEstudiantes() {
            System.out.println("\nEjercicio estudiantes");
            Estudiantes estudiante1 = new Estudiantes("Alguien", 23, "LCD", new String[]{"Algo", "Análisis"});
            estudiante1.imprimirInformacion();
            
        }

        /*--------------RECTANGULO-------------- */
        public static void ejecutarRectangulo() {
            System.out.println("\nEjercicio Rectangulos");
            
            Rectangulo rectangulito = new Rectangulo(6.5, 4.2); 
            rectangulito.imprimirInformacion();
            
        }

        /*-----------TOTAL-ESTUDIANTES---------- */
        public static void ejecutarEstudiantesTotales() {
            
            System.out.println("\nEjercicio Estudiantes Totales");
            
            EstudiantesTotal estudiante2 = new EstudiantesTotal("Lautaro", 23);
            estudiante2.presentarse();
            EstudiantesTotal.agregarEstudiante("Alguien", 19).presentarse();

            System.out.println(EstudiantesTotal.getEstudiantesTotales() + " estudiantes totales");
        
        }
        /*------------ENTRADA-SALIDA------------ */
        public static void ejecutarEntradaSalida() {
            System.out.println("\nEjercicio entrada y salida:");

            EntradaConsola.main(new String[]{});           
            
        }

        /*----------CALCULADORA-SIMPLE---------- */
        public static void ejecutarCalculadoraSimple(){
            System.out.println("\nEjercicio calculadora simple");

            CalculadoraSimple.main(new String[]{});
        }

        /*--------------TEMPERATURA------------- */
        public static void ejecutarConversorTemperatura(){
            System.out.println("\nEjercicio conversor de temperatura");

            TemperaturaMain.main(new String[]{});
        }
    }