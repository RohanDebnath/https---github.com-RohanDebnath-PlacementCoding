public class DLL {
    private ListNode head;
    private ListNode tail;
    private int len;

    private class ListNode {
        private int data;
        private ListNode next;
        private ListNode prev;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public DLL() {
        this.head = null;
        this.tail = null;
        this.len = 0;
    }

    public boolean isEmpty() {
        return len == 0; // head==null
    }

    public void insertAtLast(int val) {
        ListNode newNode = new ListNode(val);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        newNode.prev = tail;
        tail = newNode;
        len++;
    }
    

    public static void main(String[] args) {
        DLL dll = new DLL();
        dll.insertAtLast(10);
        dll.insertAtLast(20);
        dll.insertAtLast(30);

    }
}
