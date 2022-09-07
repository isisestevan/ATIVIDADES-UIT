def menu():
    print("1 para adicionar")
    print("2 para alterar")
    print("3 para excluir")
    print("0 para sair")
menu()
op=int(input("Entre com a opcao"))
dados = dict()
while op != 0:
    if op == 1:
         dados['nome'] = str(input("Digite o nome : "))
         dados['idade'] = int(input("Idade: "))
         dados['salario'] = float(input("Salario: "))
         dados['data'] = str(input("Data Nascimento: ")) 
         file = open("DictFile.txt",'a')
         for key, value in dados.items(): 
           file.write('%s:%s\n' % (key, value))
            
    elif op == 2:
        dadosalt= dict()
        alt=input("Digite o nome da Pessoa que voce ira alterar")
        nomealt=input("Nome para alteração")
        dadosalt['nome']= nomealt
        #idadealt=int(input("Idade para alteração"))
        #salarioalt=float("Salario para alterar")
        #dataalt = int("Data para alterar")
        if alt in dados.keys():
             dados['nome'] = dadosalt
             #dados['idade'] = idadealt
             
        for key, value in dados.items(): 
           file.write('%s:%s\n' % (key, value))
    elif op == 3:
        print("Exclusao")
    else:
        print("Invalido")
    menu() 
    op=int(input("Entre com a opcao")) 

print("...")

   

    