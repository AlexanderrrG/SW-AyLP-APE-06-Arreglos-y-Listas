
import java.util.ArrayList;
import java.util.Scanner;
 
public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Double> notas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        double suma = 0;
 
        System.out.println("=== REGISTRO DE 6 NOTAS ===");
        for (int i = 0; i < 6; i++) {
            System.out.print("Ingrese nota " + (i+1) + " (0-10): ");
            double nota = sc.nextDouble();
            notas.add(nota); // Agregar al ArrayList
            suma += nota;
        }
 
        double promedio = suma / 6;
        System.out.println("\n--- Notas Registradas ---");
        for (int i = 0; i < notas.size(); i++) {
            System.out.println("Nota " + (i+1) + ": " + notas.get(i));
        }
        System.out.printf("Promedio General: %.2f%n", promedio);
        sc.close();
    }
}
