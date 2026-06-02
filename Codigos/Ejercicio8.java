import java.util.ArrayList;
 
public class Ejercicio8 {
    public static void main(String[] args) {
        final int N = 100000;
 
        // Inserción en arreglo
        int[] arreglo = new int[N];
        long t1 = System.nanoTime();
        for (int i = 0; i < N; i++) arreglo[i] = i;
        long t2 = System.nanoTime();
 
        // Inserción en ArrayList
        ArrayList<Integer> lista = new ArrayList<>();
        long t3 = System.nanoTime();
        for (int i = 0; i < N; i++) lista.add(i);
        long t4 = System.nanoTime();
 
        System.out.println("Insercion de " + N + " elementos:");
        System.out.println("Arreglo  : " + (t2-t1)/1000 + " microsegundos");
        System.out.println("ArrayList: " + (t4-t3)/1000 + " microsegundos");
    }
}
