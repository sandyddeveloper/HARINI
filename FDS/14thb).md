 **Pandas** 



```python
import pandas as pd

# Step 1: Create a DataFrame with sales data
data = [
    {'Region': 'NorthSale', 'Sales': 1200},
    {'Region': 'SouthSale', 'Sales': 1500},
    {'Region': 'WestSale', 'Sales': 1100},
    {'Region': 'EastSale', 'Sales': 1300}
]

# Convert the list of dictionaries to a DataFrame
df = pd.DataFrame(data)

# Print the DataFrame
print("Sales DataFrame:")
print(df)

# Step 2: Combine North and West region sales
north_west_sales = df.loc[df['Region'].isin(['NorthSale', 'WestSale']), 'Sales'].sum()

# Step 3: Combine South and East region sales
south_east_sales = df.loc[df['Region'].isin(['SouthSale', 'EastSale']), 'Sales'].sum()

# Step 4: Print the aggregated sales values
print("\nAggregated Sales:")
print(f"North and West Sales: {north_west_sales}")
print(f"South and East Sales: {south_east_sales}")
```

---


The output will be:

```
Sales DataFrame:
      Region  Sales
0  NorthSale   1200
1  SouthSale   1500
2   WestSale   1100
3   EastSale   1300

Aggregated Sales:
North and West Sales: 2300
South and East Sales: 2800
```

---

### Explanation:
1. **DataFrame Creation**:
   - The sales data is created using a list of dictionaries.
   - Each dictionary represents a region and its corresponding sales.

2. **Combining Regions**:
   - The `loc` function is used to filter rows based on region names.
   - The `.sum()` function aggregates the sales for the desired regions.

3. **Printing Results**:
   - The values of the DataFrame and the calculated aggregates are displayed.

Let me know if you need further explanations!
