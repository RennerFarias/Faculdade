# Programa para calcular o salário mensal
# Pergunta quanto o usuário ganha por hora e o número de horas trabalhadas no mês
# Calcula e exibe o salário mensal

salario_por_hora = float(input("Quanto você ganha por hora? "))
horas_trabalhadas = float(input("Número de horas trabalhadas no mês: "))
salario_mensal = salario_por_hora * horas_trabalhadas

print(f"Seu salário mensal é: R${salario_mensal:.2f}")