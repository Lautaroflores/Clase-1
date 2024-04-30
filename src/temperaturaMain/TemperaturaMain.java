package temperaturaMain;

import temperatura.Temperatura;
// Solo sirve para llamar al paquete temperatura y tenerlo aunque sea un poco mas ordenado
public class TemperaturaMain {
    public static void main(String[] args) {
        Temperatura conversor = new Temperatura();
        conversor.pedirTemperatura();
    }
}
