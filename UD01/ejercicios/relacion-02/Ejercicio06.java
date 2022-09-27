import java.util.Scanner;

public class Ejercicio06 {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    System.out.println("CALCULADORA DE IVA");
    System.out.println("------------------");
    System.out.print("Introduce la base imponible de la factura: ");
    double baseImponible = Double.parseDouble(scan.next());
    System.out.print("Introduce el valor del IVA, en porcentaje: ");
    double iva = Double.parseDouble(scan.next());

    double totalFactura = baseImponible * (1 + iva / 100.0);

    System.out.println("El total de la factura con base imponible " + baseImponible + " e IVA " + iva + "% es de " + totalFactura);
  }
}
  