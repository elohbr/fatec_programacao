quant = int(input("Digite a quantidade em estoque: "))

if quant < 1:
    print("Status: Em falta.")
elif quant < 5:
    print("Status: Alerta de estoque baixo.")
else:
    print("Status: Estoque OK.")