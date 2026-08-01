# UWCOI20A - Rating 650

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Find maximum in an Array

Given a list of $N$ integers, representing height of mountains. Find the height of the tallest mountain.

### Input:
- First line will contain $T$, number of testcases. Then the testcases follow.
- The first line in each testcase contains one integer, $N$.
- The following line contains $N$ space separated integers: the height of each mountains.
### Output:

For each testcase, output one line with one integer: the height of the tallest mountain for that test case.

### Constraints
- $1 \leq T \leq 10$
- $1 \leq N \leq 100000$
- $0 \leq$ height of each mountain $\leq 10^9$
### Sample 1:
Input
Output

```
1
5
4 7 6 3 1
```

```
7
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-01T10:56:40.964Z  

```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        String line = br.readLine();
        if (line == null) return;
        
        int t = Integer.parseInt(line.trim());

        while (t-- > 0) {
            line = br.readLine();
            while (line != null && line.trim().isEmpty()) {
                line = br.readLine();
            }
            if (line == null) break;
            
            int n = Integer.parseInt(line.trim());
            
            int max = 0;
            
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                if (!st.hasMoreTokens()) {
                    st = new StringTokenizer(br.readLine());
                }
                int height = Integer.parseInt(st.nextToken());
                if (height > max) {
                    max = height;
                }
            }
            
            System.out.println(max);
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/UWCOI20A)