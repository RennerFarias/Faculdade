#Explicações basicas: 
#(input) mesmo que o usuário digite um número, ele será interpretado como uma string. (texto)
#como podemos fazer a conversão de string para inteiro??, nós utilizamos a função int() caso haja numero decimal podemos usar float()



num1 = float(input("Digite o primeiro número: "))
num2 = float(input("Digite o segundo número: "))

# Realiza as operações
soma = num1 + num2
subtracao = num1 - num2
multiplicacao = num1 * num2
divisao = num1 / num2
resto_divisao = num1 % num2

# Imprime os resultados
print(f"Soma: {soma}")
print(f"Subtração: {subtracao}")
print(f"Multiplicação: {multiplicacao}")
print(f"Divisão: {divisao}")
print(f"Resto da divisão: {resto_divisao}")


#coisas que ainda quero perguntar ao prof é sobre o round() que eu entendi que era para para arrendodar para mais (eu acho) vai ter um exemplo abaixo

#um = 10.6
#arredondado = round(num)
#print (arredondado)

#📌 Resumo:

#✅ string → Sempre texto (ex: "Olá", "123", "10.5").
#✅ input() → Tudo que o usuário digita vem como string, mesmo que seja um número.
#✅ int() → Converte string para número inteiro (ex: "10" → 10).
#✅ float() → Converte string para número decimal (ex: "10.5" → 10.5).