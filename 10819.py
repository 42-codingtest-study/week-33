from itertools import permutations

N = int(input())
lst = list(map(int, input().split()))
lst.sort()
max_sum = -1


def calc_sum(_lst):
    _sum = 0
    for i in range(len(_lst) - 1):
        _sum += abs(_lst[i] - _lst[i + 1])
    return _sum


for i in list(permutations(lst, N)):
    max_sum = max(max_sum, calc_sum(i))
print(max_sum)
