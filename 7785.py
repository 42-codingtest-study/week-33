import sys
input = sys.stdin.readline

n = int(input())
check = {}

for _ in range (n):
    name, state = map(str, input().split())
    if state == "enter":
        check[name] = state
    else:
        del check[name]

check = sorted(check.keys(), reverse=True)

for member in check:
    print(member)