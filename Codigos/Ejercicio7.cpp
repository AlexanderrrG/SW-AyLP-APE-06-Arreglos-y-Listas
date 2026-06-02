#include <iostream>
#include <vector>
#include <chrono>
using namespace std;
using namespace std::chrono;
 
int main() {
    const int N = 1000000;
 
    // --- Arreglo estático ---
    auto t1 = high_resolution_clock::now();
    int arreglo[10] = {1,2,3,4,5,6,7,8,9,10};
    cout << "Arreglo (primeros 10 elementos):" << endl;
    for (int i = 0; i < 10; i++) cout << arreglo[i] << " ";
    cout << endl;
    auto t2 = high_resolution_clock::now();
 
    // --- Vector (ArrayList equivalente) ---
    vector<int> vec;
    for (int i = 1; i <= 10; i++) vec.push_back(i);
    cout << "Vector (primeros 10 elementos):" << endl;
    for (int v : vec) cout << v << " ";
    cout << endl;
    auto t3 = high_resolution_clock::now();
 
    cout << "\nComparacion:" << endl;
    cout << "Arreglo - acceso directo, tamano fijo." << endl;
    cout << "Vector  - tamano dinamico, metodos add/remove." << endl;
    return 0;
}
