In Java, **packages** are used to group related classes and interfaces, providing a way to organize code and avoid naming conflicts. A package in Java is essentially a directory structure that contains Java classes, interfaces, sub-packages, and other packages.

### **Why Use Packages?**
1. **Code Organization:** Helps organize classes and interfaces into namespaces.
2. **Avoid Name Conflicts:** Prevents naming conflicts between classes.
3. **Access Control:** Provides access protection using public, protected, and private modifiers.
4. **Reusability:** Makes it easier to reuse classes and interfaces across projects.
5. **Encapsulation:** Packages can help to encapsulate code.

---

### **Types of Packages**
1. **Built-in Packages:** Provided by Java for common functionalities.
2. **User-defined Packages:** Created by developers to organize their project-specific code.

---

### **Examples**

#### **Built-in Packages**
Some commonly used Java built-in packages include:
- `java.lang`: Contains classes like `String`, `Math`, and `Object`.
- `java.util`: Provides utilities like `ArrayList`, `HashMap`, and `Collections`.
- `java.io`: Provides input and output functionalities.
- `java.sql`: Supports database connectivity and operations.
- `java.net`: Supports networking capabilities.

#### **User-defined Package**
You can create your own package as follows:

1. **Create a Package:**
   ```java
   package mypackage;

   public class MyClass {
       public void displayMessage() {
           System.out.println("Hello from MyClass in mypackage!");
       }
   }
   ```

2. **Save the File:** Save the file as `MyClass.java` inside a folder named `mypackage`.

3. **Compile the Class:**
   ```bash
   javac -d . MyClass.java
   ```
   This command creates the package structure and places the class file in the `mypackage` directory.

4. **Use the Package:**
   ```java
   import mypackage.MyClass;

   public class Main {
       public static void main(String[] args) {
           MyClass obj = new MyClass();
           obj.displayMessage();
       }
   }
   ```

5. **Run the Program:**
   ```bash
   javac Main.java
   java Main
   ```

---

### **Default Package**
If no package is specified, the class belongs to the **default package**. However, classes in the default package cannot be imported by classes in other packages, which is why defining packages explicitly is recommended.

---

### **Access Modifiers with Packages**
- **Public:** Accessible from any other package.
- **Protected:** Accessible within the same package and by subclasses in other packages.
- **Default (no modifier):** Accessible only within the same package.
- **Private:** Not accessible outside the class.

---

### **Key Points**
1. Use the `import` statement to include other packages.
2. Java automatically imports `java.lang`.
3. The `package` keyword must be the first line in the source file.

Packages help in structuring large projects effectively, enabling modularity and better code maintenance.
