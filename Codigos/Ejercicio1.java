import java.util.ArrayList;
import java.util.Scanner;
 
public class Ejercicio1 {
    public static void main(String[] args) {
        // Crear un ArrayList para almacenar nombres
        ArrayList<String> estudiantes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
 
        System.out.println("=== REGISTRO DE 5 ESTUDIANTES(JAVA) ===");
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese nombre del estudiante " + (i+1) + ": ");
            String nombre = sc.next();
            estudiantes.add(nombre); // Agregar al ArrayList
        }
 
        // Mostrar la lista completa
        System.out.println("\n_____Lista de Estudiantes____");
        for (int i = 0; i < estudiantes.size(); i++) {
            System.out.println((i+1) + ". " + estudiantes.get(i));
        }
        sc.close();
    }
}
