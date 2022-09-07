dicionario = {'item1': 45.50, 'item2':35, 'item3': 41.30, 'item4':55, 'item5': 24} 


ordenado = {k: v for k, v in sorted(dicionario.items(), key=lambda item: item[1],reverse=True)}
     
j=0
for key,value in ordenado.items():
    if(j<3):
        print(key,value)
        j=j+1
    else:
        break