# Exercise 4 — Predict, Then Run

**Fill in the PREDICTED column completely before you run any code.** That's the whole exercise. Checking the answer without committing to a guess teaches you nothing.

| # | Expression | Predicted | Actual | Right? | If wrong, why? |
|---|---|---|---|---|---|
| 1 | `9 / 2` | 4| 4| correct| |
| 2 | `9 % 2` | 1| |1 |correct |
| 3 | `9.0 / 2` |4.5 |4.5 | correct| |
| 4 | `9 / 2.0` | 4.5| 4.5|correct | |
| 5 | `2 + 3 * 4` | 14| 14| correct| |
| 6 | `(2 + 3) * 4` | 20| 20|correct | |
| 7 | `20 - 5 - 3` | 12|12 |correct | |
| 8 | `17 % 5` | 2|2 |correct | |
| 9 | `5 % 17` | 5| 5|correct | |
| 10 | `100 / 3 / 3` | 11|11 |correct | |
| 11 | `1 / 2 * 100` | 0|0 |correct | |
| 12 | `100 * 1 / 2` | 50|50 |correct | |

---

## Follow-up

**1. Compare #11 and #12. Same numbers, same operators, completely different answers. Explain why.**
Java evaluates expressions from left to right when the operators have the same precedence.
1 / 2 * 100 → 1 / 2 happens first → integer division gives 0 → 0 * 100 = 0
100 * 1 / 2 → 100 * 1 happens first → 100 / 2 = 50
So the order of operations matters even though they contain the same numbers and operators.

**2. #9 gives `5`. Explain why `5 % 17` is 5 and not 0.**

% gives the remainder after division.
Since 17 cannot fit into 5 even once:
5 / 17 = 0 remainder 5
Therefore: 5 % 17 is 5 


**3. A classmate writes this to calculate a percentage:**
```java
int correct = 7;
int total = 10;
double percent = correct / total * 100;
```
**They get `0.0`. Explain what went wrong and write the corrected line.**
int correct = 7;
int total = 10;
double percent = correct / total * 100;
Both correct and total are int, so Java performs integer division first:
7 / 10
becomes 0, not 0.7.
Then:
0 * 100
is 0, which gets stored as 0.0 in the double.

Correct it by making the division floating-point:

// corrected line:
double percent = (double) correct / total * 100;
This gives 70.0.
**4. Give one real situation where `%` would genuinely be useful. Not from this worksheet — something from your own life or your project idea.**
A useful example is determining whether something happens on an alternating schedule. For example, in a project that processes tasks, I could use:

taskNumber % 2
If the result is 0, the task is even-numbered; if it is 1, it is odd-numbered. That could be used to alternate between two types of tasks.
