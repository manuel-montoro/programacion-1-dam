import java.util.Scanner;

public class Ejercicio13 {
  public static void main(String[] args) {
    
    final double PORCENTAJEGINECOLOGIA = 40.0 / 100.0;
    final double PORCENTAJETRAUMATOLOGIA = 35.0 / 100.0;
    final double PORCENTAJEPEDIATRIA = 25.0 / 100.0;

    Scanner scan = new Scanner(System.in);

    System.out.println("PRESUPUESTOS DE HOSPITAL");
    System.out.println("------------------------");
    System.out.print("Introduce el presupuesto total del hospital: ");
    double presupuestoTotal = Double.parseDouble(scan.next());
    
    double presupuestoGinecologia = presupuestoTotal * PORCENTAJEGINECOLOGIA;
    double presupuestoTraumatologia = presupuestoTotal * PORCENTAJETRAUMATOLOGIA;
    double presupuestoPediatria = presupuestoTotal * PORCENTAJEPEDIATRIA;

    System.out.println("El presupuesto de Ginecología será de " + presupuestoGinecologia
      + ", el de Traumatología de " + presupuestoTraumatologia
      + " y el de Pediatría de " + presupuestoPediatria);
  }
}
  