import java.util.Scanner;

public class Ejercicio15 {
  public static void main(String[] args) {
    
    final double PI = 3.1415926;

    Scanner scan = new Scanner(System.in);

    System.out.println("CÍRCULOS");
    System.out.println("--------");
    System.out.print("Introduce el radio del círculo: ");
    double radio = Double.parseDouble(scan.next());
    
    double circunferencia = 2 * PI * radio;
    double area = PI * radio * radio;

    System.out.println("La circunferencia del círculo es de " + circunferencia + " y su área es " + area);
  }
}
  