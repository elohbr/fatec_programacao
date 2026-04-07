#include <iostream>
using namespace std;

int main(){
    int quant;
    cout << "Digite a quantidade em estoque: ";
    cin >> quant;

    if (quant < 1){
        cout << "Status: Em falta." << endl;
    } else if (quant < 5){
        cout << "Status: Alerta de estoque baixo." << endl;
    } else {
        cout << "Status: Estoque OK." << endl;
    }
    return 0;
}