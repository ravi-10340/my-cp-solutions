n = int(input().strip())
a = list(map(int, input().split()))
 
mx = max(a)
mn = min(a)
 

imax = next(i for i, v in enumerate(a) if v == mx)

imin = n - 1 - next(i for i, v in enumerate(reversed(a)) if v == mn)
 
moves = imax + (n - 1 - imin)
if imax > imin:
    moves -= 1
 
print(moves)
