# GSJ205

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Input mirror

Now let's write a simple program - the  **Input mirror**. Your program needs to do the following

- Accept an integer input from the console and store it in the variable $N$
- Accept a string input from the console and store it in the variable $S$
- Output the integer and the string on the same line separated by a space

Solve the problem in the IDE and then click on click on  **Submit**  to proceed.

### Sample 1:
Input
Output

```
5
abcde
```

```
5 abcde
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-03T12:34:10.334Z  

```java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        String S = sc.next();
        
        System.out.println(N + " " + S);
        
        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/GSJ205)