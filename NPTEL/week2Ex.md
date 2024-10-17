Here are some easy examples of the **Function Behaviour Structure (FBS)** model with clear explanations:

---

### **Example 1: Automatic Mood-Based Music Player**

**Goal:** To create a music player that detects the user’s mood and plays songs accordingly.

#### 1. **Function (What the system does):**
   - Detect the user's mood.
   - Play music based on the detected mood.
   - Remember the user's preferences for future recommendations.
   - Provide secure user authentication.

#### 2. **Behaviour (How it works):**
   - The camera captures the user's facial expression and analyzes their mood (e.g., happy, sad).
   - Based on the mood, a playlist is automatically generated.
   - The system saves user preferences and suggests songs they usually listen to when in that mood.
   - The user logs in securely to access their saved preferences.

#### 3. **Structure (Components that do the work):**
   - **Camera** for mood detection.
   - **Emotion recognition algorithm** to analyze mood.
   - **Music recommendation system** to generate playlists.
   - **Authentication module** for login.

#### Integration:
- The **camera (structure)** captures the user's face, and the **emotion recognition algorithm (structure)** detects the mood (**behaviour**). The **music recommendation system (structure)** then generates a playlist to match the mood (**behaviour**), fulfilling the **function** of mood-based music playback.

---

### **Example 2: Smart Thermostat**

**Goal:** A thermostat that automatically adjusts room temperature based on user preferences and current conditions.

#### 1. **Function (What it does):**
   - Maintain the room at a comfortable temperature.
   - Detect if the room is occupied or empty.
   - Save user preferences for specific temperature settings.
   
#### 2. **Behaviour (How it works):**
   - The thermostat checks the room temperature and compares it with the user’s preferred temperature.
   - If the room is too cold, it turns on the heater; if too hot, it activates the air conditioner.
   - It senses if people are in the room and adjusts settings based on activity levels.

#### 3. **Structure (Components that do the work):**
   - **Temperature sensor** to detect the room’s current temperature.
   - **Heating and cooling system** to adjust the temperature.
   - **Occupancy sensor** to detect if someone is in the room.
   - **Preferences database** to save user settings.

#### Integration:
- The **temperature sensor (structure)** detects the room temperature, triggering the **heating/cooling system (structure)** to adjust it to the preferred setting (**behaviour**). This achieves the **function** of keeping the room at a comfortable temperature.

---

### **Example 3: Fitness Tracker**

**Goal:** A wearable fitness tracker that monitors activity and provides health insights.

#### 1. **Function (What it does):**
   - Monitor physical activities (steps, heart rate).
   - Provide health recommendations based on data.
   - Track user fitness progress over time.

#### 2. **Behaviour (How it works):**
   - The fitness tracker continuously records the user’s steps and heart rate.
   - It processes this data and offers suggestions, such as increasing activity or taking a break.
   - It stores the data and shows the user their progress in graphs or charts.

#### 3. **Structure (Components that do the work):**
   - **Step counter** to track movements.
   - **Heart rate monitor** to measure the user's pulse.
   - **Data processing unit** to analyze activity.
   - **Display or app** to show results and suggestions.

#### Integration:
- The **step counter (structure)** and **heart rate monitor (structure)** collect activity data. This data is processed by the **data processing unit (structure)** to provide health insights (**behaviour**), achieving the **function** of tracking fitness.

---

### Summary of Examples:
- **Function** is what the system is supposed to do.
- **Behaviour** is how components interact to achieve that function.
- **Structure** is the physical or logical parts that perform the behaviour.

By combining **F (function)**, **B (behaviour)**, and **S (structure)**, you create a coherent system where every component interacts to fulfill the main purpose.

---
