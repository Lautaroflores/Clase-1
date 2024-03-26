/*Ejercicio: Clases y Métodos
Crear una clase llamada Rectangulo que represente un rectángulo. 
Esta clase debe tener los siguientes atributos:
Largo (double)
Ancho (double)
Agregar métodos para calcular el área y el perímetro del rectángulo. 
Luego, crear objetos de tipo Rectangulo, calcular y mostrar sus áreas y perímetros. */

package paquete2;

public class Rectangulo {

    private double Largo;
    private double Ancho;
    
    public Rectangulo(double largo, double ancho) {
        this.Largo = largo;
        this.Ancho = ancho;
    }
    
    public void imprimirInformacion (){
        System.out.println("Area: "+ Largo*Ancho + ", Perimetro: " + 2*(Ancho+Largo));
    }
}
