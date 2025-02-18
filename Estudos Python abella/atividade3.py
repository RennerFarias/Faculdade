#(input) guarda um valor como str (texto), como estamos fazendo calculo, devemos converter usando o (int) para transformar em valor inteiro 
numero = int(input("Digite um número inteiro: "))

# Calcula os valores
dobro = numero * 2
triplo = numero * 3
metade = numero / 2  # Aqui a divisão retorna um número decimal

# Exibe os resultados
print(f"Dobro: {dobro}")
print(f"Triplo: {triplo}")
print(f"Metade: {metade}")
