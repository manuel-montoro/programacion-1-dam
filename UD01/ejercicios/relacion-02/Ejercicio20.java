import java.util.Scanner;

public class Ejercicio20 {
  public static void main(String[] args) {
    
    final int SEGUNDOSPORMINUTO = 60;

    Scanner scan = new Scanner(System.in);

    System.out.println("FACTURA TELEFÓNICA");
    System.out.println("------------------");
    System.out.print("Introduce el coste de establecimiento de llamada (en euros): ");
    double costeEstablecimiento  = Double.parseDouble(scan.next());
    System.out.print("Introduce el coste por minuto (en euros): ");
    double costePorMinuto  = Double.parseDouble(scan.next());
    System.out.print("Introduce la duración de la llamada (en segundos): ");
    int duracion  = Integer.parseInt(scan.next());
    
    int minutos = duracion / SEGUNDOSPORMINUTO;
    double coste = costeEstablecimiento + costePorMinuto * minutos;
    System.out.println("El coste de la llamada es de " + coste + " euros");
  }
}
  