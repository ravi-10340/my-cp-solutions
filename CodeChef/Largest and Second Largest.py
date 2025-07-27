t = int(input())

while t > 0:
    n = int(input())
    a = list(map(int, input().split()))
    t -= 1
    maxi = max(a)
    # Your code goes here
    # print(maxi)
    maxi2 = 0
    for i in range(0,len(a)):
        if(a[i]!=maxi):
            if(maxi2<a[i]):
                maxi2 = a[i]
    # print(maxi2)
    print(maxi+maxi2)
