### **Thread Synchronization in Java: Quick Notes**

---

#### **Why Synchronization?**
When multiple threads access the same resource, synchronization ensures:
1. No interference between threads.
2. Consistent results.

---

### **Key Concepts with Easy Examples**

#### **1. Synchronized Method**
- **What?** Only one thread can execute the method at a time.
- **Example:**
  ```java
  class Counter {
      private int count = 0;

      synchronized void increment() {
          count++;
          System.out.println("Count: " + count);
      }
  }
  ```
- **Usage:** Ensures only one thread updates `count` at a time.

---

#### **2. Synchronized Block**
- **What?** Locks only a small part of the method instead of the entire method.
- **Example:**
  ```java
  class Counter {
      private int count = 0;

      void increment() {
          synchronized (this) {
              count++;
              System.out.println("Count: " + count);
          }
      }
  }
  ```
- **Usage:** Useful if only part of the code needs synchronization.

---

#### **3. Inter-thread Communication (Wait/Notify)**
- **What?** Threads can wait for signals from other threads.
- **Example (Producer/Consumer):**
  ```java
  class Shop {
      private boolean hasItem = false;

      synchronized void produce() throws InterruptedException {
          while (hasItem) wait();
          System.out.println("Produced!");
          hasItem = true;
          notify();
      }

      synchronized void consume() throws InterruptedException {
          while (!hasItem) wait();
          System.out.println("Consumed!");
          hasItem = false;
          notify();
      }
  }
  ```
- **Usage:** Producer waits for the consumer to consume and vice versa.

---

#### **4. Lock (Alternative to Synchronized)**
- **What?** Offers advanced control for thread synchronization.
- **Example:**
  ```java
  import java.util.concurrent.locks.ReentrantLock;

  class Counter {
      private int count = 0;
      private final ReentrantLock lock = new ReentrantLock();

      void increment() {
          lock.lock();
          try {
              count++;
              System.out.println("Count: " + count);
          } finally {
              lock.unlock();
          }
      }
  }
  ```
- **Usage:** More flexible than `synchronized` blocks.

---

### **Key Terms to Remember**
1. **Deadlock:** Threads wait forever for each other.
2. **Starvation:** One thread never gets a chance to execute.
3. **Livelock:** Threads keep responding to each other without making progress.

---

### **Quick Tips**
- Use `synchronized` for simple cases.
- Use `wait()` and `notify()` for communication between threads.
- Use `Lock` for more complex synchronization needs.
