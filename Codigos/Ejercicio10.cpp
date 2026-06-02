#include <iostream>
#include <list>
#include <string>
using namespace std;
 
int main() {
    list<string> fila;
    int n; string cliente;

    cout << "Fila de clientes usando LinkedList/list" << endl;
    cout << "¿Cuantos clientes en la fila inicial? "; cin >> n;
    for (int i = 0; i < n; i++) {
        cout << "Cliente " << i+1 << ": "; cin >> cliente;
        fila.push_back(cliente);
    }
 
    cout << "\n--- SIMULACION DE ATENCION ---" << endl;
    while (!fila.empty()) {
        cout << "Atendiendo a: " << fila.front() << endl;
        fila.pop_front();
        if (!fila.empty())
            cout << "Siguiente en fila: " << fila.front() << endl;
        cout << "Clientes restantes: " << fila.size() << endl;
    }
    cout << "\nFila de atencion finalizada." << endl;
    return 0;
}
