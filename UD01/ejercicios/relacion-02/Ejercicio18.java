import java.util.Scanner;

public class Ejercicio18 {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    System.out.println("COSTE DE LLENAR UNA PISCINA");
    System.out.println("---------------------------");
    System.out.println("Las siguientes medidas deben indicarse en metros");
    System.out.print("Introduce la longitud de la piscina: ");
    double longitud = Double.parseDouble(scan.next());
    System.out.print("Introduce el ancho de la piscina: ");
    double ancho = Double.parseDouble(scan.next());
    System.out.print("Introduce la profundidad de la piscina: ");
    double profundidad = Double.parseDouble(scan.next());
    System.out.print("¿Cuánto cuesta el litro de agua?: ");
    double costePorLitro = Double.parseDouble(scan.next());
    
    double litros = longitud * ancho * profundidad * 1000;
    double precio = litros * costePorLitro;

    System.out.println("La piscina necesita " + litros + " litros para ser llenada, con un coste total de " + precio);
  }
}
  