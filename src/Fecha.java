/*
 * 1) Implemente la clase Fecha, que permita representar una terna de día, mes y año, todos
 * de tipo entero. Programar un método que determine si una fecha es mayor a otra.
 * Programar la sobrecarga del método toString().
 */

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public boolean mayor(Fecha otraFecha) {
        if (this.anio > otraFecha.anio) {
            return true;
        } else if (this.anio == otraFecha.anio) {
            if (this.mes > otraFecha.mes) {
                return true;
            } else if (this.mes == otraFecha.mes) {
                return this.dia > otraFecha.dia;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + anio;
    }

    public static void main(String[] args) {
        Fecha fecha1 = new Fecha(1, 2, 2021);
        Fecha fecha2 = new Fecha(2, 2, 2021);

        System.out.println("Fecha 1: " + fecha1);
        System.out.println("Fecha 2: " + fecha2);

        System.out.println("Fecha 1 mayor a Fecha 2: " + fecha1.mayor(fecha2));
    }

}
