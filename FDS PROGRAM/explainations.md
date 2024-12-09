
## **NumPy Programs**

### **1. Create and Manipulate Arrays**
```python
import numpy as np

# Create a 1D array
arr = np.array([1, 2, 3, 4, 5])
print("1D Array:", arr)

# Create a 2D array
arr_2d = np.array([[1, 2, 3], [4, 5, 6]])
print("\n2D Array:\n", arr_2d)

# Access elements
print("\nElement at (1,2):", arr_2d[1, 2])  # Row 1, Column 2

# Modify an element
arr[2] = 10
print("\nModified Array:", arr)

# Slicing
print("\nSlice of Array:", arr[1:4])
```

**Explanation**: This demonstrates array creation, indexing, modifying elements, and slicing in NumPy arrays.

---

### **2. Mathematical Operations**
```python
# Create arrays
a = np.array([1, 2, 3])
b = np.array([4, 5, 6])

# Arithmetic operations
print("Addition:", a + b)
print("Multiplication:", a * b)

# Universal functions
print("Square Root:", np.sqrt(a))
print("Dot Product:", np.dot(a, b))
```

**Explanation**: NumPy supports element-wise operations and universal functions like `sqrt` and `dot`.

---

### **3. Reshape and Broadcasting**
```python
# Reshape an array
arr = np.arange(9).reshape(3, 3)
print("Reshaped Array:\n", arr)

# Broadcasting
arr2 = np.array([1, 2, 3])
print("\nBroadcasted Addition:\n", arr + arr2)
```

**Explanation**: Reshape changes the shape of an array, and broadcasting allows arithmetic between arrays of different shapes.

---

### **4. Random Number Generation**
```python
# Generate random numbers
random_arr = np.random.random((3, 3))
print("Random Array:\n", random_arr)

# Random integers
rand_ints = np.random.randint(10, 50, (2, 3))
print("\nRandom Integers:\n", rand_ints)
```

**Explanation**: NumPy provides functions for random number generation, such as `random.random` and `random.randint`.

---

## **Pandas Programs**

### **1. Creating and Analyzing DataFrames**
```python
import pandas as pd

# Create a DataFrame
data = {'Name': ['Alice', 'Bob', 'Charlie'], 'Age': [25, 30, 35], 'Score': [85, 90, 95]}
df = pd.DataFrame(data)
print("DataFrame:\n", df)

# Analyze DataFrame
print("\nBasic Info:\n", df.info())
print("\nDescribe:\n", df.describe())
```

**Explanation**: Pandas DataFrames are tabular structures. `info()` provides metadata, and `describe()` offers statistical summaries.

---

### **2. Handling Missing Data**
```python
# Create DataFrame with NaN
data = {'Name': ['Alice', 'Bob', None], 'Age': [25, None, 35], 'Score': [85, 90, None]}
df = pd.DataFrame(data)
print("Original DataFrame:\n", df)

# Drop rows with NaN
print("\nDrop NaN:\n", df.dropna())

# Fill NaN with a value
print("\nFill NaN:\n", df.fillna(0))
```

**Explanation**: Missing data can be handled by dropping rows (`dropna`) or filling values (`fillna`).

---

### **3. Grouping and Aggregation**
```python
# Group data and aggregate
data = {'Department': ['HR', 'HR', 'IT', 'IT'], 'Salary': [50000, 60000, 70000, 80000]}
df = pd.DataFrame(data)
grouped = df.groupby('Department').mean()
print("Grouped Data:\n", grouped)
```

**Explanation**: `groupby` allows grouping data, and `mean()` calculates the average for each group.

---

### **4. Merging and Joining**
```python
# Create two DataFrames
df1 = pd.DataFrame({'ID': [1, 2, 3], 'Name': ['Alice', 'Bob', 'Charlie']})
df2 = pd.DataFrame({'ID': [1, 2, 4], 'Score': [85, 90, 95]})

# Merge
merged = pd.merge(df1, df2, on='ID', how='inner')
print("Merged DataFrame:\n", merged)
```

**Explanation**: Merging combines DataFrames based on common columns. `how='inner'` performs an inner join.

---

### **5. Pivot Tables**
```python
# Create a DataFrame
data = {'Month': ['Jan', 'Jan', 'Feb', 'Feb'],
        'Category': ['A', 'B', 'A', 'B'],
        'Sales': [200, 150, 300, 250]}
df = pd.DataFrame(data)

# Pivot Table
pivot = df.pivot_table(values='Sales', index='Month', columns='Category', aggfunc='sum')
print("Pivot Table:\n", pivot)
```

**Explanation**: Pivot tables summarize data, grouping by index and columns, and applying an aggregation function.

---

### **6. Time-Series Data**
```python
# Generate date range
dates = pd.date_range(start='2023-01-01', periods=5)

# Create a time-series DataFrame
df = pd.DataFrame({'Date': dates, 'Value': [10, 15, 20, 25, 30]})
print("Time-Series DataFrame:\n", df)

# Set the index as dates
df.set_index('Date', inplace=True)
print("\nWith Date Index:\n", df)
```

**Explanation**: Pandas provides tools for time-series data, like creating date ranges and setting date indexes.

---

By practicing these programs, you’ll gain proficiency in NumPy and Pandas, covering array manipulations, DataFrame creation, data analysis, grouping, merging, and handling time-series data.
