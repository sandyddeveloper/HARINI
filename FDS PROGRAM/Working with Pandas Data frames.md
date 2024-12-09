

### **Program 1: Creating and Modifying a DataFrame**
#### **Code:**
```python
import pandas as pd

# Creating a dictionary
data = {
    "Name": ["Alice", "Bob", "Charlie"],
    "Age": [25, 30, 35],
    "City": ["New York", "Los Angeles", "Chicago"]
}

# Creating a DataFrame
df = pd.DataFrame(data)

# Displaying the DataFrame
print("Original DataFrame:")
print(df)

# Adding a new column
df["Profession"] = ["Engineer", "Doctor", "Teacher"]

print("\nUpdated DataFrame:")
print(df)
```

#### **Output:**
```
Original DataFrame:
      Name  Age         City
0    Alice   25     New York
1      Bob   30  Los Angeles
2  Charlie   35      Chicago

Updated DataFrame:
      Name  Age         City Profession
0    Alice   25     New York   Engineer
1      Bob   30  Los Angeles     Doctor
2  Charlie   35      Chicago    Teacher
```

---

### **Program 2: Indexing and Slicing**
#### **Code:**
```python
import pandas as pd

# Creating a DataFrame
data = {
    "State": ["California", "Texas", "New York", "Florida"],
    "Population": [38332521, 26448193, 19651127, 19552860],
    "Area": [423967, 695662, 141297, 170312]
}
df = pd.DataFrame(data, index=["CA", "TX", "NY", "FL"])

# Accessing specific rows using index
print("Row for Texas:")
print(df.loc["TX"])

# Accessing specific rows and columns
print("\nSubset of DataFrame:")
print(df.iloc[:2, :2])  # First 2 rows, first 2 columns
```

#### **Output:**
```
Row for Texas:
State           Texas
Population    26448193
Area            695662
Name: TX, dtype: object

Subset of DataFrame:
           State  Population
CA  California    38332521
TX       Texas    26448193
```

---

### **Program 3: Concatenation and Merging**
#### **Code:**
```python
import pandas as pd

# Creating two DataFrames
df1 = pd.DataFrame({
    "Employee": ["Alice", "Bob"],
    "Department": ["HR", "Finance"]
})
df2 = pd.DataFrame({
    "Employee": ["Alice", "Bob"],
    "Salary": [50000, 60000]
})

# Merging the DataFrames
merged_df = pd.merge(df1, df2, on="Employee")

print("Merged DataFrame:")
print(merged_df)

# Concatenating the DataFrames
concatenated_df = pd.concat([df1, df2], axis=0)

print("\nConcatenated DataFrame:")
print(concatenated_df)
```

#### **Output:**
```
Merged DataFrame:
  Employee Department  Salary
0    Alice        HR   50000
1      Bob    Finance   60000

Concatenated DataFrame:
  Employee Department   Salary
0    Alice        HR      NaN
1      Bob    Finance      NaN
0    Alice       NaN  50000.0
1      Bob       NaN  60000.0
```
---

### **Set 1: Basic Operations with DataFrames**
```python
import pandas as pd

# Create two dictionaries
population_dict = {'California': 38332521, 'Texas': 26448193, 'New York': 19651127}
area_dict = {'California': 423967, 'Texas': 695662, 'New York': 141297}

# Convert dictionaries to Series
population = pd.Series(population_dict)
area = pd.Series(area_dict)

# Create DataFrame
states = pd.DataFrame({'Population': population, 'Area': area})
print("Initial DataFrame:\n", states)

# Add a new column: Density
states['Density'] = states['Population'] / states['Area']
print("\nDataFrame with Density:\n", states)

# Access specific column
print("\nAccessing 'Area' column:\n", states['Area'])

# Transpose DataFrame
print("\nTransposed DataFrame:\n", states.T)
```

---

### **Set 2: MultiIndex and Hierarchical Index**
```python
import pandas as pd

# Create a MultiIndex
index = [('California', 2000), ('California', 2010),
         ('Texas', 2000), ('Texas', 2010)]
populations = [33871648, 37253956, 20851820, 25145561]

# MultiIndex Series
pop = pd.Series(populations, index=pd.MultiIndex.from_tuples(index))
print("MultiIndex Series:\n", pop)

# Convert to DataFrame and Unstack
pop_df = pop.unstack()
print("\nUnstacked DataFrame:\n", pop_df)

# Stack the DataFrame
stacked_pop = pop_df.stack()
print("\nStacked DataFrame:\n", stacked_pop)

# Adding a hierarchical column
pop_df['Under18'] = [9267089, 9284094, 5906301, 6879014]
print("\nHierarchical DataFrame:\n", pop_df)
```

---

### **Set 3: Concatenation, Merging, and Advanced Operations**
```python
import pandas as pd

# Create DataFrames
df1 = pd.DataFrame({'Employee': ['Bob', 'Jake'], 'Group': ['HR', 'Engineering']})
df2 = pd.DataFrame({'Employee': ['Bob', 'Jake'], 'Hire Date': [2004, 2012]})

# Merge DataFrames
merged_df = pd.merge(df1, df2)
print("Merged DataFrame:\n", merged_df)

# Concatenate DataFrames
df3 = pd.DataFrame({'Employee': ['Lisa'], 'Group': ['Finance']})
concat_df = pd.concat([df1, df3], ignore_index=True)
print("\nConcatenated DataFrame:\n", concat_df)

# Append DataFrames
appended_df = df1.append(df3, ignore_index=True)
print("\nAppended DataFrame:\n", appended_df)

# Using loc and iloc
print("\nAccessing first row with iloc:\n", merged_df.iloc[0])
print("\nAccessing first row with loc:\n", merged_df.loc[0])
```

