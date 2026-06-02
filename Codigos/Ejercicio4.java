import java.util.ArrayList;
import java.util.Scanner;
 
public class Ejercicio4 {
    static ArrayList<String> datos = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
 
    static void mostrar() {
        if (datos.isEmpty()) { System.out.println("(Lista vacía)"); return; }
        for (int i = 0; i < datos.size(); i++)
            System.out.println(i + ". " + datos.get(i));
    }
 
    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n=== MENU CRUD ===");
            System.out.println("1.Agregar 2.Mostrar 3.Actualizar 4.Eliminar 0.Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();
 
            if (opcion == 1) {
                System.out.print("Ingrese item: ");
                datos.add(sc.next());
                System.out.println("Agregado correctamente.");
            } else if (opcion == 2) {
                mostrar();
            } else if (opcion == 3) {
                mostrar();
                System.out.print("Posicion a actualizar: ");
                int pos = sc.nextInt();
                if (pos >= 0 && pos < datos.size()) {
                    System.out.print("Nuevo valor: ");
                    datos.set(pos, sc.next());
                } else System.out.println("Posicion invalida.");
            } else if (opcion == 4) {
                mostrar();
                System.out.print("Posicion a eliminar: ");
                int pos = sc.nextInt();
                if (pos >= 0 && pos < datos.size()) datos.remove(pos);
                else System.out.println("Posicion invalida.");
            }
        } while (opcion != 0);
        sc.close();
    }
}
