# Next Smaller Element

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an integer array arr[ ]. For every element in the array, your task is to find its Next Smaller Element (NSE).

- The Next Smaller Element (NSE) of an element x is the first element that appears to the right of x in the array and is strictly smaller than x.
- If no such element exists, assign -1 as the NSE for that position.

 **Examples:** 

```
Input: arr[] = [4, 8, 5, 2, 25]
Output: [2, 5, 2, -1, -1]
Explanation: 
The first element smaller than 4 having index > 0 is 2.
The first element smaller than 8 having index > 1 is 5.
The first element smaller than 5 having index > 2 is 2.
There are no elements smaller than 4 having index > 3.
There are no elements smaller than 4 having index > 4.
```

```
Input: arr[] = [13, 7, 6, 12]
Output: [7, 6, -1, -1]
Explanation:
The first element smaller than 13 having index > 0 is 7.
The first element smaller than 7 having index > 1 is 6.
There are no elements smaller than 6 having index > 2.
There are no elements smaller than 12 having index > 3.
```

```
Input: arr[] = [4, 1]
Output: [1, -1]
Explanation: 4 will be updated to 1 and 1 will be updated to -1.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-28T08:46:07.530Z  

```java

import java.util.*;

class Solution {
    public ArrayList<Integer> nextSmallerEle(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            ans.add(-1);
        }

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() >= arr[i]) {
                st.pop();
            }

            if (!st.isEmpty()) {
                ans.set(i, st.peek());
            }

            st.push(arr[i]);
        }

        return ans;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/immediate-smaller-element1142/1)