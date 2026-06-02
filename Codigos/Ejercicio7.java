import java.util.ArrayList;
 
public class Ejercicio7 {
    public static void main(String[] args) {
        // --- Arreglo estático ---
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("Arreglo: ");
        for (int v : arreglo) System.out.print(v + " ");
        System.out.println();
 
        // --- ArrayList dinámico ---
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 1; i <= 10; i++) lista.add(i);
        System.out.print("ArrayList: ");
        for (int v : lista) System.out.print(v + " ");
        System.out.println();
 
        System.out.println("\nComparacion:");
        System.out.println("Arreglo   : tamano fijo, acceso por indice [i].");
        System.out.println("ArrayList : tamano dinamico, metodos add/remove/get.");
    }
}
