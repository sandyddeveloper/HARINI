# interface example:

### Example: ** Interface**

```java
interface Shape {
    double calculateArea();
}

class Rectangle implements Shape {
    private double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
}

class Circle implements Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 3);
        Shape circle = new Circle(4);

        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Circle Area: " + circle.calculateArea());
    }
}
```

### Output:
```
Rectangle Area: 15.0
Circle Area: 50.26548245743669
```

### Key Simplifications:
1. Removed the `calculatePerimeter()` method to focus only on area.
2. Constructors and methods are kept concise.
3. Minimal code for a clear demonstration.
