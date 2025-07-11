'''
   Projeto Realizado por: 
   José Artur, Igor Lima, Renner Farias.
   Data Realizada: 02/04/2025
'''

manifestacoes = {}  # {código: {"tipo": tipo, "descricao": descricao}}
proximo_codigo = 1  # Controla o próximo código a ser atribuído

opcao = -1

while opcao != 7:
    print("\n--- MENU PRINCIPAL ---")
    print("1) Listar todas as manifestações")
    print("2) Listar manifestações por tipo")
    print("3) Criar nova manifestação")
    print("4) Exibir quantidade de manifestações")
    print("5) Pesquisar manifestação por código")
    print("6) Excluir manifestação por código")
    print("7) Sair do sistema")

    try:
        opcao = int(input("Digite uma opção: "))
    except ValueError:
        print("Erro: Digite um número válido!")
        continue

    if opcao == 1:
        if not manifestacoes:
            print("\nNão há manifestações cadastradas.")
        else:
            print("\n--- TODAS AS MANIFESTAÇÕES ---")
            for codigo, dados in manifestacoes.items():
                print(f"Código: {codigo} | Tipo: {dados['tipo']} | Descrição: {dados['descricao']}")

    elif opcao == 2:

        if not manifestacoes:
            print("\nNão há manifestações cadastradas.")
        else:
            print("\nTipos disponíveis: 1) Reclamação | 2) Elogio | 3) Sugestão")
            try:
                tipo_escolhido = int(input("Digite o tipo desejado (1-3): "))
                if tipo_escolhido not in [1, 2, 3]:
                    print("Erro: Tipo inválido!")
                    continue
            except ValueError:
                print("Erro: Digite um número válido!")
                continue

            tipo_nome = ["Reclamação", "Elogio", "Sugestão"][tipo_escolhido-1]
            encontradas = False
            
            print(f"\n--- {tipo_nome.upper()} ---")
            for codigo, dados in manifestacoes.items():
                if dados['tipo'] == tipo_nome:
                    print(f"Código: {codigo} | Descrição: {dados['descricao']}")
                    encontradas = True
            
            if not encontradas:
                print(f"Nenhuma manifestação do tipo '{tipo_nome}' encontrada.")

    elif opcao == 3:
        print("\n--- NOVA MANIFESTAÇÃO ---")
        
        while True:
            print("Tipos: 1) Reclamação | 2) Elogio | 3) Sugestão")
            try:
                tipo_opcao = int(input("Escolha o tipo (1-3): "))
                if tipo_opcao in [1, 2, 3]:
                    break
                print("Erro: Digite 1, 2 ou 3!")
            except ValueError:
                print("Erro: Digite um número válido!")

        tipo = ["Reclamação", "Elogio", "Sugestão"][tipo_opcao-1]
        
        while True:
            descricao = input("Digite a descrição: ").strip()
            if descricao:
                break
            print("Erro: A descrição não pode ser vazia!")

        manifestacoes[proximo_codigo] = {"tipo": tipo, "descricao": descricao}
        print(f"\nManifestação cadastrada com sucesso! Código: {proximo_codigo}")
        proximo_codigo += 1

    elif opcao == 4:
        print(f"\nTotal de manifestações: {len(manifestacoes)}")

    elif opcao == 5:
        try:
            codigo = int(input("\nDigite o código da manifestação: "))
            if codigo in manifestacoes:
                print(f"\n--- MANIFESTAÇÃO {codigo} ---")
                print(f"Tipo: {manifestacoes[codigo]['tipo']}")
                print(f"Descrição: {manifestacoes[codigo]['descricao']}")
            else:
                print("Erro: Código inválido!")
        except ValueError:
            print("Erro: Digite um número válido!")

    elif opcao == 6:
        if not manifestacoes:
            print("\nNão há manifestações para excluir.")
        else:
            try:
                codigo = int(input("\nDigite o código da manifestação a excluir: "))
                if codigo in manifestacoes:
                    removida = manifestacoes.pop(codigo)
                    print(f"Manifestação {codigo} ('{removida['tipo']}') removida com sucesso!")
                else:
                    print("Erro: Código inválido!")
            except ValueError:
                print("Erro: Digite um número válido!")

    elif opcao == 7:
        print("\nSaindo do sistema...")
    else:
        print("\nErro: Opção inválida!")