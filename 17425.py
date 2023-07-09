# code.plus - 약수의 합

import sys

input = sys.stdin.readline
T = int(input())
res = [0 for _ in range(1000001)]

for i in range(1, 1000001) :
    for j in range(i, 1000001, i) :
        res[j] += i
    res[i] += res[i-1]

for _ in range(T) :
    N = int(input())
    print(res[N])