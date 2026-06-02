import java.util.ArrayList;
import java.util.Scanner;
 
public class Ejercicio6 {
    static ArrayList<String>  nombres     = new ArrayList<>();
    static ArrayList<Integer> cantidades  = new ArrayList<>();
    static ArrayList<Double>  precios     = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
 
    static void mostrar() {
        System.out.println("\n--- INVENTARIO ---");
        for (int i = 0; i < nombres.size(); i++)
            System.out.println(i+". "+nombres.get(i)+" | Cant: "+cantidades.get(i)+" | $"+precios.get(i));
    }
 
    public static void main(String[] args) {
        int op;
        do {
            System.out.print("1.Agregar 2.Ver 3.Eliminar 0.Salir -> ");
            op = sc.nextInt();
            if (op == 1) {
                System.out.print("Nombre: ");    nombres.add(sc.next());
                System.out.print("Cantidad: ");  cantidades.add(sc.nextInt());
                System.out.print("Precio: ");    precios.add(sc.nextDouble());
            } else if (op == 2) {
                mostrar();
            } else if (op == 3) {
                mostrar();
                System.out.print("Posicion: "); int pos = sc.nextInt();
                if (pos >= 0 && pos < nombres.size()) {
                    nombres.remove(pos); cantidades.remove(pos); precios.remove(pos);
                }
            }
        } while (op != 0);
        sc.close();
    }
}

