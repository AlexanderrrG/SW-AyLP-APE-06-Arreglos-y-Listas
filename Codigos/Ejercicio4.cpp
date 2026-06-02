#include <iostream>
#include <vector>
#include <string>
using namespace std;
 
void mostrar(const vector<string>& lista) {
    if (lista.empty()) { cout << "(Lista vacía)" << endl; return; }
    for (int i = 0; i < lista.size(); i++)
        cout << i << ". " << lista[i] << endl;
}
 
int main() {
    vector<string> datos;
    int opcion; string item;
 
    do {
        cout << "\n=== MENU CRUD ===" << endl;
        cout << "1. Agregar "<< endl;
        cout << "2. Mostrar "<< endl; 
        cout << "3. Actualizar" << endl;
        cout << "4. Eliminar" << endl;
        cout << "0. Salir" << endl;
        cout << "Opcion: "; cin >> opcion;
 
        if (opcion == 1) {
            cout << "Ingrese item: "; cin >> item;
            datos.push_back(item);
            cout << "Agregado correctamente." << endl;
        } else if (opcion == 2) {
            mostrar(datos);
        } else if (opcion == 3) {
            mostrar(datos);
            int pos; cout << "Posicion a actualizar: "; cin >> pos;
            if (pos >= 0 && pos < datos.size()) {
                cout << "Nuevo valor: "; cin >> item;
                datos[pos] = item;
            } else cout << "Posicion invalida." << endl;
        } else if (opcion == 4) {
            mostrar(datos);
            int pos; cout << "Posicion a eliminar: "; cin >> pos;
            if (pos >= 0 && pos < datos.size())
                datos.erase(datos.begin() + pos);
            else cout << "Posicion invalida." << endl;
        }
    } while (opcion != 0);
    return 0;
}
