import java.util.Scanner;

public class Ejercicio01 {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    System.out.println("OPERACIONES ARITMÉTICAS");
    System.out.println("-----------------------");
    System.out.print("Introduce un número entero: ");
    int valor1 = Integer.parseInt(scan.next());
    System.out.print("Introduce otro número entero: ");
    int valor2 = Integer.parseInt(scan.next());

    int suma = valor1 + valor2;
    int resta = valor1 - valor2;
    int producto = valor1 * valor2;
    int cociente = valor1 / valor2;
    int resto = valor2 % valor2;

    System.out.println("La suma de " + valor1 + " y " + valor2 + " vale " + suma);
    System.out.println("La diferencia de " + valor1 + " menos " + valor2 + " vale " + resta);
    System.out.println("El producto de " + valor1 + " por " + valor2 + " vale " + producto);
    System.out.println("El cociente de " + valor1 + " entre " + valor2 + " vale " + cociente);
    System.out.println("El resto de la división de " + valor1 + " entre " + valor2 + " vale " + resto);
  }
}
  