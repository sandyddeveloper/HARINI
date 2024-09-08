import pandas as pd

# Sample data
data = {
    'Date': ['2024-09-01', '2024-09-01', '2024-09-02', '2024-09-02', '2024-09-03'],
    'Category': ['Electronics', 'Clothing', 'Electronics', 'Clothing', 'Clothing'],
    'Sales': [200, 150, 250, 175, 300]
}

# Creating a DataFrame
df = pd.DataFrame(data)

# Creating a pivot table
pivot_table = pd.pivot_table(df, 
                             values='Sales', 
                             index='Date', 
                             columns='Category', 
                             aggfunc='sum', 
                             fill_value=0)

# Display the pivot table
print(pivot_table)


