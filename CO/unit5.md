# Pipelining
## What is Pipelining?
Pipelining is an arrangement of the CPU’s hardware components to enhance the CPU’s overall performance. In a pipelined processor, procedures called "stages" are executed in parallel, allowing more than one instruction to be processed simultaneously.

### Example of Pipelining Efficiency

- **Without Pipelining:**
  - Total time: 9 minutes for 3 instructions
  - Average time per instruction: 9/3 = **3 minutes**

  ```plaintext
  I F S | | | | | |
  | | | I F S | | |
  | | | | | | I F S (9 minutes)
  ```

- **With Pipelining:**
  - Total time: 5 minutes for 3 instructions
  - Average time per instruction: 5/3 = **1.67 minutes**

  ```plaintext
  I F S | |
  | I F S |
  | | I F S (5 minutes)
  ```

Thus, pipelining increases the system’s efficiency.

---

## Design of a Basic Pipeline
In a pipelined processor, the pipeline consists of two ends:
- **Input End**: Where instructions enter the pipeline.
- **Output End**: Where instructions exit after processing.

### Key Features
- **Stages/Segments:** Each stage performs a specific operation.
- **Interface Registers:** Hold intermediate outputs between stages (also called latch or buffer).
- **Common Clock:** All pipeline stages operate in sync with a clock.

### Execution in a Pipelined Processor
#### Non-Overlapped Execution (Without Pipelining)
```plaintext
Stage / Cycle  | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8
S1             | I1 |   |   |   | I2 |   |   |   
S2             |    | I1 |   |   |    | I2 |   |   
S3             |    |    | I1 |   |   |    | I2 |   
S4             |    |    |    | I1 |   |   |    | I2
Total time: 8 Cycles
```

#### Overlapped Execution (With Pipelining)
```plaintext
Stage / Cycle  | 1 | 2 | 3 | 4 | 5
S1             | I1 | I2 |   |   |   
S2             |    | I1 | I2 |   |   
S3             |    |    | I1 | I2 |   
S4             |    |    |    | I1 | I2
Total time: 5 Cycles
```

---

## Pipeline Stages
A RISC processor has a 5-stage instruction pipeline to execute instructions. These stages include:

1. **Instruction Fetch (IF):** The CPU fetches the instruction from memory.
2. **Instruction Decode (ID):** The instruction is decoded, and the register file is accessed.
3. **Instruction Execute (EX):** Arithmetic and logic operations are performed.
4. **Memory Access (MEM):** Memory operands are read or written.
5. **Write Back (WB):** The result is written back to the register.

---

## Performance of a Pipelined Processor

### Execution Time
For a pipeline with `k` segments and clock cycle time `Tp`, the execution time for `n` tasks is:
- **Pipelined Processor:**
  ```plaintext
  ET_pipeline = (k + n - 1) * Tp
  ```
- **Non-Pipelined Processor:**
  ```plaintext
  ET_non_pipeline = n * k * Tp
  ```

### Speedup
The speedup `S` is given by:
```plaintext
S = ET_non_pipeline / ET_pipeline
  = [n * k * Tp] / [(k + n - 1) * Tp]
  = [n * k] / [k + n - 1]
```
When `n >> k`, the speedup simplifies to:
```plaintext
S = k
```

### Efficiency
Efficiency is given by:
```plaintext
Efficiency = Speedup / Maximum Speedup
Efficiency = S / k
```

### Throughput
Throughput measures the number of instructions completed per unit time:
```plaintext
Throughput = n / [(k + n - 1) * Tp]
```

### Latency
Latency measures the time taken for a single instruction to complete execution:
```plaintext
Latency = Execution Time / Number of Instructions
```

---

## Advantages of Pipelining
1. **Increased Throughput:** Enables concurrent execution of multiple instructions, improving efficiency.
2. **Improved CPU Utilization:** Keeps all parts of the CPU busy.
3. **Higher Instruction Throughput:** Processes more instructions in a given time frame.
4. **Better Performance for Repeated Tasks:** Effective for repetitive instructions.
5. **Scalability:** Can be implemented in both simple and complex processors.

## Disadvantages of Pipelining
1. **Pipeline Hazards:**
   - **Data Hazards:** Dependencies between instructions.
   - **Control Hazards:** Branching issues.
   - **Structural Hazards:** Resource conflicts.
2. **Increased Complexity:** Managing stages and risks adds design complexity.
3. **Stall Cycles:** Hazards can introduce idle times, reducing efficiency.
4. **Instruction Latency:** Execution delay for individual instructions remains unaffected.
5. **Hardware Overhead:** Additional registers and control logic increase costs and complexity.

---

## Performance Metrics
1. **Throughput:** Measures overall processing speed and depends on:
   - Pipeline length.
   - Clock frequency.
   - Efficiency of instruction execution.
   - Pipeline hazards or stalls.
2. **Latency:** Measures delay for a single instruction and is influenced by:
   - Pipeline length and depth.
   - Clock cycle time.
   - Instruction dependencies.
   - Pipeline hazards.

---


