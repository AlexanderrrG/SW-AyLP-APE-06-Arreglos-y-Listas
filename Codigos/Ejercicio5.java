import java.util.ArrayList;
import java.util.Scanner;
 
public class Ejercicio5 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Double> notas   = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
 
        System.out.print("¿Cuantos estudiantes? ");
        int n = sc.nextInt();
 
        for (int i = 0; i < n; i++) {
            System.out.print("Nombre: ");    nombres.add(sc.next());
            System.out.print("Nota (0-10): "); notas.add(sc.nextDouble());
        }
 
        System.out.println("\n--- Listado ---");
        for (int i = 0; i < nombres.size(); i++) {
            String estado = notas.get(i) >= 7 ? "APROBADO" : "REPROBADO";
            System.out.println(nombres.get(i) + " - " + notas.get(i) + " [" + estado + "]");
        }
        sc.close();
    }
}

