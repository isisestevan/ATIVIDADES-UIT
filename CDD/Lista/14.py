from matplotlib import pyplot

lista = list(input("Digite numeros inteiros"))
lista_unica = list(set(lista))
lista_unica.sort()
print("Lista Original:",lista)
print("Lista Sem rpetição",lista_unica) 

pyplot.scatter(lista,lista_unica)
pyplot.title("Grafico")
pyplot.show()
