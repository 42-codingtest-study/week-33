from itertools import permutations

N = int(input())
for i in list(permutations(range(1, N + 1), N)):
    print(*i)
