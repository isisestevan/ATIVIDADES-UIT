n=int(input("Digite o tamanho da lista"))
lista = []
cont= 0
for i in range(n):
    cont+=1
    lista.append(input(f'Nome do {cont}º elemento: '))
print("Lista Original:",lista)

listaResultante = [a**2 for a in lista]
print("Lista Ao Quadrado",listaResultante)