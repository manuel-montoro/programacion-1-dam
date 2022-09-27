import java.util.Scanner;

public class Ejercicio09 {
  public static void main(String[] args) {
    
    final double KBPORMB = 1024;

    Scanner scan = new Scanner(System.in);

    System.out.println("CONVERSOR DE MB a KB");
    System.out.println("--------------------");
    System.out.print("Introduce una cantidad de almacenamiento en MB: ");
    double mb = Double.parseDouble(scan.next());
    
    double kb = mb * KBPORMB;

    System.out.println(mb + " MB equivalen a " + kb + " KB");
  }
}
  