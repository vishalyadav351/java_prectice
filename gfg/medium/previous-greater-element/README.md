# Previous Greater Element

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an integer array  **arr[]**. For every element in the array, determine its  **Previous Greater Element (PGE)**.

The Previous Greater Element (PGE) of an element  **x**  is the first element that appears to the left of  **x**  in the array and is strictly greater than  **x**.

 **Note:**  If no such element exists, assign  **-1** as the PGE for that position.

 **Examples:** 

```
Input: arr[] = [10, 4, 2, 20, 40, 12, 30]
Output: [-1, 10, 4, -1, -1, 40, 40]
Explanation:
For 10, no elements on the left, so answer is -1.
For 4, previous greater element is 10.
For 2, previous greater element is 4.
For 20, no element on the left greater than 20, so answer is -1.
For 40, no element on the left greater than 40, so answer is -1.
For 12, previous greater element is 40.
For 30, previous greater element is 40.

```

```
Input: arr[] = [10, 20, 30, 40]
Output: [-1, -1, -1, -1]
Explanation: Each element of the array has no previous greater element.
```

 **Constraints:** 
1 ≤ arr.size() ≤ 105
1 ≤ arr[i] ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-28T09:02:35.498Z  

```java
class Solution {
    public ArrayList<Integer> preGreaterEle(int[] arr) {
                int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

       for (int i = 0; i < n; i++) {
           ans.add(-1);
        }

        for (int i = 0 ; i < arr.length; i++) {
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                ans.set(i, -1);
            } else {
                ans.set(i, st.peek());
            }

            st.push(arr[i]);
        }

        return ans;
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/previous-greater-element/1)