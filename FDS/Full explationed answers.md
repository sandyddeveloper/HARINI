
### **Q11 (a) (i): Handling Datasets with >30% Missing Values**

#### **Question Analysis:**  
The question is about managing datasets with significant amounts of missing data. Missing values can distort analysis and model performance, making this a critical part of data preprocessing.

#### **Elaborated Answer:**  
When more than 30% of values in a dataset are missing, we must carefully decide whether to retain or discard the data. Below are the key strategies:  

1. **Remove Features with High Missing Values:**  
   - If a feature has over 30% missing data and is not essential, it can be removed to simplify the dataset.  
   - This reduces computational complexity and avoids introducing biases during imputation.  

2. **Imputation Techniques:**  
   - Missing data can be filled using statistical or machine learning methods:  
     - **Mean/Median/Mode Imputation:** Replace missing values with the mean (numerical), median (numerical, robust to outliers), or mode (categorical).  
     - **K-Nearest Neighbors (KNN) Imputation:** Use similar rows to estimate missing values.  
     - **Regression Imputation:** Predict missing values using regression models based on other features.  

3. **Advanced Methods:**  
   - Use machine learning or deep learning models to predict missing values based on patterns in the data.  

4. **Domain Knowledge:**  
   - Understand the context of the dataset and consult domain experts to decide how missing values should be handled.  

5. **Flag Missing Values:**  
   - Create an additional binary column to indicate where values were missing. This can help capture patterns in missing data for predictive modeling.  

6. **Consider Dropping Rows:**  
   - If the dataset is large and the rows with missing values do not significantly impact analysis, drop them.

---

### **Q11 (a) (ii): Feature Selection Methods**

#### **Question Analysis:**  
Feature selection improves model efficiency by reducing irrelevant or redundant variables. The question asks for methods and an explanation of two techniques.

#### **Elaborated Answer:**  
**Feature Selection** is the process of selecting the most important variables for building predictive models. This step reduces overfitting, improves performance, and speeds up computation.  

1. **Filter Methods:**  
   - Features are selected based on statistical tests like correlation, chi-square, and ANOVA.  
   - These methods are computationally efficient and independent of machine learning models.  

2. **Wrapper Methods:**  
   - Evaluate subsets of features by training models and selecting the best-performing subset.  
   - Example: Forward Selection (start with no features, add one at a time), Backward Elimination (start with all features, remove one at a time).  

3. **Embedded Methods:**  
   - Combine feature selection with model building. Algorithms like Lasso and Ridge regularization automatically select important features.  

4. **Dimensionality Reduction:**  
   - Methods like PCA reduce the number of variables by combining features into components that explain most of the variance.  

**Explanation of Two Methods:**  
1. **Correlation (Filter Method):**  
   - Measures how strongly features are linearly related to the target variable.  
   - Features with high correlation to the target and low inter-correlation are selected.  

2. **Lasso Regression (Embedded Method):**  
   - Adds an L1 penalty to the regression loss function, forcing the coefficients of less important features to zero.  
   - Features with non-zero coefficients are retained.

---

### **Q11 (b) (i): Data Analytic Life Cycle and Time-Series Analysis**

#### **Question Analysis:**  
This question requires understanding the stages of a data analysis project and applying time-series methods for sequential data.

#### **Elaborated Answer:**  

**Data Analytic Life Cycle:**  
1. **Discovery:**  
   - Define the business problem and identify objectives.  
   - Understand the data and its relevance to the problem.  

2. **Data Preparation:**  
   - Collect, clean, and preprocess data.  
   - Handle missing values, remove duplicates, and normalize data.  

3. **Model Planning:**  
   - Perform exploratory data analysis (EDA) to find relationships between features.  
   - Choose algorithms and decide on evaluation metrics.  

4. **Model Building:**  
   - Train machine learning models on the dataset.  

5. **Evaluation:**  
   - Evaluate the model's performance using metrics like accuracy, precision, recall, etc.  

6. **Deployment:**  
   - Deploy the model to production for real-world use.  

**Time-Series Analysis:**  
- Deals with data collected at specific intervals (e.g., daily sales, stock prices).  
- Focuses on trends, seasonality, and making future predictions.  
- Techniques include moving averages, ARIMA, and exponential smoothing.  

---

### **Q11 (b) (ii): Data Cleansing and Missing Data Handling**

#### **Question Analysis:**  
The question emphasizes the importance of cleaning datasets and strategies to handle missing/null data effectively.

#### **Elaborated Answer:**  

**Purpose of Data Cleansing:**  
1. Remove inconsistencies, errors, and redundancies.  
2. Improve the quality and reliability of the dataset.  
3. Ensure accurate analysis and robust model performance.  

**Handling Missing Data:**  
1. **Detect Missing Values:**  
   - Use statistical summaries and visualizations to identify missing data.  

2. **Impute Missing Data:**  
   - Mean/Median/Mode imputation.  
   - KNN or regression-based imputation.  

3. **Remove Data:**  
   - Drop rows or columns with excessive missing data.  

4. **Interpolate Missing Data:**  
   - Use trends from nearby values to estimate missing values (linear or polynomial interpolation).  

5. **Flag Missing Data:**  
   - Add a binary column to indicate missingness.  

---

### **Q12 (a) (i): Skewness**  

#### **Question Analysis:**  
The question focuses on understanding the shape of distributions based on the relationship between the mean and median.

#### **Elaborated Answer:**  

1. **Incomes of taxpayers:**  
   - Mean = $48,000, Median = $43,000  
   - Mean > Median indicates a **positively skewed distribution** (longer right tail).  

2. **GPAs of students:**  
   - Mean = 3.01, Median = 3.20  
   - Mean < Median indicates a **negatively skewed distribution** (longer left tail).  

---

### **Q12 (a) (ii): Mode, Median, and Mean Calculation**

#### **Question Analysis:**  
The question tests statistical measures and understanding of data distribution.

#### **Elaborated Answer:**  

**Data:**  
2, 17, 5, 3, 28, 7, 5, 8, 5, 6, 2, 12, 10, 4, 3  

1. **Mode:**  
   - Count the occurrences:  
     - 2 → 2 times, 3 → 2 times, 5 → 3 times (most frequent).  
   - **Mode = 5**  

2. **Median:**  
   - Arrange in ascending order:  
     2, 2, 3, 3, 4, 5, 5, 5, 6, 7, 8, 10, 12, 17, 28  
   - Total values = 15 → Median = middle value = **5**  

3. **Mean:**  
   - Sum = 2 + 17 + 5 + 3 + 28 + 7 + 5 + 8 + 5 + 6 + 2 + 12 + 10 + 4 + 3 = 117  
   - Number of values = 15  
   - **Mean = \( \frac{117}{15} = 7.8 \)**  

**Shape of Distribution:**  
- Mean > Median indicates a **positively skewed distribution**.  
