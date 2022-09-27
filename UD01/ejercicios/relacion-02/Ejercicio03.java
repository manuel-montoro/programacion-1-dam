import java.util.Scanner;

public class Ejercicio03 {
  public static void main(String[] args) {
    
    final double PESETASPOREURO = 166.386;

    Scanner scan = new Scanner(System.in);

    System.out.println("CONVERSOR DE EUROS A PESETAS");
    System.out.println("----------------------------");
    System.out.print("Introduce una cantidad de dinero en euros: ");
    double euros = Double.parseDouble(scan.next());

    double pesetas = euros * PESETASPOREURO;

    System.out.println(euros + " euros equivalen a " +  pesetas + " pesetas");
  }
}
  