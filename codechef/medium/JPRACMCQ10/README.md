# JPRACMCQ10

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Multiple Choice Question

Recently, Chef visited his doctor. The doctor advised Chef to drink  **at least**  $2000$ ml of water each day.

Chef drank $X$ ml of water today. Select the options where Chef followed the doctor's advice.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-01T10:34:23.364Z  

```cpp
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        int t = sc.nextInt();
        
        // Process each test case
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            if (x + y > 6) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/JPRACMCQ10)