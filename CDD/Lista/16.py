arq = open("arquivo.txt","r") 
string = arq.read()
dicionario ={}
for letra in string:
    if 'a' <= letra <= 'z':
        dicionario[letra] = dicionario[letra] + 1 if letra in dicionario else 1 
print(dicionario)
    