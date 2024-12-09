
### **1. NumPy Operations**

#### **Array Creation and Indexing**
```python
import numpy as np

# Create an array
arr = np.array([10, 20, 30, 40, 50])

# Access elements
print("First Element:", arr[0])
print("Last Element:", arr[-1])

# Slicing
print("First three elements:", arr[:3])
print("Reversed array:", arr[::-1])
```

#### **Arithmetic Operations**
```python
# Arithmetic with arrays
a = np.array([1, 2, 3])
b = np.array([4, 5, 6])
print("Addition:", a + b)
print("Multiplication:", a * b)
```

---

### **2. Handling Missing Data in Pandas**
```python
import pandas as pd

# Create a DataFrame with missing values
data = {'Name': ['Alice', 'Bob', None], 'Score': [90, None, 80]}
df = pd.DataFrame(data)
print("Original DataFrame:\n", df)

# Fill missing values
df_filled = df.fillna({'Name': 'Unknown', 'Score': df['Score'].mean()})
print("\nFilled DataFrame:\n", df_filled)
```

---

### **3. Grouping and Aggregation**
```python
# Grouping and applying aggregation
data = {'Category': ['A', 'B', 'A', 'B'], 'Value': [10, 20, 30, 40]}
df = pd.DataFrame(data)

grouped = df.groupby('Category').sum()
print("Grouped DataFrame:\n", grouped)
```

---

### **4. Merging and Joining**
```python
# Create two DataFrames
df1 = pd.DataFrame({'ID': [1, 2], 'Name': ['Alice', 'Bob']})
df2 = pd.DataFrame({'ID': [1, 2], 'Score': [85, 90]})

merged = pd.merge(df1, df2, on='ID')
print("Merged DataFrame:\n", merged)
```

---

### **5. Pivot Table**
```python
# Create data for pivot
data = {'Date': ['2023-01-01', '2023-01-01', '2023-01-02', '2023-01-02'],
        'Category': ['A', 'B', 'A', 'B'],
        'Sales': [200, 150, 300, 250]}
df = pd.DataFrame(data)

pivot = df.pivot_table(values='Sales', index='Date', columns='Category', aggfunc='sum')
print("Pivot Table:\n", pivot)
```

---

### **6. Time-Series Analysis**
```python
# Generate time-series data
dates = pd.date_range(start='2023-01-01', periods=5)
df = pd.DataFrame({'Date': dates, 'Sales': [200, 250, 300, 350, 400]})

# Set index
df.set_index('Date', inplace=True)
print("Time-Series DataFrame:\n", df)
```

---

### **7. Random Number Generation**
```python
# Random number array
rand_array = np.random.random((3, 3))
print("Random Array:\n", rand_array)

# Random integers
rand_ints = np.random.randint(1, 100, (3, 3))
print("\nRandom Integers:\n", rand_ints)
```

---

### **8. Visualization of Pandas Data**
```python
import matplotlib.pyplot as plt

# Create data
data = {'Category': ['A', 'B', 'C'], 'Values': [100, 200, 300]}
df = pd.DataFrame(data)

# Bar plot
df.plot(kind='bar', x='Category', y='Values', title='Category vs Values')
plt.show()
```

---

### **9. DataFrame Manipulation**
```python
# Create and manipulate DataFrame
data = {'Name': ['Alice', 'Bob', 'Charlie'], 'Age': [25, 30, 35], 'Score': [85, 90, 95]}
df = pd.DataFrame(data)

# Add a new column
df['Passed'] = df['Score'] > 50
print("Updated DataFrame:\n", df)

# Drop a column
df = df.drop(columns=['Passed'])
print("\nAfter Dropping Column:\n", df)
```

