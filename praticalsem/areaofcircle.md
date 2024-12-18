

```java
abstract class Shape {
    abstract double calculateArea();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(7);
        System.out.println("Area of circle: " + circle.calculateArea());
    }
}
```

### Explanation:
1. `Shape` is the abstract base class with an abstract method `calculateArea()`.
2. `Circle` is a concrete subclass that implements the `calculateArea()` method using the formula \( \pi \times r^2 \).
3. The `Main` class creates a `Circle` object and prints the calculated area.
