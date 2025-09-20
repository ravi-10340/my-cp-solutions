t = int(input())
for _ in range(t):
    n, k, x = map(int, input().split())
    smin = k * (k + 1) // 2
    smax = k * (2 * n - k + 1) // 2
    if smin <= x <= smax:
        print("YES")
    else:
        print("NO")
