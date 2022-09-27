import java.util.Scanner;

public class Ejercicio11 {
  public static void main(String[] args) {
    
    final double PORCENTAJECOMISION = 0.1;

    Scanner scan = new Scanner(System.in);

    System.out.println("CÁLCULO DE COMISIONES");
    System.out.println("---------------------");
    System.out.print("Introduce el importe de la primera venta: ");
    double importePrimeraVenta = Double.parseDouble(scan.next());
    System.out.print("Introduce el importe de la segunda venta: ");
    double importeSegundaVenta = Double.parseDouble(scan.next());
    System.out.print("Introduce el importe de la tercera venta: ");
    double importeTerceraVenta = Double.parseDouble(scan.next());
    System.out.print("Introduce el salario base: ");
    double importeSalarioBase = Double.parseDouble(scan.next());
    
    double salarioTotal = importeSalarioBase + ((importePrimeraVenta + importeSegundaVenta + importeTerceraVenta) * PORCENTAJECOMISION);

    System.out.println("El importe total del salario del comercial es de " + salarioTotal);
  }
}
  