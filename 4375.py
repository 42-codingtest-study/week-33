# code.plus - 1

while (True) :
    num = 1
    cnt = 1
    try:
        n = int(input())
    except:
        break
    while (True) :
        if (num % n != 0) :
            num = num * 10 + 1
            cnt += 1
        else :
            break
    print (cnt)