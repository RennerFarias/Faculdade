#lembrentes: na atividade passada aprendemos que (input) guarda um valor como str (texto), como estamos fazendo calculo, devemos converter usando o (int) para transformar em valor inteiro 

numero= int(input("Digite um número inteiro: "))

antecessor = numero - 1
sucessor = numero + 1

print(f"Antecessor: {antecessor}")
print(f"Sucessor: {sucessor}")

#coisa que eu fiquei martelado o dia inteniro o porque caralhos do F após o print, resumindo ele permite que a gente coloque variáveis diretamente dentro da string, sem precisar usar + para concatenar.

#se lembre de sempre usar variaveis!!