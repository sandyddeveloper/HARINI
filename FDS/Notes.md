
## **1. Data Preprocessing and Data Cleaning**
### **Key Concepts:**
- **Handling Missing Data:**
  - **Deletion**: Remove rows/columns with missing data (only if they are not critical).
  - **Imputation**: Fill missing values with statistical measures like mean, median, or mode.
  - **Interpolation**: Estimate missing data based on surrounding data points.

- **Outlier Detection and Treatment:**
  - Use box plots or Z-scores (\( Z = \frac{(X - \mu)}{\sigma} \)) to identify outliers.
  - Treat outliers by:
    - **Winsorization**: Limiting extreme values.
    - **Transformation**: Logarithmic or square root transformation.

### **Example in Python:**
```python
import pandas as pd
import numpy as np

# Example dataset
data = {'Age': [25, 30, np.nan, 35, 40],
        'Salary': [50000, 60000, 75000, np.nan, 90000]}

df = pd.DataFrame(data)

# Handling missing data
df['Age'].fillna(df['Age'].mean(), inplace=True)  # Fill missing Age with mean
df['Salary'].fillna(df['Salary'].median(), inplace=True)  # Fill missing Salary with median

print(df)
```

---

## **2. Probability and Statistics**
### **Key Concepts:**
- **Mean, Median, Mode:**
  - **Mean**: Average of values.
  - **Median**: Middle value in sorted data.
  - **Mode**: Most frequent value.

- **Normal Distribution**:
  - Bell-shaped curve.
  - **68-95-99.7 Rule**: 68% of data falls within 1 SD, 95% within 2 SDs, 99.7% within 3 SDs.

- **Hypothesis Testing**:
  - **Null Hypothesis (\( H_0 \))**: No significant difference.
  - **Alternative Hypothesis (\( H_1 \))**: Significant difference exists.
  - Use p-values to accept or reject \( H_0 \) (e.g., \( p < 0.05 \)).

### **Example in Python:**
```python
from scipy.stats import ttest_1samp

# Sample data
data = [50, 52, 53, 49, 48, 51, 50]

# One-sample T-test
result = ttest_1samp(data, 50)  # Null hypothesis: mean = 50
print("P-value:", result.pvalue)
```

---

## **3. Data Visualization**
### **Key Concepts:**
- **Common Plots:**
  - **Histogram**: Distribution of data.
  - **Box Plot**: Identify outliers and spread.
  - **Scatter Plot**: Relationship between two variables.

### **Example in Python:**
```python
import matplotlib.pyplot as plt

# Scatter Plot Example
x = [10, 20, 30, 40]
y = [15, 25, 35, 45]

plt.scatter(x, y, color='blue')
plt.title("Scatter Plot Example")
plt.xlabel("X-Axis")
plt.ylabel("Y-Axis")
plt.show()
```

---

## **4. Regression Analysis**
### **Key Concepts:**
- **Linear Regression**:
  - Relationship between dependent (\( Y \)) and independent (\( X \)) variables.
  - Equation: \( Y = a + bX + \epsilon \).

- **Logistic Regression**:
  - Used for classification problems (binary outcomes).
  - Equation: \( P = \frac{1}{1 + e^{-z}} \), where \( z = a + bX \).

### **Example in Python (Linear Regression):**
```python
from sklearn.linear_model import LinearRegression
import numpy as np

# Sample data
X = np.array([[1], [2], [3], [4], [5]])
y = np.array([2, 4, 6, 8, 10])

# Linear Regression
model = LinearRegression()
model.fit(X, y)

print("Coefficient:", model.coef_)  # Slope
print("Intercept:", model.intercept_)  # Intercept
```

---

## **5. Time Series Analysis**
### **Key Concepts:**
- **Components of Time Series:**
  - **Trend**: Long-term movement.
  - **Seasonality**: Regular fluctuations.
  - **Residual/Noise**: Random variation.

- **ARIMA Model**:
  - Auto-Regressive Integrated Moving Average.
  - Suitable for forecasting.

### **Example in Python:**
```python
from statsmodels.tsa.arima.model import ARIMA

# Sample data
data = [10, 12, 15, 13, 17, 18, 21]

# Fit ARIMA model
model = ARIMA(data, order=(1, 1, 0))
model_fit = model.fit()

print(model_fit.summary())
```

---

## **6. Python for Data Science**
### **Key Operations:**
- **Dictionaries in Python:**
  - Initialize, add, update, delete, and merge.
- **Data Manipulation with Pandas:**
  - Merging, filtering, grouping, and aggregating data.

### **Dictionary Example:**
```python
# Dictionary operations
D1 = {'a': 1, 'b': 2}
D2 = {'b': 3, 'c': 4}

# Merge dictionaries
D3 = {**D1, **D2}
print("Merged Dictionary:", D3)

# Keys in D1 but not in D2
keys_only_in_D1 = D1.keys() - D2.keys()
print("Keys only in D1:", keys_only_in_D1)
```

---

## **7. Normal Distribution and Z-Scores**
### **Key Concepts:**
- **Z-Score Formula**: \( Z = \frac{(X - \mu)}{\sigma} \).
- **Application**:
  - Find probabilities using Z-tables.

### **Example in Python:**
```python
from scipy.stats import norm

# Z-Score example
z = (570 - 500) / 100  # Mean = 500, SD = 100
probability = norm.cdf(z)
print("Probability:", probability)
```

---

## **8. Autocorrelation**
### **Key Concepts:**
- Measures correlation between time series data and its lagged values.
- Positive autocorrelation indicates a repeating pattern.

### **Example in Python:**
```python
from pandas.plotting import autocorrelation_plot
import pandas as pd

# Sample data
data = pd.Series([2, 4, 6, 8, 10, 12])

# Plot autocorrelation
autocorrelation_plot(data)
```

---

## **9. Philosophy of Logistic Regression**
### **Key Concepts:**
- Logistic regression predicts probabilities for categorical outcomes.
- Difference from linear regression:
  - Linear regression predicts continuous values, logistic predicts probabilities.

