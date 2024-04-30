/*Escribir un programa que permita convertir una temperatura de grados Celsius a grados Fahrenheit o viceversa.
Debe solicitar la temperatura y la unidad de entrada, y luego mostrar la temperatura convertida. */

package temperatura;

import java.util.Scanner;

public class Temperatura {
    private Scanner sc;
    private double temperaturaConvertida;

    public Temperatura() {
        sc =new Scanner(System.in);
    }

    public void pedirTemperatura() {
        System.out.print("Ingrese la temperatura: ");
        double temperatura= sc.nextDouble();

        System.out.print("\n¿La temperatura está en Celsius o Fahrenheit (c/f)?: ");
        char unidad = sc.next().charAt(0);

        switch (unidad) {
            case 'c':
                temperaturaConvertida = CaF(temperatura);
                System.out.println("Equivale a: " + temperaturaConvertida + "°F");
                break;
            case 'f':
                temperaturaConvertida = FaC(temperatura);
                System.out.println("Equivale a: " + temperaturaConvertida + "°C");
                break;
            default:
                System.out.println("Ingrese c o f");
                break;
        }
        
    }  
    //Paso de celsius a fahrenheit
    public double CaF( double celsius) {
        return (celsius * 9/5) + 32;
    }

    //Paso defahrenheit a celsius
    public double FaC (double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

}
