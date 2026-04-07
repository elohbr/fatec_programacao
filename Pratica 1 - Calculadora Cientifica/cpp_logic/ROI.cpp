#include <iostream>
#include <iomanip>
using namespace std;

int main() {
    double lucro, investimento;

    cout << "--- Calculadora de ROI (C++) ---" << endl;

    cout << "Digite o lucro: ";
    cin >> lucro;

    cout << "Digite o investimento: ";
    cin >> investimento;

    if (investimento == 0) {
        cout << "Erro: investimento nao pode ser zero!" << endl;
    } else {
        double roi = ((lucro - investimento) / investimento)*100;
        cout << "ROI: " << roi << "%" << endl;
    }

    return 0;
}