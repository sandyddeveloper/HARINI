
**Question:**  
For the given data set, calculate the following statistical measures:  

1. **Mean**  
2. **Median**  
3. **Mode**  
4. **Variance**  
5. **Standard Deviation**  
6. **Skewness**

**Marks Range and Number of Students:**

| Marks Range | No. of Students |
|-------------|-----------------|
| 0-10        | 10              |
| 10-20       | 40              |
| 20-30       | 20              |
| 30-40       | 0               |
| 40-50       | 10              |
| 50-60       | 40              |
| 60-70       | 16              |
| 70-80       | 14              |

# ANSWER

1. **Calculate the Mean**  
   The mean formula is:  
   \[
   \text{Mean} = \frac{\sum f \cdot x}{\sum f}
   \]

2. **Find the Median**  
   The median formula is:  
   \[
   \text{Median} = L + \left(\frac{\frac{N}{2} - CF}{f_m}\right) \cdot h
   \]  
   Where:
   - \(L\): Lower boundary of the median class  
   - \(N\): Total frequency (\(\sum f\))  
   - \(CF\): Cumulative frequency before the median class  
   - \(f_m\): Frequency of the median class  
   - \(h\): Class width  

3. **Calculate the Mode**  
   The mode formula is:  
   \[
   \text{Mode} = L + \left(\frac{f_m - f_{1}}{2f_m - f_{1} - f_{2}}\right) \cdot h
   \]  
   Where:
   - \(f_m\): Frequency of the modal class  
   - \(f_1\): Frequency of the class before the modal class  
   - \(f_2\): Frequency of the class after the modal class  

4. **Variance and Standard Deviation**  
   Variance formula:  
   \[
   \text{Variance} = \frac{\sum f \cdot (x - \text{Mean})^2}{\sum f}
   \]  
   Standard deviation (\(\sigma\)):  
   \[
   \sigma = \sqrt{\text{Variance}}
   \]

5. **Skewness**  
   Skewness formula:  
   \[
   \text{Skewness} = \frac{\text{Mean} - \text{Mode}}{\sigma}
   \]

Now, let’s compute each in table format:

Here are the computed results for the given data:

### Table of Calculations
| Marks Range | Midpoint (x) | Frequency (f) | Cumulative Frequency | \( f \cdot x \) |
|-------------|--------------|---------------|-----------------------|-----------------|
| 0-10        | 5            | 10            | 10                    | 50              |
| 10-20       | 15           | 40            | 50                    | 600             |
| 20-30       | 25           | 20            | 70                    | 500             |
| 30-40       | 35           | 0             | 70                    | 0               |
| 40-50       | 45           | 10            | 80                    | 450             |
| 50-60       | 55           | 40            | 120                   | 2200            |
| 60-70       | 65           | 16            | 136                   | 1040            |
| 70-80       | 75           | 14            | 150                   | 1050            |

---

### Summary of Results
| Metric               | Value   |
|-----------------------|---------|
| Total Frequency (Σf) | 150     |
| Mean                 | 39.27   |
| Median               | 45.00   |
| Mode                 | 16.00   |
| Variance             | 520.46  |
| Standard Deviation    | 22.81   |
| Skewness             | 1.02    |
