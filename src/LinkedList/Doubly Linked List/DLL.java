import java.util.NoSuchElementException;

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

    public void displayForward() {
        if (head == null)
            return;
        else {
            ListNode temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.print("Null");
        }
    }

    public void displayBackward() {
        if (tail == null)
            return;
        else {
            ListNode temp = tail;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.prev;
            }
            System.out.print("Null");
        }
    }

    public void insertAtfirst(int val) {
        ListNode newNode = new ListNode(val);
        if (isEmpty()) {
            tail = newNode;
        } else {
            head.prev = newNode;
        }
        newNode.next = head;
        head = newNode;
    }

    public ListNode deleteatFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        ListNode temp = head;
        if (head == tail) {
            tail = null;
        } else {
            head.next.prev = null;
        }
        head = head.next;
        temp.next = null;
        len--;
        return temp;
    }

    public ListNode deleteatLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        ListNode temp = tail;
        if (head == tail) {
            head = null;
        } else {
            tail.prev.next = null;
        }
        tail = tail.prev;
        temp.prev = null;
        return temp;
    }

    public static void main(String[] args) {
        DLL dll = new DLL();
        dll.insertAtLast(10);
        dll.insertAtLast(20);
        dll.insertAtLast(30);

        dll.displayForward();
        System.out.println();
        dll.displayBackward();

        dll.insertAtfirst(5);

        System.out.println();
        dll.displayForward();
        System.out.println();
        dll.displayBackward();

        System.out.println();
        System.out.println("Deleting at First");
        dll.deleteatFirst();
        dll.displayForward();
        System.out.println();
        dll.displayBackward();

        System.out.println();
        System.out.println("Deleting at last");
        dll.deleteatLast();
        dll.displayForward();
        System.out.println();
        dll.displayBackward();

    }
}
