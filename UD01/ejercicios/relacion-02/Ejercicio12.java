import java.util.Scanner;

public class Ejercicio12 {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    System.out.println("PORCENTAJES DE INVERSIÓN");
    System.out.println("------------------------");
    System.out.print("Introduce la cantidad que invierte la primera persona: ");
    double inversion1 = Double.parseDouble(scan.next());
    System.out.print("Introduce la cantidad que invierte la segunda persona: ");
    double inversion2 = Double.parseDouble(scan.next());
    System.out.print("Introduce la cantidad que invierte la tercera persona: ");
    double inversion3 = Double.parseDouble(scan.next());
    
    double inversionTotal = inversion1 + inversion2 + inversion3;
    double porcentaje1 = inversion1 / inversionTotal;
    double porcentaje2 = inversion2 / inversionTotal;
    double porcentaje3 = inversion3 / inversionTotal;

    System.out.println("El primer inversor ha puesto el " + porcentaje1 + "% de la inversion, el segundo el " + porcentaje2 + "% y el tercero el " + porcentaje3 + "%");
  }
}
  