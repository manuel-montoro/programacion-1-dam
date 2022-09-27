import java.util.Scanner;

public class Ejercicio04 {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    System.out.println("CALCULADOR DE ÁREAS DE RECTÁNGULOS");
    System.out.println("----------------------------------");
    System.out.print("Introduce la longitud de un lado del rectángulo: ");
    double lado1 = Double.parseDouble(scan.next());
    System.out.print("Introduce la longitud del otro lado del rectángulo: ");
    double lado2 = Double.parseDouble(scan.next());

    double area = lado1 * lado2;

    System.out.println("El área de un rectangulo de " + lado1 + " x " + lado2 + " es " + area);
  }
}
  