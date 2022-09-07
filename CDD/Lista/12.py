entrada = input("Digite uma palavra\n")
print(entrada)
caracter = list(entrada)
newList = list(reversed(caracter))
if caracter == newList:
    print("Verdadeiro\n")
else:
    print("Falso")
    
