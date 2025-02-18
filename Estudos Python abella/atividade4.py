#o float é para garantir que o usuário possa digitar números com casas decimais.
num1 = float(input("Digite o primeiro número: "))
num2 = float(input("Digite o segundo número: "))
num3 = float(input("Digite o terceiro número: "))


media = (num1 + num2 + num3) / 3 #aqui fazemos a soma e divisão para obtermos o resultado final

print(f"A média aritmética é: {media:.2f}")

#aqui vai mostrar para o usuario o valor medio !!