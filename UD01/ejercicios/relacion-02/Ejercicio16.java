import java.util.Scanner;

public class Ejercicio16 {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    System.out.println("ÁREAS");
    System.out.println("-----");
    System.out.print("Introduce la longitud del lado A: ");
    double ladoA = Double.parseDouble(scan.next());
    System.out.print("Introduce la longitud del lado B: ");
    double ladoB = Double.parseDouble(scan.next());
    System.out.print("Introduce la longitud del lado C: ");
    double ladoC = Double.parseDouble(scan.next());
    
    /* El área tiene dos partes. En la inferior es un rectángulo de lados B y C
     * y en la parte superior un triángulo de base B y altura A - C
     */
    double areaInferior = ladoB * ladoC;
    double areaSuperior = ladoB * (ladoA - ladoC) / 2;
    double areaTotal = areaInferior + areaSuperior;

    System.out.println("El área total de la parcela es de " +  areaTotal);
  }
}
  