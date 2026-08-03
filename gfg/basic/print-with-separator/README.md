# Print With Separator

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

You'll be given two strings  **a**  and  **b,**  a separator symbol, and you need to print  **a**  and  **b**  such that a and b are separated by the separator symbol followed by a new line.

 **Example :** 

```
Input: a = "Hello", b = "World", separator = "@"
Output: Hello@World
Explanation: a and b are printed with the separator symbol in between.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-03T13:23:25.430Z  

```java
import java.util.Scanner;

class GFG {
    public static void utility(String a, String b, String separator) {
        System.out.println(a + separator + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            String a = sc.next();
            String b = sc.next();
            String separator = sc.next();
            utility(a, b, separator);
        }
        sc.close();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/print-with-separator/1)