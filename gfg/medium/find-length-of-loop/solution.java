class Solution {
    public int lengthOfLoop(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                Node temp = slow.next;
                int len = 1;

                while (temp != slow) {
                    len++;
                    temp = temp.next;
                }
                return len;
            }
        }

        return 0;
    }
}
