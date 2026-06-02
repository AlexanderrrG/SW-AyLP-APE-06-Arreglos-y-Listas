#include <iostream>
#include <list>
#include <string>
using namespace std;
 
int main() {
    list<string> turnos;
    int op; string nombre;
 
    do {
        cout << "\n=== SISTEMA DE TURNOS (LinkedList) ===" << endl;
        cout << "1.Agregar turno 2.Atender (quitar) 3.Ver turnos 0.Salir -> ";
        cin >> op;
 
        if (op == 1) {
            cout << "Nombre del paciente: "; cin >> nombre;
            turnos.push_back(nombre); // Agrega al final
            cout << "Turno asignado a " << nombre << endl;
        } else if (op == 2) {
            if (!turnos.empty()) {
                cout << "Atendiendo a: " << turnos.front() << endl;
                turnos.pop_front(); // Elimina el primero (FIFO)
            } else cout << "No hay turnos pendientes." << endl;
        } else if (op == 3) {
            cout << "Turnos en espera:" << endl;
            for (auto& t : turnos) cout << "  - " << t << endl;
        }
    } while (op != 0);
    return 0;
}
