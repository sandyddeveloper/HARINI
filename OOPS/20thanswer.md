
## **Introduction to Frame Windows in Java**

- In Java, a **`Frame`** is a top-level window provided by the **Abstract Window Toolkit (AWT)**.  
- It is used to create a graphical window for applications.  
- The `Frame` class is part of the `java.awt` package and is commonly used to build **Graphical User Interfaces (GUI)**.  

---

## **Methods of Frame Windows**

The following methods are commonly used to manipulate a **Frame**:

### 1. **`setSize()`**  
**Purpose**: Sets the **width** and **height** of the frame.  
**Signature**:  
```java
public void setSize(int width, int height)
```
- **Parameters**:  
  - `width`: The desired width of the frame.  
  - `height`: The desired height of the frame.  

**Example**:  
```java
frame.setSize(400, 300); // Set the size of the frame to 400x300 pixels
```

---

### 2. **`getSize()`**  
**Purpose**: Retrieves the current **size** (width and height) of the frame as a **Dimension object**.  
**Signature**:  
```java
public Dimension getSize()
```
- **Return Type**: `Dimension` (contains width and height).  

**Example**:  
```java
Dimension size = frame.getSize();  
System.out.println("Width: " + size.width + ", Height: " + size.height);
```

---

### 3. **`setVisible()`**  
**Purpose**: Controls whether the frame is **visible** or not on the screen.  
**Signature**:  
```java
public void setVisible(boolean visible)
```
- **Parameter**:  
  - `true`: Makes the frame visible.  
  - `false`: Hides the frame.  

**Example**:  
```java
frame.setVisible(true); // Make the frame visible
```

---

### 4. **`setTitle()`**  
**Purpose**: Sets the **title** of the frame window, which is displayed on the title bar.  
**Signature**:  
```java
public void setTitle(String title)
```
- **Parameter**:  
  - `title`: The text to be displayed in the title bar.  

**Example**:  
```java
frame.setTitle("My Application Window");
```

---

## **Working Example**

Here is a complete example that demonstrates the use of these methods:

```java
import java.awt.*;
import java.awt.event.*;

public class FrameExample {
    public static void main(String[] args) {
        // Create a Frame object
        Frame frame = new Frame();

        // Set the title of the frame
        frame.setTitle("My First Frame");

        // Set the size of the frame
        frame.setSize(400, 300);

        // Make the frame visible
        frame.setVisible(true);

        // Print the current size of the frame
        Dimension size = frame.getSize();
        System.out.println("Width: " + size.width + ", Height: " + size.height);

        // Add a window listener to close the window when the 'X' is clicked
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose(); // Close the frame
                System.out.println("Window Closed");
            }
        });
    }
}
```

---

## **Output**

1. A frame window will appear with:  
   - **Size**: 400x300 pixels.  
   - **Title**: "My First Frame".  

2. When the program runs, the console will display:  
   ```
   Width: 400, Height: 300
   ```

3. If you click the "X" button on the window, the program will close and display:  
   ```
   Window Closed
   ```

---

## **Explanation of the Example**

- **`setTitle("My First Frame")`**: Sets the title of the frame window.  
- **`setSize(400, 300)`**: Sets the frame's dimensions to 400 pixels wide and 300 pixels tall.  
- **`setVisible(true)`**: Makes the frame appear on the screen.  
- **`getSize()`**: Retrieves the current size of the frame and prints it to the console.  

The **`WindowListener`** ensures the program ends cleanly when the window is closed.

---

## **Summary**

| **Method**      | **Purpose**                       | **Signature**                                 |
|------------------|-----------------------------------|----------------------------------------------|
| `setSize()`     | Sets the size of the frame.       | `public void setSize(int width, int height)` |
| `getSize()`     | Gets the current size of the frame. | `public Dimension getSize()`                |
| `setVisible()`  | Makes the frame visible or hidden.| `public void setVisible(boolean visible)`    |
| `setTitle()`    | Sets the title of the frame.      | `public void setTitle(String title)`         |

