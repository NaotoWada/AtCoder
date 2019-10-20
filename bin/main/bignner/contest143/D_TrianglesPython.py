# Python3/PyPy3共にTLE
# https://atcoder.jp/contests/abc143/submissions/8061599
def solve(n, l):
    l = sorted(l)

    ans = 0
    for i in range(0, n):
        for j in range(i+1, n):
            for k in range(j+1, n):
                a = l[i]
                b = l[j]
                c = l[k]
                if a < b + c and b < a + c and c < a + b:
                    ans += 1
                else:
                    break
    return ans

n = int(input())
l = list(map(int, input().split()))

ans = solve(n, l)
print(ans)

# こっちの実装でもTLE
# https://atcoder.jp/contests/abc143/submissions/8062134
def solve(n, l):
    l = sorted(l)
    ret = [1 for i in range(0, n) for j in range(i+1, n) for k in range(j+1, n) if l[k] < l[i] + l[j]]
    return len(ret)

n = int(input())
l = list(map(int, input().split()))

ans = solve(n, l)
print(ans)