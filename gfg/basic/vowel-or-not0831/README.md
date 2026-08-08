# Vowel or Not

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a character  **ch**  representing an English alphabet, determine whether it is a  **vowel** or not. Return  **true** if  **ch**  is a vowel otherwise return  **false**.

 **Examples:** 

```
Input: ch = 'a'
Output: true
Explanation: 'a' is a vowel. So output for this test case is true.
```

```
Input: ch = 'Z'
Output: false
Explanation: 'Z' is not a vowel. So output for this test case is false.
```

 **Constraints:** 
ch is a lowercase or uppercase English letter.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-08T15:47:28.727Z  

```java
import java.util.Scanner;

class GFG {
    public static boolean isVowel(char c) {
        char ch = Character.toLowerCase(c);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            char c = sc.next().charAt(0);
            System.out.println(isVowel(c));
        }
        sc.close();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/vowel-or-not0831/1)