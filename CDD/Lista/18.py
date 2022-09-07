n=int(input("Digite o tamanho da lista"))
lista= []
print("Digite o produto e seu preço respectivamente") # Digite o nome - e o preço logo a frente.Ex: ovo-7;
for i in range(n):
    lista.append(input()) 

#Ordeno a lista
lista.sort()
print("Lista Ordenada:",lista)
#Atribuo a lista para uma string
Stringlista= " ".join(lista)
#Separo o nome do preço
Stringlista.split()
listaPreco=[]
listaProduto=[]
#Para cada caractere na String ele verifica se é numero e adiciona na lista de preços
for caractere in Stringlista:
  if caractere.isdigit():
    listaPreco.append(caractere) 
#lista de Produto recebe todas as palavras da String, para cada caractere na string que nao for numero ele adiciona na lista de Produto
listaProduto = ''.join( x for x in Stringlista if not x.isdigit())
print("Lista Produtos:",listaProduto)
print("Lista preço:",listaPreco)



