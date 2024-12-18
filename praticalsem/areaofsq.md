

```java
abstract class Shape {
    abstract double calculateArea();
}

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    double calculateArea() {
        return side * side;
    }
}

public class Main {
    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.println("Area of square: " + square.calculateArea());
    }
}
```

### Explanation:
1. `Shape` is an abstract class with an abstract method `calculateArea()`.
2. `Square` extends `Shape` and provides the implementation of the `calculateArea()` method.
3. In `Main`, we create an instance of `Square` and print the area.
