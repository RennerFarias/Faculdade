import time

filmes = ['Oppenheimer' , 'Doctor Who' , 'Corra']
filmes_alugados = []

def listar_filmes():
    if filmes:
        print('Filmes disponíveis:')
        for i, filme in enumerate(filmes, start=1):
            print(f'{i} - {filme}')
            time.sleep(0.3)
    else:
        print('Nenhum filme disponível no momento.')

def alugar_filme():
    if not filmes:
        print('Nenhum filme disponível para alugar.')
    else:
        listar_filmes()
        numero = input('Digite o número do filme que deseja alugar: ')
        if numero.isdigit():
            numero = int(numero)
            if 1 <= numero <= len(filmes):
                filme = filmes.pop(numero - 1)
                filmes_alugados.append(filme)
                print(f'Filme {filme} alugado com sucesso')
            else:
                print('Número inválido. Escolha um filme da lista.')
        else:
            print('ERRO. DIGITE APENAS NÚMEROS')

def devolver_filme():
    if not filmes_alugados:
        print('Nenhum filme alugado para devolver.')
        return
    
    print('Filmes alugados:')
    for i, filme in enumerate(filmes_alugados, start=1):
        print(f'{i} - {filme}')
    
    numero = input('Digite o número do filme que deseja devolver: ')
    if numero.isdigit():
        numero = int(numero)
        if 1 <= numero <= len(filmes_alugados):
            filme = filmes_alugados.pop(numero - 1)
            filmes.append(filme)
            print(f'Filme {filme} devolvido com sucesso')
        else:
            print('Número inválido. Escolha um filme da lista de filmes alugados.')
    else:
        print('ERRO. DIGITE APENAS NÚMEROS')


def adicionar_filme():
    filme = input('Digite o nome do filme que deseja adicionar: ').strip().title()
    filmes.append(filme)
    print(f'Filme {filme} adicionado com sucesso')

def menu():
    while True:
        print('=' * 30)
        print('Locadora'.center(30))
        print('=' * 30)
        print('1 - Listar filmes')
        print('2 - Alugar filme')
        print('3 - Devolver filme')
        print('4 - Adicionar filme')
        print('5 - Sair')

        opcao = input('Digite sua opção: ')
        time.sleep(0.5)

        if opcao.isdigit():
            opcao = int(opcao)
            if opcao == 1:
                listar_filmes()
            elif opcao == 2:
                alugar_filme()
            elif opcao == 3:
                devolver_filme()
            elif opcao == 4:
                adicionar_filme()
            elif opcao == 5:
                print('Programa encerrado com sucesso')
                break
            else:
                print('Opção inválida! Escolha entre 1 e 5.')
        else:
            print('ERRO. DIGITE APENAS NÚMEROS')
        time.sleep(1)

if __name__ == '__main__':
    menu()

    #bom dia a todos,hoje é um novo dia para aprender mais sobre python, essa lista foi desenvolvida para um trabalho de faculdade, onde o objetivo era criar um sistema de locadora de filmes, onde o usuario pode alugar, devolver, adicionar e listar filmes.
    #o codigo foi desenvolvido com conhecimentos adquiridos no curso e trabalho feito com outros colegas, onde todos tiveram parte do desenvolvimento do codigo. 
    # irei explicar coisas importantes do nosso codigo para que possa ser de facil compreenção para todos que forem ler nosso codigo e entender o que ele faz. 

    #primeiramente, temos a lista de filmes, onde temos 3 filmes disponiveis para alugar, e a lista de filmes alugados, onde os filmes que forem alugados vão para essa lista.

    #temos a função listar_filmes, onde ela verifica se tem filmes disponiveis, se tiver ela lista os filmes disponiveis, se não tiver ela informa que não tem filmes disponiveis.

    #temos a função alugar_filme, onde ela verifica se tem filmes disponiveis, se tiver ela lista os filmes disponiveis e pede para o usuario digitar o numero do filme que deseja alugar, se o numero for valido, o filme é alugado e vai para a lista de filmes alugados, se não for valido, ele informa que o numero é invalido e pede para escolher um filme da lista.

    #temos a função devolver_filme, onde ela verifica se tem filmes alugados, se tiver ela lista os filmes alugados e pede para o usuario digitar o numero do filme que deseja devolver, se o numero for valido, o filme é devolvido e vai para a lista de filmes disponiveis, se não for valido, ele informa que o numero é invalido e pede para escolher um filme da lista de filmes alugados. 
    # por fim temos o adicionar filme, onde ele pede para o usuario digitar o nome do filme que deseja adicionar, e o filme é adicionado a lista de filmes disponiveis, essa é a unica parte onde não está 100% funcional, pois o filme adicionado não fica salvo no codigo, ou seja, se o programa for fechado, o filme adicionado é perdido, todo conteudo fica na memoria volatil

    #por fim fizemos um menu onde o cliente pode entender e utilizar o programa, onde fica mais intuitivo para o usuario, tendo explicações claras de cada coisa que ele pode fazer no programa.

    #Uma curiosidade que me perguntaram foi como eu fiz para que o nome = locadora, ficasse centralizado no meio, utilizamos esse comando 
    #print('=' * 30)
    #print('Locadora'.center(30))
    #print('=' * 30)
    
    # o primeiro print ele manda mostrar na tela 30 vezes o sinal de igual, para que possamos fazer um destaque no nome locadora, o segundo print ele centraliza o nome locadora no meio do print, já o terceiro apenas repete o que o primeiro comando fazia para ter um destaque para que o usuario possa ver melhor.