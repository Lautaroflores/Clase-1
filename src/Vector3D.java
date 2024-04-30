/*18) Implemente la clase Vector3D (ternas de coordenadas de tipo float x, y, z). Defina
constructores y métodos para asignar valores a las coordenadas de los vectores3D,
retornar el valor de cada coordenada, y sumar dos vectores3D, retornando su resultado.
Definir un método booleano de igualdad entre dos vectores3D. Implementar esta clase a
partir de la implementación de la clase Punto.
 */

public class Vector3D extends Punto {
    private float z;

    public Vector3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public float setZ(float z) {
        return this.z = z;
    }

    public boolean igualdad(Vector3D otroVector) {
        return this.getX() == otroVector.getX() && this.getY() == otroVector.getY() && this.z == otroVector.z;
    }

    public Vector3D suma(Vector3D otroVector) {
        return new Vector3D(this.getX() + otroVector.getX(), this.getY() + otroVector.getY(), this.z + otroVector.z);
    }

    public static void main(String[] args) {
        Vector3D vector1 = new Vector3D(1, 2, 3);
        Vector3D vector2 = new Vector3D(4, 5, 6);

        System.out.println("Vector 1: " + vector1.getX() + ", " + vector1.getY() + ", " + vector1.getZ());
        System.out.println("Vector 2: " + vector2.getX() + ", " + vector2.getY() + ", " + vector2.getZ());

        Vector3D vector3 = vector1.suma(vector2);
        System.out.println("Vector 3: " + vector3.getX() + ", " + vector3.getY() + ", " + vector3.getZ());

        System.out.println("Vector 1 igual a Vector 2: " + vector1.igualdad(vector2));
    }
}
