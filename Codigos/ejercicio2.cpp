#include <iostream>
#include <vector>
using namespace std;
 
int main() {
    vector<float> notas;
    float nota;
    float suma = 0;
 
    cout << "=== REGISTRO DE 6 NOTAS ===" << endl;
    for (int i = 0; i < 6; i++) {
        cout << "Ingrese nota " << i+1 << " (0-10): ";
        cin >> nota;
        notas.push_back(nota); // Agregar nota al vector
        suma += nota;
    }
 
    // Calcular el promedio
    float promedio = suma / 6;
 
    cout << "\n--- Notas Registradas ---" << endl;
    for (int i = 0; i < notas.size(); i++) {
        cout << "Nota " << i+1 << ": " << notas[i] << endl;
    }
    cout << "Promedio General: " << promedio << endl;
    return 0;
}
