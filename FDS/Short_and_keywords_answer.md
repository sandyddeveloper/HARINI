
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

### **Answers for the Questions**

---

### **Q12 (b) (i): Normal Curve for SAT Math Scores**

#### **Question Analysis:**  
The question asks to calculate the area under the normal curve for specific ranges of scores based on a normal distribution. The mean is 500, and the standard deviation (SD) is 100.

#### **Elaborated Answer:**  

1. **More than 570:**  
   - \( Z = \frac{(X - \mu)}{\sigma} = \frac{(570 - 500)}{100} = 0.7 \)  
   - From Z-tables: Area to the left of \( Z = 0.7 \) is 0.7580.  
   - Area to the right (more than 570) = \( 1 - 0.7580 = 0.2420 \).  
   - **Answer: 24.2%**

2. **Less than 515:**  
   - \( Z = \frac{(515 - 500)}{100} = 0.15 \)  
   - From Z-tables: Area to the left of \( Z = 0.15 \) is 0.5596.  
   - **Answer: 55.96%**

3. **Between 520 and 540:**  
   - For \( 520 \): \( Z = \frac{(520 - 500)}{100} = 0.2 \), Area = 0.5793.  
   - For \( 540 \): \( Z = \frac{(540 - 500)}{100} = 0.4 \), Area = 0.6554.  
   - Area between = \( 0.6554 - 0.5793 = 0.0761 \).  
   - **Answer: 7.61%**

4. **Convert to Z-scores:**  
   - More than 570: \( Z = 0.7 \)  
   - Less than 515: \( Z = 0.15 \)  
   - Between 520 and 540: \( Z = 0.2 \) to \( Z = 0.4 \).

---

### **Q12 (b) (ii): Light Bulbs and Failure Percentages**

#### **Question Analysis:**  
We are given a normal curve with a mean of 1200 hours and an SD of 120 hours. The question requires calculating the probabilities for light bulbs failing at specific percentages.

#### **Elaborated Answer:**  

1. **1% Fail:**  
   - 1% in the left tail corresponds to a Z-score of -2.33.  
   - Convert Z to X: \( X = \mu + Z\sigma = 1200 + (-2.33)(120) = 1200 - 279.6 = 920.4 \).  
   - **Answer: Light bulbs fail before 920.4 hours.**

2. **50% Fail:**  
   - 50% corresponds to the mean of the normal curve.  
   - **Answer: Light bulbs fail at 1200 hours.**

3. **95% Fail:**  
   - 95% corresponds to a Z-score of +1.645.  
   - Convert Z to X: \( X = \mu + Z\sigma = 1200 + (1.645)(120) = 1200 + 197.4 = 1397.4 \).  
   - **Answer: Light bulbs fail after 1397.4 hours.**

---

### **Q13 (a) (i): Goodness of Fit in Statistics**

#### **Question Analysis:**  
This asks about the consequences of a low goodness-of-fit score, indicating how well a model represents observed data.

#### **Elaborated Answer:**  
1. **Impact of Low Goodness of Fit:**  
   - Indicates that the model does not explain the variability in the data.  
   - Results in inaccurate predictions and unreliable insights.  
   - Suggests the need for better model selection, feature engineering, or additional data.

2. **Possible Reasons for Low Fit:**  
   - Missing important features.  
   - Poor model selection or tuning.  
   - Presence of outliers or noisy data.

---

### **Q13 (a) (ii): Regression Analysis**

#### **Question Analysis:**  
Given a dataset of employees (Age vs. Salary), predict the salary for age = 45 using linear regression.

#### **Dataset:**  
| Age | Salary |  
|-----|--------|  
| 54  | 67000  |  
| 42  | 43000  |  
| 49  | 55000  |  
| 57  | 71000  |  
| 35  | 25000  |  

#### **Elaborated Answer:**  

1. **Equation of a Line:**  
   - The regression equation is \( Y = a + bX \).  
   - \( b = \frac{\Sigma (X - \bar{X})(Y - \bar{Y})}{\Sigma (X - \bar{X})^2} \),  
   - \( a = \bar{Y} - b\bar{X} \).  

2. **Calculations:**  
   - \( \bar{X} = \frac{54 + 42 + 49 + 57 + 35}{5} = 47.4 \)  
   - \( \bar{Y} = \frac{67000 + 43000 + 55000 + 71000 + 25000}{5} = 52200 \)  
   - Compute \( b \) and \( a \):  

\[
b = \frac{(X - \bar{X})(Y - \bar{Y})}{(X - \bar{X})^2} = 1120 \quad \text{and} \quad a = \bar{Y} - b\bar{X}
\]

- Use regression tools to find exact predictions.

---

### **Q13 (b) (i): Define and Calculate Autocorrelation**

#### **Question Analysis:**  
This asks for the concept of autocorrelation and how to interpret negative correlation.

#### **Elaborated Answer:**  

1. **Definition of Autocorrelation:**  
   - Autocorrelation measures the correlation of a time series with a lagged version of itself.  
   - Indicates patterns or repetitions in sequential data.  

2. **Calculation:**  
   - Formula:  
     \[
     r_k = \frac{\Sigma_{t=1}^{n-k}(x_t - \bar{x})(x_{t+k} - \bar{x})}{\Sigma_{t=1}^{n}(x_t - \bar{x})^2}
     \]  

3. **Interpretation of Negative Correlation:**  
   - Negative autocorrelation implies that an increase in one observation leads to a decrease in the subsequent one.  

---

### **Q13 (b) (ii): Logistic Regression**

#### **Question Analysis:**  
This question explains the model's philosophy, predictions, and differences from linear regression.

#### **Elaborated Answer:**  

1. **Philosophy of Logistic Regression:**  
   - Used for binary classification tasks (e.g., Yes/No).  
   - Models the probability of a dependent variable belonging to a specific category using the sigmoid function.  

2. **Key Differences Between Logistic and Linear Regression:**  
   - Logistic regression predicts probabilities; linear regression predicts continuous values.  
   - Logistic regression outputs values between 0 and 1.  

---

### **Q14 (a): Dictionary in Python**

#### **Question Analysis:**  
Perform specific operations with Python dictionaries.

#### **Elaborated Answer:**  

1. **Initialize Two Dictionaries (D1 and D2):**  
   ```python
   D1 = {"key1": 1, "key2": 2}
   D2 = {"key3": 3, "key4": 4}
   ```

2. **Compare Dictionaries with Master Key List (M):**  
   ```python
   M = ["key1", "key2", "key3", "key4"]
   missing_keys = [key for key in M if key not in D1 or key not in D2]
   print(missing_keys)
   ```

3. **Find Keys in D1 but NOT in D2:**  
   ```python
   keys_in_D1_not_in_D2 = [key for key in D1 if key not in D2]
   print(keys_in_D1_not_in_D2)
   ```

4. **Merge D1 and D2:**  
   ```python
   D3 = {**D1, **D2}
   print(D3)
   ```
---
