# GSJ208

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### How to accept string inputs

Lets try the same exercise with strings.

### Task

You need to write a program which does the following

- Accepts $2$ space separated alphanumeric strings as input in $1^{st}$ line as the variables $A$, $B$
- Accepts $3$ space separated alphanumeric strings as input in $2^{nd}$ line as the variables $C$, $D$, $E$
- Prints out $5$ space separated strings as output in a single line to the console

Solve the problem in the IDE and then click on  **Submit**  to proceed.

### Sample 1:
Input
Output

```
abc cde
fg hi jk
```

```
abc cde fg hi jk
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-03T12:31:32.952Z  

```java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String A = sc.next();
        String B = sc.next();
        
        String C = sc.next();
        String D = sc.next();
        String E = sc.next();
        
        System.out.println(A + " " + B + " " + C + " " + D + " " + E);
        
        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/GSJ208)