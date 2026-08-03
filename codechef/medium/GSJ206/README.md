# GSJ206

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### How to accept multiple inputs in a line

Sometimes - we have to accept multiple inputs in a single line.
Luckily, we can use the same syntax to accept multiple inputs in a single line.
The different inputs need to be separated with a space.

### Task

Now lets try and solve the following

- Accept 3 space separated integers given in a line into 3 variables - $A$, $B$ and $C$
- Print them out to a single line on the console

You can play around with the exact syntax in the IDE -> refer to the solution in case you are unable to get this correct.
Code the solution in the IDE and then click  **Submit**  to continue.

### Sample 1:
Input
Output

```
1 2 3
```

```
1 2 3
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-03T12:30:49.253Z  

```java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        System.out.println(A + " " + B + " " + C);
        
        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/GSJ206)