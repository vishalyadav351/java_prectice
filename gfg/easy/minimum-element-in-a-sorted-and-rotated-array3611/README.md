# Sorted and Rotated Minimum

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

A sorted array of distinct elements  **arr[]**  is rotated at some unknown point, the task is to find the minimum element in it. 

 **Examples:** 

```
Input: arr[] = [5, 6, 1, 2, 3, 4]
Output: 1
Explanation: 1 is the minimum element in the array.
```

```
Input: arr[] = [3, 1, 2]
Output: 1
Explanation: Here 1 is the minimum element.

```

```
Input: arr[] = [4, 2, 3]
Output: 2
Explanation: Here 2 is the minimum element.
```

 **Constraints** :
1 ≤ arr.size() ≤ 106
1 ≤ arr[i] ≤ 109

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-14T04:36:56.954Z  

```java
class Solution {
    public int findMin(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        
        while (start < end) {
            int mid = start + (end - start) / 2;
           
            if (arr[mid] > arr[end]) {
                start = mid + 1;
            } 
            else {
                end = mid;
            }
        }  
        
        return arr[start];
    }   
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/minimum-element-in-a-sorted-and-rotated-array3611/1)