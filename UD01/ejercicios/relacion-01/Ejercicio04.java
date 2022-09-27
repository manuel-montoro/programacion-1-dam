public class Ejercicio04 {
  public static void main(String[] args) {
    
    final double IVA = 0.21;
    double base = 765;

    double totalFactura = base * (1 + IVA);

	  
    System.out.println("Al aplicar un IVA del " + (IVA * 100) + " a la base " + base + " obtenemos un total de " + totalFactura);
  }
}
