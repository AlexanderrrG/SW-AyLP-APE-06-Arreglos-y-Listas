#include <iostream>
#include <vector>
#include <string>
using namespace std;
 
struct Estudiante { string nombre; float nota; };
 
int main() {
    vector<Estudiante> lista;
    int n;
    cout << " Nombres y Notas con Estado "<< endl;
    cout << "¿Cuantos estudiantes? "; cin >> n;
 
    for (int i = 0; i < n; i++) {
        Estudiante e;
        cout << "Nombre: "; cin >> e.nombre;
        cout << "Nota (0-10): "; cin >> e.nota;
        lista.push_back(e);
    }
 
    cout << "\n--- Listado ---" << endl;
    for (auto& e : lista)
        cout << e.nombre << " - Nota: " << e.nota
             << (e.nota >= 7 ? " [APROBADO]" : " [REPROBADO]") << endl;
    return 0;
}
