def  inverteValor(num):
    return num[::-1]

def parouimpar(num,numinverso):
    if(num%2 == 0 and numinverso%2 or num%2 == 1 and numinverso%2 == 1 ):
        return True
    else:
        return False
num = int(input("Numero para inversao"))
num = str(num)
print("Numero é par ou impar ?",parouimpar(num,parouimpar(inverteValor(num))))