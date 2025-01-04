public class LinkedList {

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }

    }

    public Node add(Node head, Node newNode) {

        Node copyHead = head;

        while (head.next != null) {
            head = head.next;
        }
        head.next = newNode;

        return copyHead;
    }

    public void print(Node head) {

        while (head != null) {
            System.out.println(head.val + " ");
            head = head.next;
        }
    }

    public Node deleteByValue(Node head, int k) {

        // If first node is to be deleted
        if (head.val == k) {
            Node newHead = head.next;
            head.next = null;
            Node temp = newHead;
            return temp;
        }

        Node prev = head;
        Node curr = head.next;
        Node temp = curr;

        while (curr != null) {
            if (curr.val == k) {
                prev.next = curr.next;
            }
            prev = prev.next;
            curr = curr.next;
        }

        return temp;
    }

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        Node newNode = ll.new Node(1);

        Node head = ll.new Node(2);

        head = ll.add(head, newNode);
        head = ll.add(head, ll.new Node(1));
        head = ll.add(head, ll.new Node(3));
        head = ll.add(head, ll.new Node(5));
        head = ll.add(head, ll.new Node(5));
        head = ll.add(head, ll.new Node(9));
        head = ll.add(head, ll.new Node(5));

        System.out.println("Original");
        ll.print(head);

        head = ll.deleteByValue(head, 5);

        System.out.println("Modified");
        ll.print(head);
    }
}
