n = int(input())
bills = n // 100
n %= 100
bills += n // 20
n %= 20
bills += n // 10
n %= 10
bills += n // 5
n %= 5
bills += n
print(bills)
