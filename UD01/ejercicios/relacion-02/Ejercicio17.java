import java.util.Scanner;

public class Ejercicio17 {
  public static void main(String[] args) {
    
    final double LITROSPORGALON = 3.785;
    
    Scanner scan = new Scanner(System.in);

    System.out.println("CÁLCULO DE VALOR DE PRODUCCIÓN DE LECHE");
    System.out.println("---------------------------------------");
    System.out.print("Introduce la cantidad de litros producidos en el dia: ");
    double litros = Double.parseDouble(scan.next());
    System.out.print("Introduce el precio de un galón de leche: ");
    double precioPorGalon = Double.parseDouble(scan.next());
    
    double galones = litros / LITROSPORGALON;
    double precioTotal = galones * precioPorGalon;

    System.out.println(litros + " litros equivalen a " + galones + " galones y valen " + precioTotal);
  }
}
  