import java.util.List;

public class SLL {

    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.print("Null");
    }

    int len() {
        int count = 0;
        ListNode current = head;
        while (current != null) {
            current = current.next;
            count++;
        }
        return count;
    }

    void insertAtfirst(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head;
        head = newNode;
    }

    void insertAtLast(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
        }
        ListNode currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    void insertAtposition(int val, int pos) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            newNode.next = head;
            head = newNode;
        } else {
            ListNode previousNode = head;
            int count = 0;
            while (count < pos - 1) {
                previousNode = previousNode.next;
                count++;
            }
            ListNode currentNoode = previousNode.next;
            previousNode.next = newNode;
            newNode.next = currentNoode;

        }
    }

    void deleteatFirst() {
        if (head == null) {
            System.out.println("Nothing to delete");
        }
        ListNode tempNode = head;
        head = head.next;
    }

    void deleteatlast() {
        if ((head == null) || (head.next == null)) {
            System.out.println("Nothing to del");
        } else {
            ListNode currentNode = head;
            while (currentNode.next.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = null;
        }
    }

    void deleteatPosition(int pos) {
        if (pos == 1) {
            head = head.next;
        } else {
            int count = 1;
            ListNode prevNode = head;
            while (count < pos - 1) {
                prevNode = prevNode.next;
                count++;
            }
            ListNode currentNode = prevNode.next;
            prevNode.next = currentNode.next;
        }
    }

    void search(int key) {
        ListNode currentNode = head;
        while (currentNode.next != null) {
            if (currentNode.data == key)
                System.out.println("Found");
            currentNode = currentNode.next;
        }
    }

    void reservseList() {
        if (head == null)
            System.out.println("Cannot Reverse");
            
        ListNode currentNode = head;
        ListNode previousNode = null;
        ListNode nextNode = null;
        while (currentNode != null) {
            nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }
        head = previousNode;
    }

    void getMiddleNode() {
        ListNode fastPointer = head;
        ListNode slowPointer = head;
        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        System.out.println("Middle element is :" + slowPointer.data);
    }

    void findKthNode_fromtheENd(int key) {
        ListNode mainPtr = head;
        int len = 0;
        while (mainPtr != null) {
            mainPtr = mainPtr.next;
            len++;
        }
        mainPtr = head;
        int count = 0;
        while (count < (len - key)) {
            mainPtr = mainPtr.next;
            count++;
        }
        System.out.println("The " + key + " element from the end is " + mainPtr.data);
    }

    void removeDuplicatefromSortedList() {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.data == current.next.data)
                current.next = current.next.next;
            else
                current = current.next;
        }
    }

    void insertinSortedvalue(int val) {
        ListNode current = head;
        ListNode temp = null;
        ListNode newNode = new ListNode(val);
        while (current != null && current.data < newNode.data) {
            temp = current;
            current = current.next;
        }
        newNode.next = current;
        temp.next = newNode;

    }

    void deleteaNodeUsingValue(int val) {
        ListNode current = head;
        ListNode temp = null;
        while (current != null && current.data != val) {
            temp = current;
            current = current.next;
        }
        if (current != null)
            temp.next = current.next;
    }

    public static void main(String[] args) {
        SLL sll = new SLL();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);

        // Lets connect the data with each other;
        sll.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = null; // if not written it will be treated as null only.

        sll.display(); // display
        System.out.println();
        System.out.println(sll.len()); // Length Determination
        sll.insertAtfirst(5);
        sll.insertAtfirst(1);
        sll.display();
        System.out.println();

        sll.insertAtLast(50);
        sll.insertAtLast(50);
        sll.insertAtLast(60);
        sll.display();

        System.out.println();
        sll.insertAtposition(15, 3);
        sll.insertAtposition(16, 4);
        sll.display();
        System.out.println();

        sll.insertinSortedvalue(17);
        sll.display();

        System.out.println();
        sll.deleteatFirst();
        sll.display();
        System.out.println();

        sll.deleteaNodeUsingValue(17);
        sll.display();

        System.out.println();
        sll.deleteatlast();
        sll.display();

        System.out.println();
        sll.deleteatPosition(3);
        sll.display();

        System.out.println();
        sll.search(30);

        sll.reservseList();
        sll.display();

        System.out.println();
        sll.getMiddleNode();

        sll.findKthNode_fromtheENd(3);

        sll.removeDuplicatefromSortedList();
        sll.display();

    }
}
