
## **AWTEvent Class**

1. **What is AWTEvent?**  
   - The **`AWTEvent`** class is the **base class** for all events in the **AWT (Abstract Window Toolkit)** in Java.  
   - Events are generated when users interact with components like **buttons, windows, or the keyboard**.

2. **Hierarchy**:  
   ```
   java.lang.Object  
       ↳ java.util.EventObject  
           ↳ java.awt.AWTEvent  
   ```

3. **Purpose**:  
   - To handle actions like **mouse clicks, key presses, or window closing**.  
   - Makes it easy to manage user interactions.

4. **Constructor**:  
   ```java
   AWTEvent(Event source, int id)
   ```
   - **source**: The object where the event occurs (e.g., a button).  
   - **id**: A number that tells what type of event occurred.

---

## **Main Event Classes in `java.awt.event`**

The **`java.awt.event`** package contains different event classes.  
These classes are used to handle **user actions** on GUI components like buttons, windows, text fields, etc.

### **Important Event Classes and When They Are Generated**

| **Event Class**       | **When It is Generated**                                |
|------------------------|-------------------------------------------------------|
| **ActionEvent**        | When a button, menu item, or text field is activated (e.g., button click). |
| **MouseEvent**         | When the mouse is clicked, moved, pressed, or dragged. |
| **KeyEvent**           | When a key on the keyboard is pressed, released, or typed. |
| **WindowEvent**        | When a window is opened, closed, minimized, or activated. |
| **ItemEvent**          | When a checkbox, list item, or choice item is selected/deselected. |
| **FocusEvent**         | When a component gains or loses focus.                |
| **AdjustmentEvent**    | When the value of a scrollbar changes.                |
| **TextEvent**          | When the text in a text field or text area changes.   |
| **ContainerEvent**     | When a component is added to or removed from a container. |
| **ComponentEvent**     | When a component is resized, moved, or made visible/invisible. |

---

## **Examples of Event Classes**

1. **ActionEvent (Button Click Example)**  
   ```java
   Button button = new Button("Click Me");
   button.addActionListener(e -> System.out.println("Button Clicked!"));
   ```

2. **MouseEvent (Mouse Click Example)**  
   ```java
   frame.addMouseListener(new MouseAdapter() {
       public void mouseClicked(MouseEvent e) {
           System.out.println("Mouse Clicked at: " + e.getX() + ", " + e.getY());
       }
   });
   ```

3. **KeyEvent (Key Press Example)**  
   ```java
   textField.addKeyListener(new KeyAdapter() {
       public void keyPressed(KeyEvent e) {
           System.out.println("Key Pressed: " + e.getKeyChar());
       }
   });
   ```

4. **WindowEvent (Window Closing Example)**  
   ```java
   frame.addWindowListener(new WindowAdapter() {
       public void windowClosing(WindowEvent e) {
           frame.dispose();
           System.out.println("Window Closed!");
       }
   });
   ```

---

## **Summary**

- **AWTEvent** is the base class for all AWT events.  
- Events are generated when users interact with components.  
- The **main event classes** include **ActionEvent**, **MouseEvent**, **KeyEvent**, and **WindowEvent**, each handling a specific type of user interaction.

---

### **Key Points to Remember**

| **Event Class**   | **Triggered When**                 |
|-------------------|------------------------------------|
| ActionEvent       | Button click or text field action  |
| MouseEvent        | Mouse click or movement           |
| KeyEvent          | Key press or release              |
| WindowEvent       | Window open/close actions         |
| ItemEvent         | Checkbox or list item selection   |

