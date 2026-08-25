# Aggressive Cows

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array  **arr[]**, which denotes the positions of stalls. All the positions are distinct. There are **k**  aggressive cows.

Assign the cows to the stalls such that the **minimum**  distance between any two cows is  **maximized.** 

 **Examples:** 

```
Input: arr[] = [1, 2, 4, 8, 9], k = 3
Output: 3
Explanation: The first cow can be placed at arr[0], the second at arr[2], and the third at arr[3]. The minimum distance between any two cows is 3 (between arr[0] and arr[2]), which is the maximum possible among all valid arrangements.
```

```
Input: arr[] = [10, 1, 2, 7, 5], k = 3
Output: 4
Explanation: The first cow can be placed at arr[0], the second at arr[1], and the third at arr[4]. In this arrangement, the minimum distance between any two cows is 4 (between arr[1] and arr[4]), which is the maximum possible among all valid arrangements.
```

 **Constraints:** 
2 ≤ arr.size() ≤ 106
0 ≤ arr[i] ≤ 108
2 ≤ k ≤ arr.size()

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-25T04:29:23.080Z  

```java


class Solution {

    boolean isPossible(int[] arr, int mid, int k) {
        int cow = 1;
        int pos = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - pos >= mid) {
                cow++;
                pos = arr[i];

                if (cow == k) {
                    return true;
                }
            }
        }

        return false;
    }

    public int aggressiveCows(int[] arr, int k) {
        Arrays.sort(arr);

        int n = arr.length;
        int s = 1;
        int e = arr[n - 1] - arr[0];
        int ans = 0;  
        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (isPossible(arr, mid, k)) {
                ans = mid;
                s = mid + 1;  
            } else {
                e = mid - 1;   
            }
        }

        return ans;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/aggressive-cows/1)