# JPRACMCQ9

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Multiple Choice Question

Chef defines a pair of positive integers $(a, b)$ to be a $\text{Oneful Pair}$, if

$a + b + (a \cdot b) = 111$

For example, $(1, 55)$ is a $\text{Oneful Pair}$, since $1 + 55 + (1 \cdot 55) = 56 + 55 = 111$.
But $(1, 56)$ is not a $\text{Oneful Pair}$, since $1 + 56 + (1 \cdot 56) = 57 + 56 = 113 \neq 111$.

Which of these pairs are $\text{Oneful Pair}$?

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-31T05:03:53.464Z  

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
		
        if(y*2<=x)
        {
        System.out.println("YES");
        }
        else
            System.out.println("NO");
        
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/JPRACMCQ9)