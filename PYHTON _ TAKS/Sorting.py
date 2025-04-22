#  input for Array A
n = int(input())
A = list(map(int, input().split()))

#  input for Array B
m = int(input())
B = list(map(int, input().split()))

# Swap all elements between A and B
A, B = B, A

print("Array A :", *A)
print("Array B :", *B)

#------------------------------------------------------------------------------------------------
# Getting input
n = int(input())
A = list(map(int, input().split()))

# Bubble Sort Alg
for i in range(n):
    for j in range(0, n-i-1):
        if A[j] > A[j+1]:
            A[j], A[j+1] = A[j+1], A[j]


print(*A)

