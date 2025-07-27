t= int(input())
d = 0
l = []
mini =0
for _ in range(0,t):
    x = int(input())
    while(x>0):
        d= x%10
        l.append(d)
        x = x//10
    mini = min(l)
    print(mini)
    l = []
