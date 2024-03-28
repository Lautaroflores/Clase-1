package entrada;
import salida.*;
import java.util.Scanner;

public class EntradaConsola {
    public static void main(String[] args) { //Si es main entonces se ejecuta primero!!

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un numero entero: ");
        int cantidadEntradas = sc.nextInt();

        sc.nextLine();/*  me lee el \n que hay implicitamente al lado del numero que pongo
                       no devuelve ningun valor, simplemente me lo saca de encima para mas comodidad*/
        
        SalidaConsola salida = new SalidaConsola(); //Llamo a la funcion del otro paquete


        for(int i=0; i < cantidadEntradas; i++ ) {
            System.out.println("Ingrese el texto n° " + (i+1) + ": ");
            String entrada = sc.nextLine(); //Ahora sí lo uso para leer el texto que puse
            salida.mostrar("Salida n° " + (i+1) + ": " + entrada);
        }
        
        sc.close();
        
    }

}
