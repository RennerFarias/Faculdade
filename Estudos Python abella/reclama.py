import time

# Lista que armazenará as reclamações
reclamacoes = []

def listar_reclamacoes():
    """Exibe todas as reclamações registradas."""
    if not reclamacoes:
        print('\nNenhuma reclamação cadastrada.')
    else:
        print('\nLista de Reclamações:')
        for i, reclamacao in enumerate(reclamacoes, start=1):
            print(f'{i}) {reclamacao}')
    time.sleep(0.5)

def criar_reclamacao():
    """Adiciona uma nova reclamação ao sistema."""
    descricao = input('\nDescreva sua reclamação: ').strip()
    if descricao:  
        reclamacoes.append(descricao)
        print(f'Reclamação cadastrada com sucesso. O seu código é {len(reclamacoes)}')
    else:
        print('Erro: A reclamação não pode ser vazia.')
    time.sleep(0.5)

def exibir_quantidade():
    """Exibe o número total de reclamações registradas."""
    print(f'\nO sistema possui {len(reclamacoes)} reclamação(ões) cadastrada(s).')
    time.sleep(0.5)

def pesquisar_por_codigo():
    """Pesquisa uma reclamação pelo código informado pelo usuário."""
    if not reclamacoes:
        print('\nNenhuma reclamação cadastrada para pesquisa.')
    else:
        try:
            codigo = int(input('\nInforme o código da reclamação: '))
            if 1 <= codigo <= len(reclamacoes):
                print(f'Reclamação {codigo}: {reclamacoes[codigo - 1]}')
            else:
                print('Código inválido. Nenhuma reclamação encontrada.')
        except ValueError:
            print('ERRO. DIGITE APENAS NÚMEROS.')
    time.sleep(0.5)

def menu():
    """Exibe o menu principal e processa as escolhas do usuário."""
    while True:
        print('\n' + '=' * 40)
        print('SISTEMA DE RECLAMAÇÃO'.center(40))
        print('=' * 40)
        print('1 - Listar reclamações')
        print('2 - Criar nova reclamação')
        print('3 - Exibir quantidade de reclamações')
        print('4 - Pesquisar reclamação por código')
        print('5 - Sair do sistema')

        opcao = input('\nDigite sua opção: ')

        time.sleep(0.5)

        try:
            opcao = int(opcao)
            if opcao == 1:
                listar_reclamacoes()
            elif opcao == 2:
                criar_reclamacao()
            elif opcao == 3:
                exibir_quantidade()
            elif opcao == 4:
                pesquisar_por_codigo()
            elif opcao == 5:
                print('\nObrigado por utilizar o sistema de ouvidoria!')
                break
            else:
                print('Opção inválida! Escolha um número entre 1 e 5.')
        except ValueError:
            print('ERRO. DIGITE APENAS NÚMEROS.')

        time.sleep(0.5)

if __name__ == '__main__':
    menu()



'''A função listar_reclamações() exibe todas as reclamações registradas no sistema.

    Primeiro, ela verifica se a lista reclamações contém algum item.
    Se houver reclamações, a função as percorre utilizando enumerate(), que atribui um número sequencial a cada reclamação.
    Cada reclamação é então exibida no formato Reclamação X) [descrição].
    Caso não haja reclamações cadastradas, a função exibe a mensagem "Nenhuma reclamação cadastrada.".'''

'''A função criar_reclamação() permite ao usuário registrar uma nova reclamação no sistema.

    Primeiro, ela solicita ao usuário que descreva a reclamação, utilizando input(). O método .strip() remove espaços extras no início e no fim do texto.
    Em seguida, a reclamação é adicionada à lista reclamações usando append().
    O código da reclamação é definido como a posição do item na lista (baseado no tamanho da lista).
    Por fim, a função exibe uma mensagem confirmando o cadastro e informando o código da reclamação.'''

'''A função exibir_quantidade() mostra o número total de reclamações registradas no sistema.

    Ela utiliza a função len(reclamações) para contar quantos itens estão na lista reclamações.
    Em seguida, exibe essa quantidade em uma mensagem formatada, informando ao usuário quantas reclamações foram cadastradas até o momento.'''

'''A função pesquisar_por_codigo() permite ao usuário buscar uma reclamação específica com base em seu código.

    Primeiro, ela verifica se há reclamações cadastradas. Se a lista estiver vazia, exibe uma mensagem informando que não há dados para pesquisa.
    Em seguida, solicita ao usuário que informe o código da reclamação.
    O código digitado é verificado com .isdigit(), garantindo que seja um número válido.
    Se for um número dentro do intervalo de reclamações cadastradas, a função exibe a reclamação correspondente.
    Caso contrário, exibe uma mensagem de erro informando que o código é inválido.'''	

'''A função menu() exibe o menu principal do sistema e processa as opções escolhidas pelo usuário.

    Exibe um menu formatado com cinco opções: listar reclamações, criar nova reclamação, exibir quantidade, pesquisar por código e sair.
    Solicita que o usuário digite uma opção.
    Verifica se a entrada é um número (isdigit()). Se for, converte para inteiro e executa a função correspondente.
    Se o usuário escolher "5", o sistema exibe uma mensagem de despedida e encerra o programa.
    Caso a entrada seja inválida, exibe um aviso e pede uma nova opção.'''