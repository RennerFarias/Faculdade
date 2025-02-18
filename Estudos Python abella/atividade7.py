# Solicita o salário do usuário
salario = float(input("Digite seu salário:"))

# Calcula o salário reajustado com 10% de aumento
salario_reajustado = salario * 1.10  # Multiplicamos por 1.10 (100% + 10%)

# Exibe o salário com reajuste formatado com duas casas decimais
print(f"Seu salário com reajuste de 10% será: R$ {salario_reajustado:.2f}")

#lembrando que são duas casas decimais pois estamos utilizando os resultados formatados com :.2f, garantindo que os valores tenham apenas duas casas decimais. 