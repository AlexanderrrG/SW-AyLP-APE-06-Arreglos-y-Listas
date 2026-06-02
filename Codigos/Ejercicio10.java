import java.util.LinkedList;
import java.util.Scanner;
 
public class Ejercicio10 {
    public static void main(String[] args) {
        LinkedList<String> fila = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
 
        System.out.print("¿Cuantos clientes en la fila inicial? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Cliente " + (i+1) + ": ");
            fila.add(sc.next());
        }
 
        System.out.println("\n--- SIMULACION DE ATENCION ---");
        while (!fila.isEmpty()) {
            System.out.println("Atendiendo a: " + fila.removeFirst());
            if (!fila.isEmpty())
                System.out.println("Siguiente: " + fila.getFirst());
            System.out.println("Clientes restantes: " + fila.size());
        }
        System.out.println("\nFila de atencion finalizada.");
        sc.close();
    }
}
