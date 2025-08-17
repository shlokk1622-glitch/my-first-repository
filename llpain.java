
public class llpain {
    public static class Node {
        int data;
        Node next;

        public Node(int i) {
            // TODO Auto-generated constructor stub
        }

        public void node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    public Node findmid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean checkp() {
        if (head == null || head.next == null)
            return true;
        Node mid = findmid(head); // midnode
        Node prev = null; // rev
        Node curr = mid;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;

        while (right != null) { // check
            if (left.data != right.data)
                return false;
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String[] args) {
        llpain ll = new llpain();
        System.out.println(ll.checkp());
    }
}
