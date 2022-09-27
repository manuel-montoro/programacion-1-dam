import java.util.Scanner;

public class Ejercicio07 {
  public static void main(String[] args) {
    
    final double PRECIOHORA = 12;

    Scanner scan = new Scanner(System.in);

    System.out.println("CALCULADORA DE SALARIOS");
    System.out.println("-----------------------");
    System.out.print("Introduce el total de horas trabajadas: ");
    int horasTrabajadas = Integer.parseInt(scan.next());

    double importe = horasTrabajadas * PRECIOHORA;

    System.out.println("El importe a cobrar por el trabajador por " + horasTrabajadas + " horas, a un precio de " + PRECIOHORA + " la hora, es de " + importe);
  }
}
  