

### **1. NumPy Attributes**
#### **Program 1**
```python
import numpy as np
arr = np.array([1, 2, 3, 4, 5])
print("Shape:", arr.shape)
print("Size:", arr.size)
print("Data type:", arr.dtype)
```

#### **Program 2**
```python
arr2 = np.array([[1, 2, 3], [4, 5, 6]])
print("Number of dimensions:", arr2.ndim)
print("Total elements:", arr2.size)
print("Item size (bytes):", arr2.itemsize)
```

#### **Program 3**
```python
arr3 = np.random.randint(1, 10, size=(2, 3, 4))
print("Array shape:", arr3.shape)
print("Array size:", arr3.size)
print("Total bytes:", arr3.nbytes)
```

---

### **2. Array Indexing: Accessing Single Elements**
#### **Program 1**
```python
arr = np.array([10, 20, 30, 40, 50])
print("First element:", arr[0])
print("Last element:", arr[-1])
```

#### **Program 2**
```python
arr2 = np.array([[1, 2, 3], [4, 5, 6]])
print("Element at (0, 1):", arr2[0, 1])
print("Element at (1, 2):", arr2[1, 2])
```

#### **Program 3**
```python
arr3 = np.array([[[1, 2], [3, 4]], [[5, 6], [7, 8]]])
print("Element at (1, 0, 1):", arr3[1, 0, 1])
```

---

### **3. Array Slicing: Accessing Subarrays**
#### **Program 1**
```python
arr = np.arange(10)
print("First 5 elements:", arr[:5])
print("Elements 5 to 8:", arr[5:9])
```

#### **Program 2**
```python
arr2 = np.array([[1, 2, 3], [4, 5, 6], [7, 8, 9]])
print("First two rows:\n", arr2[:2, :])
print("Last two columns:\n", arr2[:, 1:])
```

#### **Program 3**
```python
arr3 = np.array([10, 20, 30, 40, 50])
print("Every other element:", arr3[::2])
print("Reversed array:", arr3[::-1])
```

---

### **4. Reshaping Arrays**
#### **Program 1**
```python
arr = np.arange(1, 10).reshape(3, 3)
print("Reshaped array:\n", arr)
```

#### **Program 2**
```python
arr = np.array([1, 2, 3, 4])
row_vector = arr[np.newaxis, :]
print("Row vector:\n", row_vector)
```

#### **Program 3**
```python
col_vector = arr[:, np.newaxis]
print("Column vector:\n", col_vector)
```

---

### **5. Array Concatenation and Splitting**
#### **Program 1**
```python
arr1 = np.array([1, 2, 3])
arr2 = np.array([4, 5, 6])
print("Concatenated array:", np.concatenate([arr1, arr2]))
```

#### **Program 2**
```python
arr = np.arange(10)
split1, split2 = np.split(arr, [5])
print("First split:", split1)
print("Second split:", split2)
```

#### **Program 3**
```python
arr = np.array([[1, 2], [3, 4]])
print("Concatenated along axis 0:\n", np.concatenate([arr, arr]))
```

---

### **6. Universal Functions**
#### **Program 1**
```python
arr = np.array([1, 2, 3, 4])
print("Square of elements:", np.square(arr))
```

#### **Program 2**
```python
arr = np.array([0, np.pi / 2, np.pi])
print("Sine of elements:", np.sin(arr))
```

#### **Program 3**
```python
arr = np.array([1, 2, 4])
print("Logarithm (base 2):", np.log2(arr))
```

---

### **7. Broadcasting**
#### **Program 1**
```python
arr = np.array([1, 2, 3])
print("Array + 5:", arr + 5)
```

#### **Program 2**
```python
arr1 = np.array([[1], [2], [3]])
arr2 = np.array([4, 5, 6])
print("Broadcasted sum:\n", arr1 + arr2)
```

#### **Program 3**
```python
matrix = np.ones((2, 3))
vector = np.array([1, 2, 3])
print("Matrix + Vector:\n", matrix + vector)
```

---

### **8. Fancy Indexing**
#### **Program 1**
```python
arr = np.array([10, 20, 30, 40, 50])
print("Selected elements:", arr[[1, 3, 4]])
```

#### **Program 2**
```python
arr = np.arange(12).reshape(3, 4)
rows = np.array([0, 1])
cols = np.array([2, 3])
print("Selected elements:", arr[rows, cols])
```

#### **Program 3**
```python
arr = np.array([5, 10, 15, 20, 25])
mask = [0, 3, 4]
print("Fancy indexing with mask:", arr[mask])
```

