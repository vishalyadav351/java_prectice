# GSJ203

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### How to accept integer inputs

We have already learned how to take user input in Learn Java course

### Task

Let us define a variable $N$ that accepts integer inputs.
Output the same variable $N$.

Code the solution in the IDE and then click  **Submit**  to continue.

### Sample 1:
Input
Output

```
4312
```

```
4312
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-03T12:29:57.633Z  

```java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        System.out.println(N);
        
        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/GSJ203)