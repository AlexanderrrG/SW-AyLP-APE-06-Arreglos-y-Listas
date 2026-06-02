import java.util.ArrayList;
import java.util.Scanner;
 
public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<String> productos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
 
        System.out.print("¿Cuantos productos desea registrar? ");
        int n = sc.nextInt();
 
        // Registrar productos
        for (int i = 0; i < n; i++) {
            System.out.print("Producto " + (i+1) + ": ");
            productos.add(sc.next());
        }
 
        // Buscar producto
        System.out.print("Registro y Búsqueda de Productos(Java) " );
        System.out.print("\nIngrese el producto a buscar: ");
        String buscar = sc.next();
 
        int idx = productos.indexOf(buscar);
        if (idx != -1) {
            System.out.println("Producto ENCONTRADO en posicion: " + idx);
        } else {
            System.out.println("Producto NO encontrado.");
        }
        sc.close();
    }
}
