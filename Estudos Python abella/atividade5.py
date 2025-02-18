# Solicita o valor do produto ao usuário
valor = float(input("Digite o valor do produto: "))

# Calcula os descontos
desconto_10 = valor * 0.90  # 10% de desconto
desconto_20 = valor * 0.80  # 20% de desconto
desconto_50 = valor * 0.50  # 50% de desconto

# Exibe os valores com desconto formatados com duas casas decimais
print(f"Valor com 10% de desconto: R$ {desconto_10:.2f}")
print(f"Valor com 20% de desconto: R$ {desconto_20:.2f}")
print(f"Valor com 50% de desconto: R$ {desconto_50:.2f}")

#lembrentes 1- Calcular os descontos multiplicando o valor por 0.90, 0.80 e 0.50 (equivalentes a pagar 90%, 80% e 50% do preço original). 
# 2- Exibe os resultados formatados com :.2f, garantindo que os valores tenham apenas duas casas decimais. 