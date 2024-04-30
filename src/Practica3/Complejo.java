/*
 * 19) Implemente la clase Complejo (números complejos). Defina constructores y el método
 * de multiplicación de complejos. Además programe tres funciones suma(), una que
 * reciba dos números de tipo int, otra que reciba dos números de tipo float, y otra que
 * reciba dos números complejos.

 */

public class Complejo {

    private float numero1;
    private float numero2;

    public Complejo(float numero1, float numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public float sumaFloat() {
        return numero1 + numero2;
    }

    public float multiplicacion() {
        return numero1 * numero2;
    }

    public int sumaInt() {
        int numero1Int = Math.round(numero1);
        int numero2Int = Math.round(numero2);
        return numero1Int + numero2Int;
    }

    public static void main(String[] args) {
        Complejo complejo1 = new Complejo(1.5f, 2.5f);
        Complejo complejo2 = new Complejo(3.5f, 4.5f);

        System.out.println("Complejo 1: " + complejo1.numero1 + ", " + complejo1.numero2);
        System.out.println("Complejo 2: " + complejo2.numero1 + ", " + complejo2.numero2);

        System.out.println("Suma de complejos: " + complejo1.sumaFloat());
        System.out.println("Multiplicación de complejos: " + complejo1.multiplicacion());
        System.out.println("Suma de enteros: " + complejo1.sumaInt());
    }



}

