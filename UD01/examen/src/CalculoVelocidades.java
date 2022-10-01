import java.util.Scanner;

public class CalculoVelocidades {

  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("EXAMEN DE tu_nombre_aqui. CALCULO DE VELOCIDADES");
    
    System.out.print("Introduzca la velocidad inicial del vehículo (en m/s): ");
    double velocidadInicial = Double.parseDouble(scan.next());
    System.out.print("Introduzca la acceleración del vehículo (en m/s2): ");
    double aceleracion = Double.parseDouble(scan.next());
    System.out.print("Introduzca el tiempo que se acelera (en s): ");
    double tiempoAceleracion = Double.parseDouble(scan.next());
    
    double velocidadFinal = velocidadInicial + aceleracion * tiempoAceleracion;
    System.out.println("La velocidad final del vehiculo es de " + velocidadFinal + " m/s");

    System.out.print("Introduzca la masa del vehículo (en kg): ");
    double masa = Double.parseDouble(scan.next());

    double energiaCinetica = (masa * velocidadFinal * velocidadFinal) / 2.0;
    System.out.println("La energía cinética del vehiculo es de " + energiaCinetica + " julios");

    System.out.print("Introduzca la aceleración de frenada (en m/s2 y con signo positivo): ");
    double aceleracionFrenada = Double.parseDouble(scan.next());

    double tiempoFrenada = velocidadFinal / aceleracionFrenada;
    System.out.println("El tiempo que tarda en frenar es de " + tiempoFrenada + " segundos");
  }

}
