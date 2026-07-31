# JPRACMCQ6

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Multiple Choice Question

Alice has scored $X$ marks in her test and Bob has scored $Y$ marks in the same test.
Alice is happy if she scored at least twice the marks of Bob’s score.
Print "Yes" is she is happy.
Other wise print nothing.

 **Option 1:** 

```
if (X >= 2 * Y) {
    System.out.println("YES");
}

```

 **Option 2:** 

```
if (X > 2*Y) {
    System.out.println("YES");
}

```

 **Option 3:** 

```
if (2*Y <= X) {
    System.out.println("YES");
}

```

 **Option 4:** 

```
if (2*Y >= X) {
    System.out.println("YES");
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-31T14:32:55.202Z  

```cpp
import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if (x<y)
		{
		    System.out.println("YES");
		}
		else
		 System.out.println("NO");
		
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/JPRACMCQ6)