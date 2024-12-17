
### i) **Methods to Create a Thread in Java**

There are **two easy ways** to create threads in Java:

1. **By Extending the `Thread` Class**  
2. **By Implementing the `Runnable` Interface**

---

#### **1. Extending the `Thread` Class**

- Create a class that **extends the `Thread` class**.
- Write your logic inside the `run()` method.
- Start the thread using the `start()` method.

**Example:**

```java
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread(); // Create a thread object
        t1.start(); // Start the thread
    }
}
```

---

#### **2. Implementing the `Runnable` Interface**

- Create a class that **implements the `Runnable` interface**.
- Write your logic inside the `run()` method.
- Create a `Thread` object and pass your class as a parameter to it.

**Example:**

```java
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        MyRunnable obj = new MyRunnable(); // Create a Runnable object
        Thread t1 = new Thread(obj); // Pass it to the Thread class
        t1.start(); // Start the thread
    }
}
```

---

### ii) **Thread Synchronization in Java**

**Thread synchronization** ensures that only **one thread** can access a **shared resource** at a time.

To do this, we use the **`synchronized` keyword**.

---

#### **Example: Synchronized Method**

Here’s an example where two threads try to print numbers, but the method is **synchronized** to avoid conflicts.

```java
class Table {
    // Synchronized method
    synchronized void printTable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(500); // Pause for 500ms
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class MyThread1 extends Thread {
    Table t;

    MyThread1(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }
}

class MyThread2 extends Thread {
    Table t;

    MyThread2(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(10);
    }
}

public class TestSynchronization {
    public static void main(String[] args) {
        Table obj = new Table(); // Shared resource (Table)
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);

        t1.start(); // Start first thread
        t2.start(); // Start second thread
    }
}
```

