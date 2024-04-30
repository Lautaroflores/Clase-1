/*
 * a) Implemente la clase Hora que contenga miembros datos separados para almacenar
 * horas, minutos y segundos. Un constructor inicializará estos datos en 0 y otro a valores
 * dados. Una función miembro deberá visualizar la hora en formato hh:mm:ss. Otra
 * función miembro sumará dos objetos de tipo hora, retornando la hora resultante.
 * Realizar otra versión de la suma que asigne el resultado de la suma en el primer objeto
 * hora.
 */

public class Hora {

    private int hora;
    private int minutos;
    private int segundos;
    
    public Hora( int hora, int minutos, int segundos) {
        this.hora  = hora;
        this.minutos=minutos;
        this.segundos=segundos;
    }
    public Hora() {
        hora=minutos=segundos= 0;
    }

    public void formato() {
        System.out.println(hora + ":" + minutos + ":"+ segundos);
    }

    public Hora suma(Hora horaNueva) {
        int nuevaHora=this.hora + horaNueva.hora;
        int nuevosMinutos= this.minutos + horaNueva.minutos;
        int nuevosSegundos = this.segundos + horaNueva.segundos;
        
        //Esto para que llegue solo hasta 60 mins y segs
        if (nuevosSegundos >= 60) {
            nuevosMinutos++;
            nuevosSegundos -= 60;
        }
        if (nuevosMinutos >= 60) {
            nuevaHora++;
            nuevosMinutos -= 60;
        }

        return new Hora(nuevaHora, nuevosMinutos, nuevosSegundos);

    }
    //Reemplazo en el original lo que yo le pase
    public void nuevaAsignacion(Hora otraHora) {
        this.hora += otraHora.hora;
        this.minutos += otraHora.minutos;
        this.segundos += otraHora.segundos;
        
        if (this.segundos >= 60) {
            this.minutos++;
            this.segundos -= 60;
        }
        if (this.minutos >= 60) {
            this.hora++;
            this.minutos -= 60;
        }
    }
    public static void main(String[] args) throws Exception {
        Hora hora1 = new Hora(2,9,7);
        Hora hora2 = new Hora(3, 5, 22);
        Hora hora3 = new Hora();
        System.out.print("Hora 1: ");
        hora1.formato();
        System.out.print("Hora 2: ");
        hora2.formato();

        //Sumo las horas y las asigno a resultado
        Hora resultado = hora1.suma(hora2);    
        System.out.println("Asignacion del resultado en hora 3: ");

        //Le asigno 'resultado' a la hora 3
        hora3.nuevaAsignacion(resultado);
        hora3.formato();
    }
}