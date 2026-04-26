<!---------------------------------------------------------------------------->
<!--  HERO — Full-width waving banner                                        -->
<!---------------------------------------------------------------------------->

<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0d0221,20:1a0a4e,55:3b1fa8,85:6d3de8,100:a78bfa&height=280&section=header&text=WAT&fontSize=90&fontColor=ede9fe&fontAlignY=38&fontStyle=bold&desc=Word%20Association%20Test%20%E2%80%94%20A%20digital%20platform%20for%20psychological%20assessment&descAlignY=60&descSize=17&descColor=c4b5fd&animation=fadeIn" width="100%"/>

</div>

<!---------------------------------------------------------------------------->
<!--  BADGES                                                                 -->
<!---------------------------------------------------------------------------->

<div align="center">

<br/>

[![Platform](https://img.shields.io/badge/Platform-Android%208.1%2B-1a0a4e?style=for-the-badge&logo=android&logoColor=a78bfa&labelColor=0d0221&color=1a0a4e)](https://developer.android.com)&nbsp;
[![Language](https://img.shields.io/badge/Language-Java-1a0a4e?style=for-the-badge&logo=openjdk&logoColor=fb923c&labelColor=0d0221&color=1a0a4e)](https://www.java.com)&nbsp;
[![UI](https://img.shields.io/badge/UI-ViewFlipper%20%2B%20ConstraintLayout-1a0a4e?style=for-the-badge&logo=android&logoColor=c4b5fd&labelColor=0d0221&color=1a0a4e)](https://developer.android.com/reference/android/widget/ViewFlipper)&nbsp;
[![Data Structure](https://img.shields.io/badge/Data%20Structure-Linked%20Queue-1a0a4e?style=for-the-badge&logo=databricks&logoColor=a78bfa&labelColor=0d0221&color=1a0a4e)](#)&nbsp;
[![Stars](https://img.shields.io/github/stars/kumarpiyushraj/WAT-App?style=for-the-badge&logo=github&color=fbbf24&labelColor=0d1117&label=Stars)](https://github.com/kumarpiyushraj/WAT-App)

<br/><br/>

*Capture first thoughts &nbsp;·&nbsp; Reveal deeper patterns &nbsp;·&nbsp; Assess with confidence*

<br/><br/>

</div>

<!---------------------------------------------------------------------------->
<!--  STATS STRIP                                                            -->
<!---------------------------------------------------------------------------->

<img src="https://capsule-render.vercel.app/api?type=rect&color=0:140533,100:1e0b4e&height=90&text=Sequential%20Word%20Display%20%C2%B7%20Timed%20Responses%20%C2%B7%20Linked-List%20Queue%20%C2%B7%20Multi-Stage%20Flow&fontSize=15&fontColor=c4b5fd&fontAlignY=35&desc=Designed%20for%20SSB%20interviews%2C%20clinical%20psychology%2C%20research%2C%20and%20self-evaluation&descSize=14&descColor=ede9fe&descAlignY=68" width="100%"/>

<br/><br/>

<!---------------------------------------------------------------------------->
<!--  AT A GLANCE                                                            -->
<!---------------------------------------------------------------------------->

<div align="center">

### 🔮 &nbsp;At a Glance

| 📱 Min SDK | 🗣️ Assessment | 🧩 Data Structure | ⏱️ Timer | 🎨 UI | 🔒 Storage |
|:---:|:---:|:---:|:---:|:---:|:---:|
| **Android 8.1** | **Word Association** | **Custom Linked Queue** | **15s per word** | **Material Design** | **Local (in-app)** |

</div>

<br/><br/>

<!---------------------------------------------------------------------------->
<!--  TABLE OF CONTENTS                                                      -->
<!---------------------------------------------------------------------------->

<img src="https://capsule-render.vercel.app/api?type=rect&color=0:1e0b4e,100:0d0221&height=64&text=%F0%9F%93%8B%20%20Table%20of%20Contents&fontSize=22&fontColor=ede9fe&fontAlignY=52&fontAlign=50" width="100%"/>

<br/>

<div align="center">

| # | Section | # | Section |
|:---:|:---|:---:|:---|
| 01 | [📖 About WAT](#about-wat) | 06 | [🧩 Data Structure — The Queue](#data-structure) |
| 02 | [✨ Features](#features) | 07 | [🚀 Getting Started](#getting-started) |
| 03 | [🔁 App Flow](#app-flow) | 08 | [📱 How to Use](#how-to-use) |
| 04 | [🖥️ Screen Breakdown](#screen-breakdown) | 09 | [🤝 Contributing](#contributing) |
| 05 | [🛠️ Tech Stack](#tech-stack) | 10 | [👤 Author](#author) |

</div>

<br/><br/>

<a name="about-wat"></a>
<!---------------------------------------------------------------------------->
<!--  ABOUT                                                                  -->
<!---------------------------------------------------------------------------->

<img src="https://capsule-render.vercel.app/api?type=rect&color=0:2a0e6e,100:110328&height=64&text=%F0%9F%93%96%20%20About%20WAT&fontSize=22&fontColor=c4b5fd&fontAlignY=52&fontAlign=50" width="100%"/>

<br/>

**WAT** *(Word Association Test)* is a focused Android application that digitises a widely-used psychological assessment tool. The test presents a series of words one at a time — each for a fixed duration — and prompts the candidate to immediately write down their first, uncensored thought. The raw, spontaneous quality of these responses is what makes the WAT a window into personality, cognitive style, and underlying attitudes.

<br/>

<div align="center">

| &nbsp; | Why WAT? | What It Delivers |
|:---:|:---|:---|
| 🧠 | **Genuine First Thoughts** | A strict 15-second timer per word prevents deliberate over-thinking |
| 📋 | **Custom Word Lists** | Administrators build their own test using a sequential word-entry interface |
| 🔢 | **Queue-Driven Order** | Words are stored and served via a custom linked-list queue, preserving insertion order |
| 🎬 | **Smooth Transitions** | Slide animations between words maintain engagement and test momentum |
| 📝 | **Free-Form Responses** | Candidates write full sentences, phrases, or single words — no constraints on expression |
| 🔄 | **Restart Anytime** | Both the word-entry phase and the test itself can be reset cleanly without restarting the app |

</div>

<br/><br/>

<a name="features"></a>
<!---------------------------------------------------------------------------->
<!--  FEATURES                                                               -->
<!---------------------------------------------------------------------------->

<img src="https://capsule-render.vercel.app/api?type=rect&color=0:1a054a,100:080115&height=64&text=%E2%9C%A8%20%20Features&fontSize=22&fontColor=a78bfa&fontAlignY=52&fontAlign=50" width="100%"/>

<br/>

### 📝 1. Multi-Stage Word Entry Interface

The setup phase uses a `ViewFlipper` with three distinct layout stages so the administrator and candidate are never looking at the same screen simultaneously.

**Stage 1 — Introduction Screen**

The app opens with a clear, formatted description of the WAT protocol: what the test measures, how responses should be given, and what constitutes a valid answer. A single **Start** button advances to the entry phase.

**Stage 2 — Word Collection**

Words are entered one at a time into a validated `EditText` field that accepts only alphabetic characters (`digits="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"`) with a 25-character maximum length per word and `textCapWords` input type for consistency.

- Each word is confirmed with **SUBMIT WORD**, which increments the on-screen serial counter, enqueues the word, and clears the input for the next entry.
- **Reset** wipes the queue entirely and resets the counter, allowing the administrator to start the word list over.
- **Next** validates that at least one word is queued; if so, it advances to the preview screen. An error is shown inline on the field if the queue is empty.

**Stage 3 — Pre-Test Summary**

Before the test begins, the app shows a confirmation note:

> *"Test will consist of N words which will be shown one by one at a regular interval of 15 seconds."*

A **BEGIN TEST** button launches the timed test activity.

<br/>

---

### ⏱️ 2. Precision 15-Second Word Timer

Each word in the test is allotted exactly **15 seconds** of display time. The countdown is driven by a recursive `Handler.postDelayed` loop with a 1-second tick interval, displaying a live "Time Left : N" label to the candidate throughout.

```java
// Core timer logic — MainActivity2.java
private void runTimer(TextView timer, ViewFlipper vf) {
    final Handler handler = new Handler();
    handler.post(new Runnable() {
        @Override
        public void run() {
            if ((j == 15) && (c == 0)) {
                // Auto-advance to next word, clear response field
                sentence.setText("");
                vf.showNext();
                c = 15;
            }
            time = ("Time Left : " + j);
            timer.setText(time);
            j--;
            c--;
            if (j == 0) j = 15;
            if (stop) handler.postDelayed(this, 1000);
        }
    });
}
```

The dual-variable design (`j` for display, `c` for flip control) ensures the word advances exactly once per 15-second cycle without race conditions.

<br/>

---

### 🎬 3. Slide Animations Between Words

Word transitions use Android's built-in slide animations for a smooth, professional feel:

- **In:** `android.R.anim.slide_in_left` — new word slides in from the left.
- **Out:** Custom `slide_out_right.xml` — current word exits to the right.

A custom `slide_from_left.xml` animation with a 100ms duration is also defined for snappy navigation within the setup flow.

<br/>

---

### 🏁 4. Smart Test Termination

The `ViewFlipper`'s `onAnimationEnd` listener detects when the final child view (the "Test Completed" card) is displayed. At that point:

- The **countdown timer** is hidden.
- The **response field** is hidden.
- The **timer loop** is stopped (`stop = false`).
- The `ViewFlipper` stops flipping.
- A **Restart** button becomes visible, returning the candidate to `MainActivity` and finishing `MainActivity2` so no stale state persists in the back stack.

<br/>

---

### 🔤 5. Validated, Constrained Input

The word-entry field enforces strict input rules at the XML level to prevent data-entry errors before they reach the queue:

| Constraint | Value | Purpose |
|:---|:---|:---|
| `digits` | `A–Z, a–z` | Letters only — no numbers or symbols |
| `maxLength` | `25` | Prevents overly long words |
| `inputType` | `textCapWords` | Auto-capitalises first letter |
| `singleLine` | `true` | One word per entry |
| `imeOptions` | `actionDone` | Keyboard "Done" key dismisses keyboard |

The response field in the test phase similarly limits input to `maxLength="60"` and `singleLine="true"`, keeping responses concise and on one line.

<br/>

---

### 🔄 6. Full Reset Without App Restart

Both activities support clean state resets:

- In `MainActivity`, the **Reset** button nullifies the queue reference, re-instantiates `Queue`, resets `Queue.length` to 0, and resets the serial counter.
- `onStart()` in `MainActivity` also resets all state variables, ensuring that navigating back from the test always presents a fresh word-entry screen.
- In `MainActivity2`, the **Restart** button fires a new `Intent` for `MainActivity` and calls `finish()` on `MainActivity2`, cleanly removing it from the back stack.

<br/><br/>

<a name="app-flow"></a>
<!---------------------------------------------------------------------------->
<!--  APP FLOW                                                               -->
<!---------------------------------------------------------------------------->

<img src="https://capsule-render.vercel.app/api?type=rect&color=0:2a0e6e,100:0d0221&height=64&text=%F0%9F%94%81%20%20App%20Flow&fontSize=22&fontColor=c4b5fd&fontAlignY=52&fontAlign=50" width="100%"/>

<br/>

```
┌─────────────────────────────────────────────────────────────────┐
│                         MainActivity                            │
│                                                                 │
│  ┌──────────────┐   [Start]   ┌──────────────────────────────┐  │
│  │  Stage 1     │ ──────────► │  Stage 2                     │  │
│  │  Introduction│             │  Word Entry Loop             │  │
│  │  Screen      │             │                              │  │
│  └──────────────┘             │  [SUBMIT WORD] → enqueue()   │  │
│                               │  [Reset]      → clear queue  │  │
│                               │  [Next]       → validate →   │  │
│                               └──────────────┬───────────────┘  │
│                                              │                  │
│                               ┌──────────────▼───────────────┐  │
│                               │  Stage 3                     │  │
│                               │  Pre-Test Summary            │  │
│                               │                              │  │
│                               │  "N words · 15s each"        │  │
│                               │  [BEGIN TEST] ──────────────►│  │
│                               └──────────────────────────────┘  │
└─────────────────────────────────────────────────────────────────┘
                                       │
                                       ▼
┌─────────────────────────────────────────────────────────────────┐
│                        MainActivity2                            │
│                                                                 │
│   ┌──────────┐   Dequeue words   ┌─────────────────────────┐    │
│   │  Queue   │ ────────────────► │  ViewFlipper            │    │
│   │  (FIFO)  │                   │  Word 1 → Word 2 → ...  │    │
│   └──────────┘                   │  [animated slides]      │    │
│                                  └──────────┬──────────────┘    │
│   ┌──────────┐  15s countdown              │                    │
│   │  Timer   │ ─────────────────────────── │                    │
│   │  Handler │  auto-advance               │                    │
│   └──────────┘                             ▼                    │
│                                  ┌─────────────────────────┐    │
│                                  │  "Test Completed" Card  │    │
│                                  │  Timer hidden           │    │
│                                  │  [Restart] → MainActivity│   │
│                                  └─────────────────────────┘    │
└─────────────────────────────────────────────────────────────────┘
```

<br/><br/>

<a name="screen-breakdown"></a>
<!---------------------------------------------------------------------------->
<!--  SCREEN BREAKDOWN                                                       -->
<!---------------------------------------------------------------------------->

<img src="https://capsule-render.vercel.app/api?type=rect&color=0:1a054a,100:080115&height=64&text=%F0%9F%96%A5%EF%B8%8F%20%20Screen%20Breakdown&fontSize=22&fontColor=a78bfa&fontAlignY=52&fontAlign=50" width="100%"/>

<br/>

### MainActivity — Setup Screen

| View ID | Type | Role |
|:---|:---|:---|
| `textView1` | `TextView` | WAT protocol description, hidden after Stage 1 |
| `serial` | `TextView` | Live serial counter — `S.no. - N` |
| `words` | `EditText` | Alphabetic-only word input, max 25 chars |
| `submit` | `Button` | Validates input, enqueues word, increments counter |
| `reset` | `Button` | Clears queue and counter; hidden in Stage 3 |
| `next` | `Button` | Validates queue non-empty, advances to Stage 3 |
| `text1` | `TextView` | Word-count summary note shown in Stage 3 |
| `startTest` | `Button` | Navigates to `MainActivity2`, finishes `MainActivity` |
| `enterword` | `ViewFlipper` | Hosts all three layout stages |

<br/>

### MainActivity2 — Test Screen

| View ID | Type | Role |
|:---|:---|:---|
| `timer` | `TextView` | Live countdown: "Time Left : N" |
| `viewflipper` | `ViewFlipper` | Programmatically populated with word `TextView`s |
| `sentence` | `EditText` | Candidate response field, max 60 chars |
| `restart` | `Button` | Visible only after last word; returns to `MainActivity` |
| `scoreTxt` | `TextView` | Reserved for scoring (currently `GONE`) |

<br/>

### Visual Theme

| Screen | Background | Accent | Font |
|:---|:---|:---|:---|
| **Setup** (`MainActivity`) | `#01235E` deep navy | `#FF8C00` orange buttons/labels | Open Sans Bold |
| **Test** (`MainActivity2`) | `#5947A8` indigo-violet | `#FFFFFF` white text, `#007E6F` teal word cards | Open Sans Bold |

Drawables use rounded-corner `layer-list` shapes (`back.xml` through `back5.xml`) for buttons, word cards, and input fields, with consistent 3dp stroke outlines throughout.

<br/><br/>

<a name="tech-stack"></a>
<!---------------------------------------------------------------------------->
<!--  TECH STACK                                                             -->
<!---------------------------------------------------------------------------->

<img src="https://capsule-render.vercel.app/api?type=rect&color=0:2a0e6e,100:0d0221&height=64&text=%F0%9F%9B%A0%EF%B8%8F%20%20Tech%20Stack&fontSize=22&fontColor=c4b5fd&fontAlignY=52&fontAlign=50" width="100%"/>

<br/>

<div align="center">

| Category | Technology / Component |
|:---|:---|
| **Language** | Java |
| **IDE** | Android Studio |
| **Min SDK** | 27 (Android 8.1 Oreo) |
| **Compile / Target SDK** | 33 (Android 13) |
| **Architecture** | Standard Android Activity Lifecycle |
| **UI Layout** | `ConstraintLayout` + `LinearLayout` + `ViewFlipper` |
| **Input Handling** | `EditText` with `InputMethodManager` |
| **Animation** | `AnimationUtils` + custom XML anim resources |
| **Data Structure** | Custom Linked-List Queue (`Node` + `Queue` classes) |
| **Font** | Google Fonts — Open Sans Bold (preloaded) |
| **Build System** | Gradle 8.12.1 · Android Gradle Plugin 8.8.1 |
| **Java Compatibility** | Java 8 (source & target) |

</div>

<br/><br/>

<a name="data-structure"></a>
<!---------------------------------------------------------------------------->
<!--  DATA STRUCTURE                                                         -->
<!---------------------------------------------------------------------------->

<img src="https://capsule-render.vercel.app/api?type=rect&color=0:1a054a,100:080115&height=64&text=%F0%9F%A7%A9%20%20Data%20Structure%20%E2%80%94%20The%20Queue&fontSize=22&fontColor=a78bfa&fontAlignY=52&fontAlign=50" width="100%"/>

<br/>

The WAT app uses a **custom singly linked-list queue** built from scratch rather than relying on Java's standard `LinkedList` or `ArrayDeque`. This design choice guarantees FIFO (First-In, First-Out) order — words are always shown in the exact sequence they were entered by the administrator.

```java
// Node — the building block
class Node {
    String data;   // The word itself
    Node next;     // Pointer to the next word

    Node(String new_data) {
        this.data = new_data;
        this.next = null;
    }
}

// Queue — linked-list implementation
class Queue {
    static int length = 0;          // Total words enqueued
    static Node front, rear;        // Head and tail pointers

    // Enqueue — add a word to the rear
    static void enqueue(String new_data) {
        Node new_node = new Node(new_data);
        if (rear == null) { front = rear = new_node; }
        else { rear.next = new_node; rear = new_node; }
        ++length;
    }

    // Dequeue — remove and return the front word
    static String dequeue() {
        if (isEmpty()) return "stop";   // Sentinel for test-end detection
        Node temp = front;
        front = front.next;
        if (front == null) rear = null;
        return temp.data;
    }

    static boolean isEmpty() {
        return front == null && rear == null;
    }
}
```

**How it powers the test:**

In `MainActivity2`, the entire queue is consumed in a `while(loop)` block at `onCreate` time. Each `dequeue()` call either returns a word string (wrapped in a numbered `TextView` added to the `ViewFlipper`) or the sentinel value `"stop"` (which adds the "Test Completed" terminal card and ends the loop). The `ViewFlipper` then drives the visual sequencing while the `Handler` timer drives the pacing — the queue only handles ordering.

```
Enqueue order:   "Courage" → "Honesty" → "Leader" → "Failure"
                   ↓            ↓           ↓           ↓
ViewFlipper:    [Word 1]    [Word 2]    [Word 3]    [Word 4]    [Completed]
```

<br/><br/>

<a name="getting-started"></a>
<!---------------------------------------------------------------------------->
<!--  GETTING STARTED                                                        -->
<!---------------------------------------------------------------------------->

<img src="https://capsule-render.vercel.app/api?type=rect&color=0:2a0e6e,100:0d0221&height=64&text=%F0%9F%9A%80%20%20Getting%20Started&fontSize=22&fontColor=c4b5fd&fontAlignY=52&fontAlign=50" width="100%"/>

<br/>

### Prerequisites

<div align="center">

| Requirement | Detail |
|:---|:---|
| 🖥️ **Android Studio** | Latest stable version recommended |
| ☕ **JDK** | Java 8 or higher |
| 📱 **Device / Emulator** | Android 8.1 (API 27) or higher |

</div>

<br/>

### Installation

**Step 1 — Clone the repository**
```bash
git clone https://github.com/kumarpiyushraj/WAT-App.git
```

**Step 2 — Open in Android Studio**
- Launch Android Studio.
- Select `File → Open` and navigate to the cloned project directory.

**Step 3 — Sync and Build**
- Allow Android Studio to sync Gradle dependencies.
- Click `Build → Make Project`.

**Step 4 — Run**
- Select a target device (physical or AVD).
- Click the green **Run ▶** button or press `Shift + F10`.

<br/>

> **No additional permissions are required.** The WAT app is fully self-contained and requires no internet access, camera, microphone, or storage permissions.

<br/><br/>

<a name="how-to-use"></a>
<!---------------------------------------------------------------------------->
<!--  HOW TO USE                                                             -->
<!---------------------------------------------------------------------------->

<img src="https://capsule-render.vercel.app/api?type=rect&color=0:1a054a,100:080115&height=64&text=%F0%9F%93%B1%20%20How%20to%20Use&fontSize=22&fontColor=a78bfa&fontAlignY=52&fontAlign=50" width="100%"/>

<br/>

### Administrator Setup

1. Launch the app — read the WAT protocol description on the introduction screen.
2. Tap **Start** to open the word-entry interface.
3. Type a word into the input field (letters only, max 25 characters).
4. Tap **SUBMIT WORD** to add it to the queue — the serial number increments to confirm.
5. Repeat steps 3–4 for all desired words. Use **Reset** at any point to start the word list over.
6. When the word list is complete, tap **Next**. The app shows the word count and time breakdown.
7. Hand the device to the candidate and tap **BEGIN TEST**.

### Candidate Test

1. Words appear one at a time on a teal card with a countdown timer above.
2. Type the **first thought** that comes to mind in the white response field below.
3. Each word automatically advances after 15 seconds — no manual action needed.
4. After all words have been shown, "Test Completed" appears.
5. Tap **Restart** to return to the setup screen for the next candidate.

<br/>

> **Important:** Responses are not saved to permanent storage between sessions. The app is designed for live, in-person administration where the assessor observes responses in real time. For persistent data collection, responses should be recorded externally.

<br/><br/>

<a name="contributing"></a>
<!---------------------------------------------------------------------------->
<!--  CONTRIBUTING                                                           -->
<!---------------------------------------------------------------------------->

<img src="https://capsule-render.vercel.app/api?type=rect&color=0:2a0e6e,100:0d0221&height=64&text=%F0%9F%A4%9D%20%20Contributing&fontSize=22&fontColor=c4b5fd&fontAlignY=52&fontAlign=50" width="100%"/>

<br/>

Contributions, issues, and feature suggestions are welcome!

<br/>

<div align="center">

| Way to Contribute | Description |
|:---:|:---|
| 🐛 **Report Bugs** | Open an issue with clear reproduction steps |
| 💡 **Suggest Features** | Describe the use case and expected behaviour |
| 🔧 **Submit Pull Requests** | Bug fixes, new features, or code quality improvements |
| 📖 **Improve Documentation** | Clarify instructions or add code comments |

</div>

<br/>

### Contribution Steps

```bash
# Fork the repository, then clone your fork
git clone https://github.com/YOUR_USERNAME/WAT-App.git

# Create a feature branch
git checkout -b feature/your-feature-name

# Make your changes and commit
git commit -m "Add: brief description of change"

# Push to your fork
git push origin feature/your-feature-name

# Open a Pull Request on GitHub
```

### Suggested Future Enhancements

- **Persistent response storage** — save candidate responses to a local Room database or exportable file.
- **Configurable timer** — allow the administrator to set a custom duration per word (e.g., 10s, 15s, 30s).
- **Word bank / presets** — bundled standard WAT word sets (SSB-style, clinical, research).
- **Session report** — a post-test summary screen showing each word alongside its recorded response.
- **Multi-candidate profiles** — store and compare responses across multiple test sessions.

<br/><br/>

<a name="author"></a>
<!---------------------------------------------------------------------------->
<!--  AUTHOR                                                                 -->
<!---------------------------------------------------------------------------->

<img src="https://capsule-render.vercel.app/api?type=rect&color=0:1a054a,100:080115&height=64&text=%F0%9F%91%A4%20%20Author&fontSize=22&fontColor=a78bfa&fontAlignY=52&fontAlign=50" width="100%"/>

<br/>

<div align="center">

**Kumar Piyush Raj**

*Coder by Destiny*

<br/>

[![GitHub](https://img.shields.io/badge/GitHub-kumarpiyushraj-1a0a4e?style=for-the-badge&logo=github&logoColor=white&labelColor=0d0221)](https://github.com/kumarpiyushraj)&nbsp;
[![Email](https://img.shields.io/badge/Email-kmpiyushraj%40gmail.com-1a0a4e?style=for-the-badge&logo=gmail&logoColor=white&labelColor=0d0221)](mailto:kmpiyushraj@gmail.com)

</div>

<br/><br/>

<!---------------------------------------------------------------------------->
<!--  FOOTER                                                                 -->
<!---------------------------------------------------------------------------->

<div align="center">

**Built with 🧠 for assessors, researchers, and aspirants &nbsp;·&nbsp; Java &nbsp;·&nbsp; Android &nbsp;·&nbsp; Material Design**

<br/>

[![Star this repo](https://img.shields.io/github/stars/kumarpiyushraj/WAT-App?style=for-the-badge&logo=github&color=fbbf24&labelColor=0d1117&label=Star%20this%20repo)](https://github.com/kumarpiyushraj/WAT-App/stargazers)

<br/>

*© 2023 Kumar Piyush Raj &nbsp;·&nbsp; [GitHub @kumarpiyushraj](https://github.com/kumarpiyushraj)*

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:a78bfa,40:6d3de8,70:3b1fa8,100:0d0221&height=160&section=footer" width="100%"/>

</div>
