from collections import Counter
d1 = {'a': 100, 'b': 200, 'c':300}
d2 = {'a': 300, 'b': 200, 'd':400} 

for key in d2.keys(): 
    if key in d1: 
     d1[key] = d1[key] + d2[key] 
    else: 
     d1[key] = d2[key]

print(d1)