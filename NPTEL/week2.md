Here's a simplified version of the key points for your exam:

---

### **Function Behaviour Structure (FBS) Model:**
The FBS model is a framework for designing software systems. It consists of three key elements:

1. **Function (F):**  
   What the system is supposed to do.  
   Example for a **mood-based music player**:  
   - Detect user mood.
   - Create playlists.
   - Secure authentication.

2. **Behaviour (B):**  
   How the system achieves the function through interactions between components.  
   Example:  
   - Capture mood through a camera.
   - Generate playlists based on mood and preferences.

3. **Structure (S):**  
   The physical or logical components that perform the behavior.  
   Example:  
   - Camera for mood detection.
   - Algorithm for playlist generation.
   - Secure login/authentication module.

---

### **Integration of Function, Behaviour, and Structure (FBS):**
- To create a coherent solution, **F**, **B**, and **S** must be integrated. Without integration, the design may be fragmented and fail to meet the requirements.
  
- **Benefits of integration:**
  - Provides a unified view of the system.
  - Ensures all requirements are met.
  - Helps communicate with stakeholders.
  - Prevents design issues during development.

---

### **Steps to Design Using FBS:**
1. **Start with a known solution**:  
   Identify structures like mood detection cameras or recommendation algorithms.
  
2. **Think in terms of the user and system**:  
   Consider how components interact to achieve the desired behaviors.  
   Example: Camera detects mood → system fetches mood-specific songs.

3. **Map Structures and Behaviors**:  
   Identify how structures interact to create behaviors that fulfill the function.  
   Example: Mood detection (structure) triggers playlist generation (behavior), fulfilling the goal of mood-based music playing (function).

---

### **FBS Graph**:
- **FBS Graph** is a way to visualize the design by connecting functions, behaviors, and structures like a graph.
- There are different types of FBS graphs:
  - **FBS**: Functions lead to behaviors, which are realized by structures.
  - **BSF**: Behaviors map to structures, which then satisfy the function.

### **Checklist for Evaluating an FBS Graph:**
- Check if the graph captures all required functions.
- Ensure the behavior and structure mappings are correct.
- Evaluate if all elements work together to satisfy the requirements.

---

This model helps in designing complex systems like a **mood-based music player** by ensuring all aspects (mood detection, music recommendations, user preferences) work together smoothly.

---

Good luck with your exam! Let me know if you need more clarifications.
