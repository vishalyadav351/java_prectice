# Java Switch Case statement

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an integer choice denoting the choice of the user and a list containing the single value R or two values L and B depending on the choice.
If the user's choice is 1, calculate the area of the circle having the given radius(**R**).  
Else if the choice is 2, calculate the area of the rectangle with the given length(**L**) and breadth(**B**).

 **Note :**  A list arr[], containing the single value  **R** or the two values  **L** and  **B**, as input parameters. Return the  **area**  of the desired geometrical figure. Use Math.PI for the value of pi.

 **Examples :** 

```
Input: choice = 1, R = 5
Output: 78.53981633974483
Explaination: The choice is 1. So we have to calculate the area of the circle.
```

```
Input: choice = 2, L = 5, B = 10
Output: 50
Explaination: Here we have to calculate the area of the rectangle.
```

 **Expected Time Complexity:**  O(1)
 **Expected Auxiliary Space:**  O(1)

 **Constraints:** 
1 ≤ R, L, B ≤ 100

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-02T16:44:48.431Z  

```java
import java.util.List;

class Solution {
    static double switchCase(int choice, List<Double> arr) {
        if (choice == 1) {
            double r = arr.get(0);
            return Math.PI * r * r;
        } else {
            double l = arr.get(0);
            double b = arr.get(1);
            return l * b;
        }
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/java-switch-case-statement3529/1)