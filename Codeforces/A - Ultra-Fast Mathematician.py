n1 = input().strip()
n2 = input().strip()
 
res = ""
for i in range(len(n1)):
    if n1[i] == n2[i]:
        res += "0"
    else:
        res += "1"
 
print(res)
