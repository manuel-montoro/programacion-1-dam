import java.util.Scanner;

public class Ejercicio08 {
  public static void main(String[] args) {
    
    final double PI = 3.1415926;

    Scanner scan = new Scanner(System.in);

    System.out.println("VOLUMEN DE UN CONO");
    System.out.println("------------------");
    System.out.print("Introduce el radio de la base del cono: ");
    double radio = Double.parseDouble(scan.next());
    System.out.print("Introduce la altura del cono: ");
    double altura = Double.parseDouble(scan.next());
    
    double volumen = (PI * radio * radio * altura) / 3;

    System.out.println("El volumen de un cono de radio " + radio + " y altura " + altura + " es de " + volumen);
  }
}
  