# code.plus - 최대공약수와 최소공배수

a, b = map(int, input().split())
max_res = 0
min_res = 0

min_res = a * b

if a >= b :
    max_res = a
    a = b
    b = max_res

while a % b != 0 :
    max_res = a % b
    a = b
    b = max_res
max_res = b

min_res = min_res // max_res

print(max_res)
print(min_res)