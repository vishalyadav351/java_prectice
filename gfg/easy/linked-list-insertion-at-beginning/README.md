# Linked List Insertion At Beginning

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given the  **head**  of a Singly Linked List and a value  **x**, insert that value  **x**  at the beginning of the LinkedList and return the  **head**  of the modified Linked List.

 **Examples :** 

```
Input: x = 1,
    
Output: 1 -> 2 -> 10
Explanation: We can see that 1 is inserted at the beginning of the linked list.
    
```

```
Input: x = 1,
    
Output: 1 -> 2 -> 3 -> 4 -> 5
Explanation: We can see that 1 is inserted at the beginning of the linked list.
       
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-07T08:27:55.274Z  

```java
/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node insertAtFront(Node head, int x) {
        Node newHead = new Node(x);
        newHead.next = head;
        return newHead;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/linked-list-insertion-at-beginning/1)