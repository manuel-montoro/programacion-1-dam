import java.util.Scanner;

public class CambioMoneda {

  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("EXAMEN DE tu_nombre_aqui. CALCULO DE CAMBIO DE MONEDA");
    
    System.out.print("Introduzca la cantidad de dinero en euros (sin céntimos) : ");
    int eurosOriginales = Integer.parseInt(scan.next());
    
    int euros = eurosOriginales;
    
    int billetes500 = euros / 500;
    euros %= 500;
    int billetes200 = euros / 200;
    euros %= 200;
    int billetes100 = euros / 100;
    euros %= 100;
    int billetes50 = euros / 50;
    euros %= 50;
    int billetes20 = euros / 20;
    euros %= 20;
    int billetes10 = euros / 10;
    euros %= 10;
    int billetes5 = euros / 5;
    euros %= 5;
    int monedas2 = euros / 2;
    euros %= 2;

    System.out.print("Para tener " + eurosOriginales + " se necesitan "
        + billetes500 + " billetes de 500 euros, "
        + billetes200 + " billetes de 200 euros, "
        + billetes100 + " billetes de 100 euros, "
        + billetes50 + " billetes de 50 euros, "
        + billetes20 + " billetes de 20 euros, "
        + billetes10 + " billetes de 10 euros, "
        + billetes5 + " billetes de 5 euros, "
        + monedas2 + " monedas de 2 euros y "
        + euros + " monedas de 1 euro");
  }

}
