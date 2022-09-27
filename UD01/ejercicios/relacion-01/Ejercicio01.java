public class Ejercicio01 {
  public static void main(String[] args) {
    int valor1 = 256;
    int valor2 = 398;

    int suma = valor1 + valor2;
    int resta = valor1 - valor2;
    int producto = valor1 * valor2;
    int cociente = valor1 / valor2;
    int modulo = valor1 % valor2;
    
    System.out.println("La primera variable vale " + valor1);
    System.out.println("La segunda variable vale " + valor2);

    System.out.println("La suma de los dos valores vale " + suma);
    System.out.println("La diferencia de los dos valores vale " + resta);
    System.out.println("El producto de los dos valores vale " + producto);
    System.out.println("El cociente de los dos valores vale " + cociente);
    System.out.println("El resto de la división de los dos valores vale " + modulo);
  }
}
