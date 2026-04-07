nome_prod = str(input("Digite o nome do produto: "))
quant_est = int(input("Digite a quantidade em estoque: "))
preco_unit = float(input("Digite o preço unitário do produto: "))

if quant_est > 0:
    print("----RESUMO DO PRODUTO----")
    print("Produto:", nome_prod)
    print("Quantidade em estoque:", quant_est)
    print("Preço unitário: R$", preco_unit)
else:
    print("ERRO: A quantidade não pode ser um valor negativo. Por favor, tente novamente.")