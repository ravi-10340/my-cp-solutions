t= int(input())
for _ in range(0,t):
    a = List(map(int,input.split()))
    if(a[0]+a[1]==a[2]):
        print("YES")
    elif(a[0]==a[1]+a[2]):
        print("YES")
    elif(a[0]+a[2]==a[1]):
        print("YES")
    else:
        print("NO")

        
