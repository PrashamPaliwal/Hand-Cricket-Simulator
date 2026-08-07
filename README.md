# Hand-Cricket-Simulator 🏏

A console-based hand cricket game written in Java. Play against the system with toss, batting, bowling, chase logic, and even super over tie breakers. Match summaries are automatically saved to a text file.

---

## 📌 What is this code?
This project is a simulation of the popular "hand cricket" game, implemented in Java.  
It allows a user to play against the system with realistic cricket mechanics:
- Toss (heads/tails)
- Choice to bat or bowl first
- Overs selection (1–20 overs)
- Batting and bowling gameplay
- Chase logic with ball-by-ball updates
- Super over in case of a tie
- Final match summary saved to `Match_Score.txt`

---

## ⚙️ How it works

1. **Toss**: User chooses heads/tails; system randomly decides the toss outcome.
2. **Batting/Bowling**:  
   - User inputs a number (1–10) for each ball.  
   - System generates a random number (1–10).  
   - If both numbers match → batsman is out.  
   - Otherwise, runs are added.
3. **Overs & Target**:  
   - Runs accumulate over chosen overs.  
   - Target is set as `(runs + 1)`.
4. **Chasing**:  
   - Opponent tries to chase the target with the same mechanics.  
   - Ball-by-ball updates show required runs and balls left.
5. **Super Over**:  
   - If scores are tied, a one-over super over decides the winner.
6. **Match Summary**:  
   - Results are written to `Match_Score.txt` with toss outcome, scores, and winner.

---

## 🛠️ Challenges Faced While Building

- **Overs & Ball Counting**:  
  - Getting the overs and ball display correct (`Ball co.cb`) was tricky and sometimes led to off-by-one errors in match summaries.
- **Super Over Logic**:  
  - Designing tie-breaker conditions was challenging. At first, return values were inconsistent, which made it hard to decide the winner correctly.
- **Testing Randomness**:  
  - Since the system’s moves are random, reproducing test cases was difficult. Debugging outcomes required multiple runs.

---

## 🚀 Future Enhancements

- **Adaptive AI**: System analyzes user’s past choices and predicts likely future moves.
- **Chasing Strategy**: System calculates risk (e.g., playing safe when close to target, aggressive when behind).
- **Probability-based decisions**: Instead of pure random, the system weights choices based on the match situation.

---

## ▶️ How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/PrashamPaliwal/Hand-Cricket-Simulator.git
