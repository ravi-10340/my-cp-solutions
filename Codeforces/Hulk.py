n = int(input())
 
res = ""
for i in range(1, n + 1):
    if i % 2 == 1:   
        res += "I hate"
    else:            
        res += "I love"
 
    if i == n:
        res += " it"
    else:
        res += " that "
 
print(res)
