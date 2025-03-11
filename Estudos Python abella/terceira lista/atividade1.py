import time

# Lista para armazenar as manifestações
manifestacoes = []

# Exibe todas as manifestações cadastradas
def listar_manifestacoes():
    print('\nLista de Manifestações:' if manifestacoes else '\nNenhuma manifestação cadastrada.')
    for i, manifestacao in enumerate(manifestacoes, start=1):
        print(f'{i}) {manifestacao}')

# Permite ao usuário cadastrar uma nova manifestação
def criar_manifestacao():
    manifestacoes.append(input('\nDescreva sua manifestação: ').strip())
    print(f'Manifestação cadastrada com sucesso. Código: {len(manifestacoes)}')

# Permite pesquisar uma manifestação pelo código informado
def pesquisar_por_codigo():
    try:
        codigo = int(input('\nInforme o código da manifestação: '))
        print(f'Manifestação {codigo}: {manifestacoes[codigo - 1]}' if 1 <= codigo <= len(manifestacoes) else 'Código inválido.')
    except ValueError:
        print('ERRO. DIGITE APENAS NÚMEROS')

# Menu interativo para o usuário escolher uma opção
def menu():
    opcoes = {
        '1': listar_manifestacoes, 
        '2': criar_manifestacao, 
        '3': lambda: print(f'\nTotal de manifestações: {len(manifestacoes)}'), 
        '4': pesquisar_por_codigo
    }
    while True:
        print('\n' + '=' * 30 + '\nSISTEMA DE OUVIDORIA'.center(30) + '\n' + '=' * 30)
        print('1 - Listar | 2 - Criar | 3 - Total | 4 - Pesquisar | 5 - Sair')
        opcao = input('\nOpção: ')
        if opcao == '5': 
            print('Encerrando o sistema...')
            break
        opcoes.get(opcao, lambda: print('Opção inválida'))()
        time.sleep(1)

# Executa o menu ao iniciar o programa
if __name__ == '__main__':
    menu()
