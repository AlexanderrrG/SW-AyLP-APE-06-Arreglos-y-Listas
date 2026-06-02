import java.util.LinkedList;
import java.util.Scanner;
 
public class Ejercicio9 {
    public static void main(String[] args) {
        LinkedList<String> turnos = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int op;
 
        do {
            System.out.println("\n=== SISTEMA DE TURNOS (LinkedList) ===");
            System.out.println("1.Agregar 2.Atender 3.Ver 0.Salir");
            System.out.print("-> ");
            op = sc.nextInt();
 
            if (op == 1) {
                System.out.print("Nombre del paciente: ");
                String nombre = sc.next();
                turnos.addLast(nombre); // Agregar al final
                System.out.println("Turno asignado a " + nombre);
            } else if (op == 2) {
                if (!turnos.isEmpty()) {
                    System.out.println("Atendiendo a: " + turnos.removeFirst());
                } else System.out.println("No hay turnos pendientes.");
            } else if (op == 3) {
                System.out.println("Turnos en espera:");
                for (String t : turnos) System.out.println("  - " + t);
            }
        } while (op != 0);
        sc.close();
    }
}

