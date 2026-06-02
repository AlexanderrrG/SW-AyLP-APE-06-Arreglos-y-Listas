#include <iostream>
#include <vector>
#include <string>
using namespace std;
 
struct Producto { string nombre; int cantidad; float precio; };
 
void mostrarInventario(const vector<Producto>& inv) {
    cout << "\n--- INVENTARIO ---" << endl;
    for (auto& p : inv)
        cout << p.nombre << " | Cant: " << p.cantidad
             << " | Precio: $" << p.precio << endl;
}
 
int main() {
    vector<Producto> inventario;
    int op;
    do {
        cout << "ArrayList II – Sistema de Inventario"<< endl;
        cout << "1.Agregar"<< endl;
        cout << "2.Ver"<< endl;
        cout << "3.Eliminar"<< endl;
        cout << "0.Salir -> "<< endl;
        cin >> op;
        if (op == 1) {
            Producto pr;
            cout << "Nombre: ";   cin >> pr.nombre;
            cout << "Cantidad: "; cin >> pr.cantidad;
            cout << "Precio: ";   cin >> pr.precio;
            inventario.push_back(pr);
        } else if (op == 2) {
            mostrarInventario(inventario);
        } else if (op == 3) {
            mostrarInventario(inventario);
            int pos; cout << "Posicion a eliminar: "; cin >> pos;
            if (pos >= 0 && pos < inventario.size())
                inventario.erase(inventario.begin() + pos);
        }
    } while (op != 0);
    return 0;
}
