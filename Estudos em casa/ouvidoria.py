import time
manifestacoes = []
def listar_manifestacoes():
    if not manifestacoes:
        print("\nNenhuma manifestação cadastrada.")
    else:
        print("\nManifestações existentes:")
        for i, reclamacao in enumerate(manifestacoes, start=1):
            print(f'{i}) {reclamacao}')
    time.sleep(0.5)

def adicionar_manifestacao():
    descricao = input("Digite a descrição da Manifestação: ")
    manifestacoes.append(descricao)
    print(f"Manifestação cadastrada com sucesso! O seu código é {len(manifestacoes)}")
    time.sleep(0.5)

def exibir_quantidade():
    print(f"\nNúmero de Manifestações existentes: {len(manifestacoes)}")
    time.sleep(0.5)

def pesquisar_manifestacao():
    try:
        codigo = int(input("Por favor, informe o código da Manifestação: "))
        if 1 <= codigo <= len(manifestacoes):
            print(f"Manifestação {codigo}: {manifestacoes[codigo - 1]} ")
        else:
            print("Código inválido. Tente novamente.")
    except ValueError:
        print("Digite apenas números!!")
    time.sleep(0.5)

def main():
    while True:
        print('\n' + '=' * 40)
        print('SISTEMA DE MANIFESTAÇÕES'.center(40))
        print('=' * 40)
        print("1) Listar Manifestações")
        print("2) Adicionar Manifestação")
        print("3) Quantidade de Manifestações")
        print("4) Pesquisar Manifestação por código")
        print("5) Sair")
        opcao = input("Digite uma opção: ")
        if opcao == '1':
            listar_manifestacoes()
        elif opcao == '2':
            adicionar_manifestacao()
        elif opcao == '3':
            exibir_quantidade()
        elif opcao == '4':
            pesquisar_manifestacao()
        elif opcao == '5':
            print("Saindo do programa...")
            break
        else:
            print("Opção inválida! Tente novamente.")
        time.sleep(0.5)

if __name__ == "__main__":
    main()

    #preciso revisar esse conteudo e entender melhor o que foi feito 