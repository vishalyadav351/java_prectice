# Concatenate Integers

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given two integers **a**  and  **b**, you need to  **concatenate** them so the  **output** is  **ab** and  **print** it.

 **Examples:** 

```
Input: a = 5, b = 6
Output: 56
Explanation: Concatenate them.
```

```
Input: a = 1, b = 9
Output: 19
Explanation: Concatenate them.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-08T15:52:43.937Z  

```java
import java.util.Scanner;

class GFG {
    public static String concatenate(int a, int b) {
        return String.valueOf(a) + String.valueOf(b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(concatenate(a, b));
        }
        sc.close();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/concatenate-integers/1)