

---

### Question 6
**a. Explain Describing data with table using examples.**

Describing data using tables is a way to organize and summarize information clearly. Tables typically contain rows and columns that display data points, and they’re used for representing both categorical (non-numeric) and numerical data. This allows quick identification of patterns, trends, and comparisons between different data points. In Python, `pandas` is widely used for creating and handling data in tables through a `DataFrame`.

For example:

```python
import pandas as pd

# Sample data
data = {
    'Name': ['Alice', 'Bob', 'Charlie', 'David'],
    'Age': [24, 27, 22, 32],
    'Score': [88, 92, 95, 70]
}

# Creating a DataFrame
df = pd.DataFrame(data)
print(df)
```

This code will display the data in a structured table format, making it easy to analyze each individual’s age and score at a glance.

---

**b. Describe graph for qualitative and quantitative data with diagrams.**

Graphs provide visual representations of data. 

1. **Qualitative Data (Categorical Data):** This includes categories or groups, such as "Types of Fruits" or "Regions". Commonly used graphs include:
   - **Bar Chart**: Used to show comparisons between categories.
   - **Pie Chart**: Shows proportions within a whole.

2. **Quantitative Data (Numerical Data):** This data is in numerical form, like age, income, or temperature. Common visualizations include:
   - **Histogram**: Used to display frequency distributions of a single variable.
   - **Line Plot**: Shows trends over time.
   - **Scatter Plot**: Displays relationships between two variables.

**Example:**

```python
import matplotlib.pyplot as plt
import numpy as np

# Qualitative Data: Bar Chart
categories = ['Category A', 'Category B', 'Category C']
values = [23, 17, 35]
plt.bar(categories, values)
plt.title('Bar Chart for Qualitative Data')
plt.xlabel('Categories')
plt.ylabel('Values')
plt.show()

# Quantitative Data: Histogram
data = np.random.normal(50, 10, 1000)
plt.hist(data, bins=30, alpha=0.5)
plt.title('Histogram for Quantitative Data')
plt.xlabel('Value')
plt.ylabel('Frequency')
plt.show()
```

These graphs help interpret data by providing visual insights that are often easier to understand than raw numbers.

---

### Question 7
**a. Explain Normal Distributions and Standard Scores.**

A **Normal Distribution** is a bell-shaped, symmetrical distribution where most data points are concentrated around the mean. It’s defined by two parameters: the mean (center of the distribution) and the standard deviation (spread of the distribution).

**Standard Scores** (Z-scores) represent how many standard deviations a data point is from the mean. A Z-score allows us to standardize different distributions, making comparisons possible even if the scales are different.

**Example of calculating Z-scores:**

```python
import numpy as np

# Sample data
data = [60, 70, 80, 90, 100]
mean = np.mean(data)
std_dev = np.std(data)

# Calculate Z-scores
z_scores = [(x - mean) / std_dev for x in data]
print("Z-scores:", z_scores)
```

Here, each Z-score tells us the position of a value relative to the mean. For example, a Z-score of 1 means the value is one standard deviation above the mean.

---

**b. Compare the various visualization charts like line plots, scatter plots, and histograms using Matplotlib.**

Different types of charts serve unique purposes in data visualization:

1. **Line Plot**: Useful for visualizing trends over time. For example, showing temperature changes over a week.
2. **Scatter Plot**: Helps identify the relationship between two variables, such as height vs. weight.
3. **Histogram**: Used for showing the distribution of a single variable, such as the age distribution of a population.

**Example Code:**

```python
import matplotlib.pyplot as plt
import numpy as np

# Line Plot
x = np.arange(1, 11)
y = x ** 2
plt.plot(x, y, label='Line Plot')
plt.legend()
plt.show()

# Scatter Plot
x = np.random.rand(50)
y = np.random.rand(50)
plt.scatter(x, y, label='Scatter Plot')
plt.legend()
plt.show()

# Histogram
data = np.random.normal(0, 1, 1000)
plt.hist(data, bins=30, alpha=0.5, label='Histogram')
plt.legend()
plt.show()
```

Each chart provides different insights, and choosing the correct chart depends on the data and the question you’re trying to answer.

---

### Question 8
**a. Explain three-dimensional plotting used in Matplotlib in detail.**

3D plotting allows you to visualize data across three axes (X, Y, and Z). It’s commonly used for more complex data where relationships between three variables are analyzed, such as geographical data (latitude, longitude, and elevation).

In `matplotlib`, the `mplot3d` toolkit supports 3D plotting. Common 3D plot types include scatter plots, surface plots, and wireframes.

**Example:**

```python
import matplotlib.pyplot as plt
from mpl_toolkits.mplot3d import Axes3D
import numpy as np

fig = plt.figure()
ax = fig.add_subplot(111, projection='3d')

x = np.linspace(-5, 5, 100)
y = np.linspace(-5, 5, 100)
x, y = np.meshgrid(x, y)
z = np.sin(np.sqrt(x**2 + y**2))

ax.plot_surface(x, y, z, cmap='viridis')
plt.show()
```

This code creates a 3D surface plot, which can be rotated and viewed from different angles, providing better insight into data structures.

---

**b. Write the Python coding for importing Matplotlib for various Data visualization techniques.**

To visualize data using `matplotlib`, you need to import the library. Here’s a basic setup and example for creating a simple line plot:

```python
import matplotlib.pyplot as plt
import numpy as np

# Simple Line Plot
x = np.linspace(0, 10, 100)
y = np.sin(x)
plt.plot(x, y)
plt.title('Simple Line Plot')
plt.xlabel('X-axis')
plt.ylabel('Y-axis')
plt.show()
```

---

### Question 9
**a. How can you differentiate label, legend, annotations, markers in Pictorial representation with coding?**

- **Label**: Used to name the X and Y axes for clarity.
- **Legend**: Describes the plot elements (useful when multiple lines or points are present).
- **Annotation**: Adds notes or descriptions for specific data points.
- **Marker**: Changes the appearance of data points in plots.

**Example Code:**

```python
import matplotlib.pyplot as plt

x = [1, 2, 3, 4]
y = [10, 20, 25, 30]

plt.plot(x, y, label='Line Plot', marker='o')
plt.xlabel('X-axis Label')
plt.ylabel('Y-axis Label')
plt.legend()
plt.annotate('Peak Point', xy=(4, 30), xytext=(3, 25),
             arrowprops=dict(facecolor='black', shrink=0.05))
plt.show()
```

In this plot:
- **Label**: X and Y labels are added to describe the axes.
- **Legend**: Describes the line plot.
- **Annotation**: Points out the peak value with an arrow.
- **Marker**: Each point on the line has a circular marker.

---

**b. Explain in detail about the base map and Geographical data with examples.**

**Base Maps** provide geographical context and are used in visualizing location-based data. Using a base map with geographical data, like population density or climate data, gives meaningful insights.

Using `Basemap` (a part of `matplotlib`), we can add layers to maps, such as coastlines and country borders.

**Example:**

```python
from mpl_toolkits.basemap import Basemap
import matplotlib.pyplot as plt

# Create a map
m = Basemap(projection='mill', llcrnrlat=-60, urcrnrlat=90, llcrnrlon=-180, urcrnrlon=180)
m.drawcoastlines()
m.drawcountries()
plt.title('World Map with Basemap')
plt.show()
```

This code creates a simple world map, showing coastlines and country borders.

---

