Here’s a collection of **Pandas programs** tailored to cover your specified topics and concepts, complete with explanations. 

---

### **1. Creating DataFrames**
```python
import pandas as pd

# Create a DataFrame from a dictionary
data = {'Name': ['Alice', 'Bob', 'Charlie'], 'Age': [25, 30, 35], 'Score': [85, 90, 95]}
df = pd.DataFrame(data)
print("DataFrame:\n", df)

# Create DataFrame from a list of lists
data_list = [['Alice', 25, 85], ['Bob', 30, 90], ['Charlie', 35, 95]]
df_list = pd.DataFrame(data_list, columns=['Name', 'Age', 'Score'])
print("\nDataFrame from List:\n", df_list)
```

---

### **2. DataFrame Selection and Indexing**
```python
# Select columns
print("Select 'Name' column:\n", df['Name'])

# Select rows using loc
print("\nSelect first row using loc:\n", df.loc[0])

# Select rows and columns using iloc
print("\nSelect first row and first column using iloc:\n", df.iloc[0, 0])
```

---

### **3. Adding and Dropping Columns**
```python
# Add a new column
df['Passed'] = df['Score'] > 50
print("\nDataFrame with New Column:\n", df)

# Drop a column
df_dropped = df.drop(columns=['Passed'])
print("\nDataFrame after Dropping Column:\n", df_dropped)
```

---

### **4. Filtering and Conditional Selection**
```python
# Filter rows based on condition
filtered_df = df[df['Age'] > 28]
print("\nRows where Age > 28:\n", filtered_df)

# Combine conditions
combined_filter = df[(df['Age'] > 28) & (df['Score'] > 90)]
print("\nRows where Age > 28 and Score > 90:\n", combined_filter)
```

---

### **5. Handling Missing Data**
```python
# Create a DataFrame with missing values
data_with_nan = {'Name': ['Alice', None, 'Charlie'], 'Age': [25, 30, None], 'Score': [85, None, 95]}
df_nan = pd.DataFrame(data_with_nan)
print("DataFrame with Missing Values:\n", df_nan)

# Fill missing values
df_filled = df_nan.fillna({'Name': 'Unknown', 'Age': df_nan['Age'].mean(), 'Score': 50})
print("\nFilled DataFrame:\n", df_filled)

# Drop rows with missing values
df_dropped = df_nan.dropna()
print("\nDataFrame after Dropping Missing Values:\n", df_dropped)
```

---

### **6. Grouping and Aggregation**
```python
data = {'Category': ['A', 'A', 'B', 'B'], 'Value': [10, 20, 30, 40]}
df_group = pd.DataFrame(data)

# Group by Category and sum
grouped = df_group.groupby('Category').sum()
print("\nGrouped DataFrame:\n", grouped)

# Aggregation with multiple functions
agg = df_group.groupby('Category')['Value'].agg(['sum', 'mean'])
print("\nAggregated DataFrame:\n", agg)
```

---

### **7. Merging and Joining**
```python
# Create two DataFrames
df1 = pd.DataFrame({'ID': [1, 2], 'Name': ['Alice', 'Bob']})
df2 = pd.DataFrame({'ID': [2, 3], 'Score': [90, 85]})

# Merge on ID
merged = pd.merge(df1, df2, on='ID', how='outer')
print("\nMerged DataFrame:\n", merged)
```

---

### **8. Pivot Table and Crosstab**
```python
data = {'Date': ['2023-01-01', '2023-01-01', '2023-01-02', '2023-01-02'],
        'Category': ['A', 'B', 'A', 'B'], 'Sales': [200, 150, 300, 250]}
df_pivot = pd.DataFrame(data)

# Pivot Table
pivot = df_pivot.pivot_table(values='Sales', index='Date', columns='Category', aggfunc='sum')
print("\nPivot Table:\n", pivot)

# Crosstab
crosstab = pd.crosstab(df_pivot['Date'], df_pivot['Category'])
print("\nCrosstab:\n", crosstab)
```

---

### **9. Sorting and Ranking**
```python
data = {'Name': ['Alice', 'Bob', 'Charlie'], 'Age': [25, 30, 35], 'Score': [85, 95, 90]}
df_sort = pd.DataFrame(data)

# Sort by column
sorted_df = df_sort.sort_values(by='Score', ascending=False)
print("\nSorted DataFrame:\n", sorted_df)

# Add rank
df_sort['Rank'] = df_sort['Score'].rank(ascending=False)
print("\nDataFrame with Rank:\n", df_sort)
```

---

### **10. Working with Time Series**
```python
# Generate time-series data
dates = pd.date_range(start='2023-01-01', periods=5)
time_series_df = pd.DataFrame({'Date': dates, 'Sales': [200, 250, 300, 350, 400]})

# Set index and analyze
time_series_df.set_index('Date', inplace=True)
print("\nTime-Series DataFrame:\n", time_series_df)

# Resample to weekly sales
weekly_sales = time_series_df.resample('W').sum()
print("\nWeekly Resampled Sales:\n", weekly_sales)
```

---

### **11. Visualization with Pandas**
```python
import matplotlib.pyplot as plt

# Create data
data = {'Category': ['A', 'B', 'C'], 'Values': [100, 200, 300]}
df_plot = pd.DataFrame(data)

# Bar plot
df_plot.plot(kind='bar', x='Category', y='Values', title='Category vs Values')
plt.show()
```

---
