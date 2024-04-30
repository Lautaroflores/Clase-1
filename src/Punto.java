/* 17) Implemente la clase Punto (pares de coordenadas de tipo float x, y). Defina
 * constructores y métodos para asignar valores a las coordenadas de los puntos, retornar
 * el valor de cada coordenada, y sumar dos puntos, retornando su resultado. Definir un
 * método booleano de igualdad entre dos puntos.
 */

public class Punto {
    private float x;
    private float y;

    public Punto(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float setX(float x) {
        return this.x = x;
    }

    public float setY(float y) {
        return this.y = y;
    }

    public boolean igualdad(Punto otroPunto) {
        return this.x == otroPunto.x && this.y == otroPunto.y;
    }

    public Punto suma(Punto otroPunto) {
        return new Punto(this.x + otroPunto.x, this.y + otroPunto.y);
    }

    public static void main(String[] args) {
        Punto punto1 = new Punto(5, 2);
        Punto punto2 = new Punto(3, 4);

        System.out.println("Punto 1: " + punto1.getX() + ", " + punto1.getY());
        System.out.println("Punto 2: " + punto2.getX() + ", " + punto2.getY());

        Punto punto3 = punto1.suma(punto2);
        System.out.println("Punto 3: " + punto3.getX() + ", " + punto3.getY());

        System.out.println("Punto 1 igual a Punto 2: " + punto1.igualdad(punto2));
    }


}
