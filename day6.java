public class day6 {
    // Definition for singly-linked list
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode middleNode(ListNode head) {
        ListNode curr = head;
        int size = 0;
        
        // Count and store in one pass using array
        ListNode[] arr = new ListNode[100]; // assuming max size
        while (curr != null) {
            arr[size++] = curr;
            curr = curr.next;
        }
        
        return arr[size / 2];
    }

    public static void main(String[] args) {
        day6 solution = new day6();
        
        // Test Case 1: [1,2,3,4,5]
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);
        
        System.out.println("Test 1: [1,2,3,4,5]");
        ListNode result1 = solution.middleNode(head1);
        System.out.print("Output: ");
        printList(result1);
        System.out.println("Expected: [3,4,5]\n");
        
        // Test Case 2: [1,2,3,4,5,6]
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);
        head2.next.next.next.next = new ListNode(5);
        head2.next.next.next.next.next = new ListNode(6);
        
        System.out.println("Test 2: [1,2,3,4,5,6]");
        ListNode result2 = solution.middleNode(head2);
        System.out.print("Output: ");
        printList(result2);
        System.out.println("Expected: [4,5,6]\n");
    }
    
    // Helper method to print the linked list
    public static void printList(ListNode head) {
        ListNode curr = head;
        System.out.print("[");
        while (curr != null) {
            System.out.print(curr.val);
            if (curr.next != null) {
                System.out.print(",");
            }
            curr = curr.next;
        }
        System.out.println("]");
    }
}