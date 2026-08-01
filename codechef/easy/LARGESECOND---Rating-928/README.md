# LARGESECOND - Rating 928

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Largest and Second Largest

You are given an array $A$ of $N$ integers.
Find the  **maximum**  sum of  **two distinct**  integers in the array.

 **Note:**  It is guaranteed that there exist at least two distinct integers in the array.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of multiple lines of input. The first line of each test case contains single integer $N$ — the size of the array. The next line contains $N$ space-separated integers, denoting the array $A$.
### Output Format

For each test case, output on a new line, the maximum sum of two distinct integers in the array.

### Constraints
- $1 \leq T \leq 1000$
- $2 \leq N \leq 10^5$
- $1 \leq A_i \leq 1000$
- The sum of $N$ over all test cases does not exceed $2\cdot 10^5$.
### Sample 1:
Input
Output

```
4
3
4 1 6
7
3 7 2 1 1 5 3
5
8 2 9 4 9
2
1 2
```

```
10
12
17
3
```

### Explanation:

 **Test case $1$:**  The maximum sum of two distinct elements is $4 + 6 = 10$.

 **Test case $2$:**  The maximum sum of two distinct elements is $7 + 5 = 12$.

 **Test case $3$:**  The maximum sum of two distinct elements is $8 + 9 = 17$.

 **Test case $4$:**  The maximum sum of two distinct elements is $1 + 2 = 3$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-01T10:57:50.399Z  

```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
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
            
            int max1 = -1;
            int max2 = -1;

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                if (!st.hasMoreTokens()) {
                    st = new StringTokenizer(br.readLine());
                }
                int val = Integer.parseInt(st.nextToken());

                if (val > max1) {
                    max2 = max1;
                    max1 = val;
                } else if (val < max1 && val > max2) {
                    max2 = val;
                }
            }

            System.out.println(max1 + max2);
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/LARGESECOND)