#lembrentes: na atividade passada aprendemos que (input) guarda um valor como str (texto), como estamos fazendo calculo, devemos converter usando o (int) para transformar em valor inteiro 

numero= int(input("Digite um número inteiro: "))

antecessor = numero - 1
sucessor = numero + 1

print(f"Antecessor: {antecessor}")
print(f"Sucessor: {sucessor}")
#---------------------------------------------------------------------------------
#coisa que eu fiquei martelado o dia inteniro o porque caralhos do F, acabei achando uma explicação boa então vou deixar aqui caso alguém precise 

#Normalmente, para misturar texto e variáveis no print(), a gente teria que fazer algo assim:nome = "Renner"
#idade = 19
#print("Meu nome é " + nome + " e eu tenho " + str(idade) + " anos.")

#sso é meio chato, porque precisamos usar o + e converter números para string (str(idade)).
#------------------------------------------------------------------------------------
## Usando o f"" (Interpolação de strings)

#Com f"", a gente coloca as variáveis diretamente dentro da string, sem precisar usar + ou str():

#print(f"Meu nome é {nome} e eu tenho {idade} anos.")
#-----------------------------------------------------------------------

#se lembre de sempre usar variaveis!!