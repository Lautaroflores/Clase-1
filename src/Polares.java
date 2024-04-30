/* La coordenadas propias de la clase anterior Punto representan coordenadas
rectangulares (coordenadas x, y). Estas coordenadas se pueden escribir como
coordenadas polares (radio, ángulo) de la siguiente manera:
x = radio * cos(ángulo)
y = radio * sen(ángulo)
Implemente la clase Polar, cuyos miembros sean el radio y ángulo, y que posea
métodos de obtención de cada coordenada polar, y otro que convierta las coordenadas
polares en rectangulares. Programar un método que permita sumar coordenadas
polares. Realizar un método de prueba para la clase.
*/

public class Polares extends Punto{
    private float radio;
    private float angulo;

    public Polares(float radio, float angulo) {
        super(radio * (float) Math.cos(angulo), radio * (float) Math.sin(angulo));
        this.radio = radio;
        this.angulo = angulo;
    }

    public float getRadio() {
        return radio;
    }

    public float getAngulo() {
        return angulo;
    }

    public Punto convertirRectangular() {
        return new Punto(radio * (float) Math.cos(angulo), radio * (float) Math.sin(angulo));
    }

    public Polares suma(Polares otroPolar) {
        return new Polares(this.radio + otroPolar.radio, this.angulo + otroPolar.angulo);
    }

    public static void main(String[] args) {
        Polares polar1 = new Polares(1, 2);
        Polares polar2 = new Polares(3, 4);

        System.out.println("Polar 1: " + polar1.getRadio() + ", " + polar1.getAngulo());
        System.out.println("Polar 2: " + polar2.getRadio() + ", " + polar2.getAngulo());

        Punto punto = polar1.convertirRectangular();
        System.out.println("Punto: " + punto.getX() + ", " + punto.getY());

        Polares polar3 = polar1.suma(polar2);
        System.out.println("Polar 3: " + polar3.getRadio() + ", " + polar3.getAngulo());
    }
}
