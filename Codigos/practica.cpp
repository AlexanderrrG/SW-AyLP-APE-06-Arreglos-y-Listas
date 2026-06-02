#include <iostream>
#include <vector>
#include <string>
using namespace std;
 
int main() {
    // Crear un vector con 5 nombres de estudiantes
    vector<string> estudiantes;
    string nombre;
 
    cout << "=== REGISTRO DE 5 ESTUDIANTES ===" << endl;
    for (int i = 0; i < 5; i++) {
        cout << "Ingrese nombre del estudiante " << i+1 << ": ";
        cin >> nombre;
        estudiantes.push_back(nombre); // Agregar al vector
    }
 
    // Mostrar la lista completa
    cout << "\n--- Lista de Estudiantes ---" << endl;
    for (int i = 0; i < estudiantes.size(); i++) {
        cout << i+1 << ". " << estudiantes[i] << endl;
    }
    return 0;
}
