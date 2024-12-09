Here’s a collection of **NumPy programs** covering your topics, with explanations:

---

### **1. Creating Arrays**
```python
import numpy as np

# Create 1D, 2D, and 3D arrays
arr_1d = np.array([1, 2, 3])
arr_2d = np.array([[1, 2], [3, 4]])
arr_3d = np.array([[[1, 2], [3, 4]], [[5, 6], [7, 8]]])

print("1D Array:\n", arr_1d)
print("\n2D Array:\n", arr_2d)
print("\n3D Array:\n", arr_3d)
```

---

### **2. Array Indexing and Slicing**
```python
# Indexing
print("Element at index 1 in 1D array:", arr_1d[1])
print("Element at row 1, col 1 in 2D array:", arr_2d[1, 1])

# Slicing
print("\nSlicing 1D array:", arr_1d[1:])
print("Slicing rows of 2D array:\n", arr_2d[1, :])
```

---

### **3. Array Operations**
```python
# Arithmetic operations
arr = np.array([1, 2, 3])
print("\nArray Addition:", arr + 5)
print("Array Multiplication:", arr * 2)

# Element-wise operations
arr1 = np.array([1, 2, 3])
arr2 = np.array([4, 5, 6])
print("\nElement-wise Addition:", arr1 + arr2)
```

---

### **4. Shape Manipulation**
```python
arr = np.array([[1, 2, 3], [4, 5, 6]])
print("\nOriginal Array:\n", arr)

# Reshape
reshaped = arr.reshape(3, 2)
print("\nReshaped Array:\n", reshaped)

# Flatten
flattened = arr.flatten()
print("\nFlattened Array:", flattened)
```

---

### **5. Broadcasting**
```python
arr = np.array([[1, 2, 3], [4, 5, 6]])
vector = np.array([1, 2, 3])

# Broadcasting example
result = arr + vector
print("\nBroadcasted Addition:\n", result)
```

---

### **6. Aggregation Functions**
```python
arr = np.array([[1, 2, 3], [4, 5, 6]])

print("\nSum of all elements:", np.sum(arr))
print("Mean of elements:", np.mean(arr))
print("Max element:", np.max(arr))
print("Row-wise sum:", np.sum(arr, axis=1))
```

---

### **7. Random Numbers**
```python
# Random numbers
rand_array = np.random.rand(3, 3)
print("\nRandom Array:\n", rand_array)

# Random integers
rand_ints = np.random.randint(1, 10, size=(3, 3))
print("\nRandom Integers:\n", rand_ints)
```

---

### **8. Stacking and Splitting**
```python
arr1 = np.array([1, 2, 3])
arr2 = np.array([4, 5, 6])

# Stacking
stacked = np.vstack((arr1, arr2))
print("\nVertical Stack:\n", stacked)

# Splitting
split = np.split(stacked, 2)
print("\nSplit Arrays:", split)
```

---

### **9. Sorting**
```python
arr = np.array([[3, 1, 2], [6, 5, 4]])

# Sort along different axes
sorted_arr = np.sort(arr, axis=1)
print("\nRow-wise Sorted Array:\n", sorted_arr)
```

---

### **10. Mathematical Functions**
```python
arr = np.array([0, np.pi / 2, np.pi])

# Trigonometric functions
print("\nSine Values:", np.sin(arr))
print("Cosine Values:", np.cos(arr))

# Exponential and log
arr = np.array([1, 2, 3])
print("\nExponential Values:", np.exp(arr))
print("Logarithmic Values:", np.log(arr))
```

---

### **11. Matrix Operations**
```python
mat1 = np.array([[1, 2], [3, 4]])
mat2 = np.array([[5, 6], [7, 8]])

# Matrix multiplication
result = np.dot(mat1, mat2)
print("\nMatrix Multiplication:\n", result)

# Transpose
transpose = mat1.T
print("\nMatrix Transpose:\n", transpose)
```

---

### **12. Linear Algebra**
```python
mat = np.array([[2, 1], [1, 3]])

# Determinant
det = np.linalg.det(mat)
print("\nDeterminant of Matrix:", det)

# Inverse
inv = np.linalg.inv(mat)
print("\nInverse of Matrix:\n", inv)
```

---

### **13. Working with NaN and Inf**
```python
arr = np.array([1, 2, np.nan, np.inf])

# Check for NaN
print("\nCheck for NaN:", np.isnan(arr))

# Replace NaN with 0
arr_cleaned = np.nan_to_num(arr)
print("\nCleaned Array:", arr_cleaned)
```

---

### **14. Creating Special Arrays**
```python
# Zeros
zeros = np.zeros((3, 3))
print("\nZeros Array:\n", zeros)

# Ones
ones = np.ones((2, 4))
print("\nOnes Array:\n", ones)

# Identity matrix
identity = np.eye(3)
print("\nIdentity Matrix:\n", identity)
```

---

### **15. Saving and Loading**
```python
arr = np.array([1, 2, 3, 4])

# Save array to a file
np.save('array.npy', arr)

# Load array
loaded_arr = np.load('array.npy')
print("\nLoaded Array:", loaded_arr)
```

---

Each program demonstrates core NumPy functionalities. Let me know if you'd like additional examples or explanations!
