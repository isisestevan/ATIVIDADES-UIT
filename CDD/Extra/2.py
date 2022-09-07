listdic= [{"V":"S001"}, {"V": "S002"}, {"VI": "S001"}, {"VI": "S005"}, {"VII":"S005"},
{"V":"S009"},{"VIII":"S007"}] 
final = set() #set para nao conter os valores duplicados
for dic in listdic:
   for val in dic.values():
      final.add(val)
print(final)