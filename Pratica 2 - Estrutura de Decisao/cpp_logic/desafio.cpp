#include <iostream>
#include <string>
using namespace std;

int main() {

    string nome_prod;
    int quant_est;
    float preco_unit;

    cout << "Digite o nome do produto: ";
    cin >> nome_prod;

    cout << "Digite a quantidade em estoque: ";
    cin >> quant_est;

    cout << "Digite o preço unitário: R$ ";
    cin >> preco_unit;

    if (quant_est > 0) {

        cout << "----RESUMO DO PRODUTO----" << endl;
        cout << "Produto: " << nome_prod << endl;
        cout << "Quantidade: " << quant_est << endl;
        cout << "Preço: R$ " << preco_unit << endl;

    } else {
        cout << "ERRO: A quantidade não pode ser um valor negativo. Por favor, tente novamente." << endl;
    }

    return 0;
}