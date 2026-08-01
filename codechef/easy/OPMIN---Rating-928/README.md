# OPMIN - Rating 928

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-01T10:57:53.943Z  

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

[View on CodeChef](https://www.codechef.com/problems/OPMIN)