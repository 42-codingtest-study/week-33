import sys
input = sys.stdin.readline

n, d, k, c = map(int, input().split())
arr = []
for _ in range(n):
    arr.append(int(input()))

sushiCnt = {}
for i in range(k):
    # 초밥 종류 개수
    sushiCnt[arr[i]] = sushiCnt.get(arr[i], 0) + 1
sushiCnt[c] = sushiCnt.get(c, 0) + 1

answer = len(sushiCnt)

for i in range (k, n + k):
    left = i - k
    sushiCnt[arr[left]] -= 1
    if sushiCnt[arr[left]] == 0 :
        del sushiCnt[arr[left]]
    right = i % n
    # 초밥 종류 개수 추가
    sushiCnt[arr[right]] = sushiCnt.get(arr[right], 0) + 1
    sushiCnt[c] = sushiCnt.get(c, 0) + 1
    answer = max(answer, len(sushiCnt))

print(answer)