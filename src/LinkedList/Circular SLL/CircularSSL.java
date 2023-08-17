import java.security.NoSuchAlgorithmException;
import java.util.NoSuchElementException;

public class CircularSSL {

    private ListNode last;
    private int len;

    private class ListNode {
        private ListNode next;
        private int data;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public CircularSSL() {
        last = null;
        len = 0;
    }

    public int len() {
        return len;
    }

    public boolean isEmpty() {
        return len == 0;
    }

    public void createCircularLinkedList() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;

        last = fourth;
    }

    public void display() {
        if (last == null)
            return;
        ListNode first = last.next;
        while (first != last) {
            System.out.print(first.data + "->");
            first = first.next;
        }
        System.out.println(first.data + " ");
    }

    public void insertAtFirst(int val) {
        ListNode temp = new ListNode(val);
        if (last == null)
            last = temp;
        else {
            temp.next = last.next;
        }
        last.next = temp;
        len++;

    }
    public void insertAtEnd(int val)
    {
        ListNode temp= new ListNode(val);
        if(last==null)
        {
            last=temp;
            last.next=last;
        }
        else
        {
            temp.next=last.next;
            last.next=temp;
            last=temp;
        }
        len++;
    }
    public void deleteAtfirst()
    {
        ListNode temp = last.next;
        if(isEmpty())
        throw new NoSuchElementException();
        else
        {
            last.next=temp.next;
        }
        temp.next=null;
        len--;

    }
    public static void main(String[] args) {
        CircularSSL csll = new CircularSSL();
        csll.createCircularLinkedList();
        csll.display();

        csll.insertAtFirst(10);
        csll.display();

        csll.insertAtEnd(30);
        csll.display();

        csll.deleteAtfirst();
        csll.display();

    }
}
