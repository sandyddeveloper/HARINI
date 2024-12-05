
### **Q11 (a) (i)**  
**Suppose there is a dataset having variables with missing values of more than 30%, how will you deal with such a dataset?**  

**Answer:**  
In data science, handling missing values is critical to ensure model accuracy and data integrity. If more than 30% of values are missing, we address this problem using:  

1. **Removing Features:**  
   - Drop columns with >30% missing values if they are not crucial to the analysis.  
   - Use dimensionality reduction techniques like PCA if necessary.  

2. **Imputation Techniques:**  
   - **Mean/Median/Mode Imputation:** For numerical data, replace missing values with the mean or median. For categorical data, use mode.  
   - **KNN Imputation:** Predict missing values based on similar data points.  
   - **Regression Imputation:** Use regression models to predict and fill missing values.  

3. **Advanced Methods:**  
   - Use machine learning models to predict missing values.  
   - Apply deep learning approaches for imputation in large datasets.  

4. **Domain Knowledge:**  
   - Consult domain experts to make informed decisions about the missing data.  

5. **Flagging Missing Data:**  
   - Add a binary flag indicating whether the value was missing.  

---

### **Q11 (a) (ii)**  
**List down the various feature selection methods for selecting the right variables for building efficient predictive models. Explain about any two selection methods.**  

**Answer:**  
Feature selection is essential in data science for reducing complexity, avoiding overfitting, and improving model efficiency.  

**Types of Feature Selection Methods:**  

1. **Filter Methods:**  
   - Select features based on statistical measures (e.g., correlation, chi-square test, ANOVA).  

2. **Wrapper Methods:**  
   - Evaluate features based on their impact on model performance (e.g., forward selection, backward elimination).  

3. **Embedded Methods:**  
   - Use algorithms like Lasso, Ridge, and Decision Trees where feature selection is integrated.  

4. **Dimensionality Reduction Techniques:**  
   - Techniques like PCA (Principal Component Analysis) reduce the number of features while retaining most of the variance.  

**Explanation of Two Methods:**  
1. **Correlation (Filter Method):**  
   - Measures the linear relationship between each feature and the target variable.  
   - Features with high correlation to the target and low inter-correlation are selected.  

2. **Lasso Regression (Embedded Method):**  
   - Adds an L1 regularization penalty to the regression model.  
   - Features with less importance are automatically dropped (coefficient = 0).  

---

### **Q11 (b) (i)**  
**Explain the Data Analytic Life Cycle. Brief about Time-Series Analysis.**  

**Answer:**  

#### **Data Analytic Life Cycle:**  
The data analytic life cycle consists of six stages:  
1. **Discovery:**  
   - Identify business objectives and goals.  
   - Understand the dataset and its characteristics.  

2. **Data Preparation:**  
   - Collect and clean the data.  
   - Handle missing values, duplicates, and outliers.  

3. **Model Planning:**  
   - Select suitable algorithms and tools for analysis.  
   - Perform exploratory data analysis (EDA).  

4. **Model Building:**  
   - Train machine learning models on prepared data.  

5. **Evaluation:**  
   - Evaluate models using metrics like accuracy, precision, recall, etc.  

6. **Deployment:**  
   - Deploy the model to production for real-world use.  

#### **Time-Series Analysis:**  
- A method to analyze data that is recorded at regular time intervals.  
- Focuses on:  
  - **Trend Analysis:** Identifying long-term patterns.  
  - **Seasonality:** Repeating patterns within specific time periods.  
  - **Forecasting:** Predicting future values based on historical data.  

---

### **Q11 (b) (ii)**  
**Outline the purpose of data cleansing. How missing and nullified data attributes are handled and modified during preprocessing?**  

**Answer:**  
#### **Purpose of Data Cleansing:**  
- Improve data quality by correcting errors, inconsistencies, and inaccuracies.  
- Prepare the dataset for analysis or machine learning.  
- Enhance the reliability of the results.  

#### **Handling Missing and Nullified Data:**  
1. **Detect Missing Values:**  
   - Use statistical tools or visualization techniques to identify missing data.  

2. **Imputation:**  
   - Replace missing data with the mean, median, mode, or predictions.  

3. **Removal:**  
   - Remove rows or columns with excessive missing values if necessary.  

4. **Interpolation:**  
   - Estimate missing values based on trends in surrounding data.  

5. **Flagging:**  
   - Add binary columns to indicate missing values for further analysis.  

6. **Data Transformation:**  
   - Normalize or standardize data after handling missing values.  

---

### **Q12 (a) (i): Skewness**  

**(1) Incomes of taxpayers have a mean of $48,000 and a median of $43,000.**  
- **Answer:** Positively Skewed  
  - Mean > Median indicates a longer right tail.  

**(2) GPAs for all students at some college have a mean of 3.01 and a median of 3.20.**  
- **Answer:** Negatively Skewed  
  - Mean < Median indicates a longer left tail.  

---

### **Q12 (a) (ii): Mode, Median, and Mean Calculation**  

**Given Data:**  
2, 17, 5, 3, 28, 7, 5, 8, 5, 6, 2, 12, 10, 4, 3  

1. **Mode:**  
   - Count occurrences:  
     - 2 → 2 times, 3 → 2 times, 5 → 3 times (highest frequency).  
   - **Mode = 5**  

2. **Median:**  
   - Arrange in ascending order:  
     2, 2, 3, 3, 4, 5, 5, 5, 6, 7, 8, 10, 12, 17, 28  
   - Total values = 15 (odd number).  
   - Median is the middle value: **Median = 5**  

3. **Mean:**  
   - Formula:  
     \[
     \text{Mean} = \frac{\text{Sum of all values}}{\text{Number of values}}
     \]  
   - Sum of values:  
     \[
     2 + 17 + 5 + 3 + 28 + 7 + 5 + 8 + 5 + 6 + 2 + 12 + 10 + 4 + 3 = 117
     \]  
   - Total values = 15  
     \[
     \text{Mean} = \frac{117}{15} = 7.8
     \]  
   - **Mean = 7.8**  

---

**Q12 (a) (ii) (2): Shape of the Distribution**  

1. **Observation:**  
   - Mean = 7.8, Median = 5  
   - Mean > Median indicates skewed to the right.  

2. **Conclusion:**  
   - **The distribution is positively skewed.**  

