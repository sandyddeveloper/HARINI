### **Thread Synchronization in Java: Detailed Notes**

---

#### **What is Thread Synchronization?**
- Ensures that two or more threads don’t interfere with each other while accessing shared resources.
- **Key Benefits:**
  - Prevents thread interference.
  - Ensures data consistency.

---

### **Key Concepts**

#### **1. Synchronized Method**
- Locks the entire method, allowing only one thread to access it at a time.
- **When to Use:** When the whole method needs to be protected.

**Example:**
```java
class Counter {
    private int count = 0;

    synchronized void increment() {
        count++;
        System.out.println("Count: " + count);
    }
}

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread t1 = new Thread(counter::increment);
        Thread t2 = new Thread(counter::increment);

        t1.start();
        t2.start();
    }
}
```
- **Output:** The `count` value updates one thread at a time.

---

#### **2. Synchronized Block**
- Locks only a part of the code instead of the whole method.
- **When to Use:** When only specific lines in the method need protection.

**Example:**
```java
class Counter {
    private int count = 0;

    void increment() {
        synchronized (this) { // Critical section
            count++;
            System.out.println("Count: " + count);
        }
    }
}
```

---

#### **3. Inter-thread Communication (Wait and Notify)**
- Allows threads to communicate with each other using `wait()`, `notify()`, and `notifyAll()`.
- **When to Use:** For scenarios like producer-consumer, where threads need to take turns.

**Example: Producer and Consumer**
```java
class Shop {
    private boolean hasItem = false;

    synchronized void produce() throws InterruptedException {
        while (hasItem) wait(); // Wait until the item is consumed
        System.out.println("Produced an item!");
        hasItem = true;
        notify(); // Notify the consumer
    }

    synchronized void consume() throws InterruptedException {
        while (!hasItem) wait(); // Wait until an item is produced
        System.out.println("Consumed the item!");
        hasItem = false;
        notify(); // Notify the producer
    }
}

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();

        Thread producer = new Thread(() -> {
            try {
                while (true) shop.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                while (true) shop.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producer.start();
        consumer.start();
    }
}
```
- **What Happens:** Producer creates an item, waits for the consumer to take it, and then continues.

---

#### **4. Locks (Advanced Synchronization)**
- `Lock` provides advanced control over thread synchronization.
- Methods like `lock()`, `unlock()`, and `tryLock()` make it flexible.
- **When to Use:** For scenarios where synchronized blocks are not sufficient.

**Example:**
```java
import java.util.concurrent.locks.ReentrantLock;

class Counter {
    private int count = 0;
    private final ReentrantLock lock = new ReentrantLock();

    void increment() {
        lock.lock(); // Acquire the lock
        try {
            count++;
            System.out.println("Count: " + count);
        } finally {
            lock.unlock(); // Release the lock
        }
    }
}
```
- **Why Use Lock?** Offers more features like interruptible locks and timed locks.

---

### **Common Issues in Thread Synchronization**

1. **Deadlock**
   - Occurs when two or more threads are waiting for each other to release resources.
   - Example: Thread A locks Resource 1 and waits for Resource 2, while Thread B locks Resource 2 and waits for Resource 1.

2. **Starvation**
   - A thread is perpetually denied access because high-priority threads dominate.

3. **Livelock**
   - Threads keep changing states in response to each other but make no progress.

---

### **Summary of Tools**

| Tool/Concept       | Purpose                                      | Use Case                            |
|--------------------|----------------------------------------------|-------------------------------------|
| Synchronized Method| Locks the whole method                      | Simple scenarios with full locking |
| Synchronized Block | Locks part of the method                    | More efficient locking             |
| Wait/Notify        | Thread communication using object monitor   | Producer-consumer problems         |
| Lock               | Advanced locking mechanisms                 | Complex synchronization needs      |

---

### **Quick Tips**
- **Keep it simple:** Use `synchronized` for basic synchronization.
- **Use `wait()` and `notify()` carefully:** Always in synchronized blocks.
- **Always release locks:** Use `finally` blocks to avoid deadlocks.
- **Understand the problem:** Use the right tool for the situation.
