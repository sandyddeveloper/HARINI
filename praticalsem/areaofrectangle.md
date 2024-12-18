

```java
interface Shape {
    double calculateArea();
}

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 5);
        System.out.println("Area of rectangle: " + rectangle.calculateArea());
    }
}
```

### Explanation:
1. **Interface `Shape`**: Declares the method `calculateArea()`.
2. **Class `Rectangle`**: Implements the `Shape` interface and provides the implementation of `calculateArea()` using the formula \( \text{length} \times \text{width} \).
3. **Main Class**: Creates a `Rectangle` object and calculates its area.
