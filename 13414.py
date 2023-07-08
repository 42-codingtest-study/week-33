import sys
input = sys.stdin.readline

k, l = map(int, input().split())
click = {}

for i in range (0, l) :
    click[input().rstrip()] = i

result = sorted(click.items(), key=lambda item: item[1])

k = len(result) if k > len(result) else k
    
for i in range (0, k):
    print(result[i][0])