#include <iostream>
#include <vector>
#include <chrono>
using namespace std;
using namespace std::chrono;
 
int main() {
    const int N = 100000;
 
    // Inserción en arreglo (simulada con índice)
    int arreglo[N];
    auto t1 = high_resolution_clock::now();
    for (int i = 0; i < N; i++) arreglo[i] = i;
    auto t2 = high_resolution_clock::now();
    auto durArr = duration_cast<microseconds>(t2 - t1).count();
 
    // Inserción en vector
    vector<int> vec;
    auto t3 = high_resolution_clock::now();
    for (int i = 0; i < N; i++) vec.push_back(i);
    auto t4 = high_resolution_clock::now();
    auto durVec = duration_cast<microseconds>(t4 - t3).count();
 
    cout << "Insercion " << N << " elementos:" << endl;
    cout << "Arreglo: " << durArr << " microsegundos" << endl;
    cout << "Vector : " << durVec << " microsegundos" << endl;
    return 0;
}
