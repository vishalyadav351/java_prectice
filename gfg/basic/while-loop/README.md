# While Loop

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a number  **x**, the task is to print the numbers from  **x**  to 0 in decreasing order in a single line.

 **Example:** 

```
Input: x = 3
Output: 3 2 1 0
Explanation: Numbers in decreasing order from 3 are 3 2 1 0.
```

```
Input: x = 5
Output: 5 4 3 2 1 0
Explanation: Numbers in decreasing order from 5 are 5 4 3 2 1 0.
```

**Constraints:
**0 ≤ x ≤ 100

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-29T16:32:36.717Z  

```java
class Solution {
    public static void utility(int x) {
        // Continue loop as long as x is greater than or equal to 0
        while (x >= 0) {
            System.out.print(x + " ");
            x--; // Decrement x in each iteration
        }
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/while-loop/1)