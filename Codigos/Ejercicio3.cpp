#include <iostream>
#include <vector>
#include <string>
#include <algorithm>
using namespace std;
 
int main() {
    vector<string> productos;
    string producto, buscar;
    int n;
 
    cout << "¿Cuantos productos desea registrar? ";
    cin >> n;
 
    // Registrar productos
    for (int i = 0; i < n; i++) {
        cout << "Producto " << i+1 << ": ";
        cin >> producto;
        productos.push_back(producto);
    }
 
    // Buscar producto
    cout << "\nIngrese el producto a buscar: ";
    cin >> buscar;
 
    auto it = find(productos.begin(), productos.end(), buscar);
    if (it != productos.end()) {
        cout << "Producto ENCONTRADO en la posicion: "
             << distance(productos.begin(), it) << endl;
    } else {
        cout << "Producto NO encontrado." << endl;
    }
    return 0;
}
