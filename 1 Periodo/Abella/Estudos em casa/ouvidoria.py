'''
   Projeto Realizado por: 
   
   José Artur, Igor Lima, Renner Farias.

   Data Realizada: 12/03/2025
'''

manifestações = []

opcao = -1

while opcao != 5:
    print("\nOpção 1) Listagem de Manifestações "
    "\nOpção 2) Criar uma nova Manifestação "
    "\nOpção 3) Exibir quantidade de Manifestações "
    "\nOpção 4) Pesquisar uma Manifestação por código "
    "\nOpção 5) Sair do sistema")

    try:
        opcao = int(input("Digite uma opção: "))
    except ValueError:
        print("Digite uma opção válida!!")
        continue


    if opcao == 1:
        if manifestações:
            for item in enumerate(manifestações, start = 1):
                print(f"Manifestação {item}")

        else:
            print("Não há manifestacões")

        

    elif opcao == 2:
        descricao = str(input("Digite a descrição da Manifestação: "))
        manifestações.append(descricao)
        codigo = len(manifestações)
        print(f"Manifestação cadastrada com sucesso! o seu código é {codigo}")
        

    elif opcao == 3:
        print("\nNúmero de Manifestações existentes:")
        for item in manifestações:
            print("-",item)
    
    elif opcao == 4:
            codigo = int(input("Por favor, informe o código da Manifestação: "))
            if 1 <= codigo <= len(manifestações):
                print(f"Manifestação {codigo}: {manifestações[codigo - 1]} ")
            else:
                print("Código inválido. Tente novamente.")

    elif opcao == 5:
        print("Saindo do programa...")
    else:
        print("Opção inválida!")