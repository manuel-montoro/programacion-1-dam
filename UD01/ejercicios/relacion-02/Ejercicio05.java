import java.util.Scanner;

public class Ejercicio05 {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    System.out.println("CALCULADOR DE ÁREAS DE TRIÁNGULOS");
    System.out.println("---------------------------------");
    System.out.print("Introduce la base del triángulo: ");
    double base = Double.parseDouble(scan.next());
    System.out.print("Introduce la altura del triángulo: ");
    double altura = Double.parseDouble(scan.next());

    double area = base * altura / 2.0;

    System.out.println("El área de un triángulo de base " + base + " y altura " + altura + " es " + area);
  }
}
  