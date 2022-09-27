import java.util.Scanner;

public class Ejercicio10 {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    System.out.println("NOTAS MEDIAS");
    System.out.println("------------");
    System.out.print("Introduce la nota que has sacado en el primer examen: ");
    double notaPrimerExamen = Double.parseDouble(scan.next());
    System.out.print("Introduce la nota media que te gustaría tener en el trimestre: ");
    double notaMedia = Double.parseDouble(scan.next());
    
    double notaSegundoExamen = notaMedia * 2 - notaPrimerExamen;

    System.out.println("Para obtener como nota media " + notaMedia
      + " en la evaluación, habiendo obtenido " + notaPrimerExamen
      + " en el primer examen, necesitas obtener "
      + notaSegundoExamen + " en el segundo examen");
  }
}
  