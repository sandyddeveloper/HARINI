import matplotlib.pyplot as plt
import numpy as np

# Data for plotting
x = np.linspace(0, 10, 100)
y = np.sin(x)
z = np.cos(x)

# Line Plot
plt.figure(figsize=(8, 5))
plt.plot(x, y, label='sin(x)', color='blue', linestyle='--')
plt.plot(x, z, label='cos(x)', color='red')
plt.title('Line Plot')
plt.xlabel('x-axis')
plt.ylabel('y-axis')
plt.legend()
plt.grid(True)
plt.show()

# Scatter Plot
x_scatter = np.random.rand(50)
y_scatter = np.random.rand(50)
colors = np.random.rand(50)
sizes = 1000 * np.random.rand(50)

plt.figure(figsize=(8, 5))
plt.scatter(x_scatter, y_scatter, c=colors, s=sizes, alpha=0.5, cmap='viridis')
plt.title('Scatter Plot')
plt.xlabel('x-axis')
plt.ylabel('y-axis')
plt.colorbar()  # Show color scale
plt.show()

# Bar Plot
categories = ['A', 'B', 'C', 'D', 'E']
values = [5, 7, 3, 8, 4]

plt.figure(figsize=(8, 5))
plt.bar(categories, values, color='skyblue')
plt.title('Bar Plot')
plt.xlabel('Categories')
plt.ylabel('Values')
plt.show()

# Histogram
data = np.random.randn(1000)  # Generate random data

plt.figure(figsize=(8, 5))
plt.hist(data, bins=30, color='purple', edgecolor='black', alpha=0.7)
plt.title('Histogram')
plt.xlabel('Value')
plt.ylabel('Frequency')
plt.show()
---

b)
import matplotlib.pyplot as plt
import numpy as np

# Line Plot
x = np.linspace(0, 10, 100)
y = np.sin(x)
z = np.cos(x)
plt.plot(x, y, label='sin(x)')
plt.plot(x, z, label='cos(x)')
plt.title('Line Plot with Legend')
plt.legend()
plt.show()

# Scatter Plot
x_scatter = np.random.rand(50)
y_scatter = np.random.rand(50)
plt.scatter(x_scatter, y_scatter, label='Random Points')
plt.title('Scatter Plot with Legend')
plt.legend()
plt.show()

# Bar Plot
categories = ['A', 'B', 'C', 'D', 'E']
values = [5, 7, 3, 8, 4]
plt.bar(categories, values, label='Category Values')
plt.title('Bar Plot with Legend')
plt.legend()
plt.show()

# Histogram
data = np.random.randn(1000)
plt.hist(data, bins=20, label='Data Distribution')
plt.title('Histogram with Legend')
plt.legend()
plt.show()
