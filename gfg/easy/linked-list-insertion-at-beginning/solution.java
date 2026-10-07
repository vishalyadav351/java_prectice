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