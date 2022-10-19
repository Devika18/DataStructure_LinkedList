// Program to insert 30 between 56 and 70

package LinkedList;

public class LinkedListUC4 {
    Node head;
    int size = 0;

    // Node Class
    class Node{
        int data;
        Node next;

        Node(int x) // parameterized constructor
        {
            data = x;
            next = null;
        }
    }
    public void insert(int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }
    public void insertMiddle(int data) {
        Node newNode = new Node(data);

        // if the LL was empty
        if(head == null){
            newNode.data = data;
            newNode.next = head;
            head = newNode;
            size++;
            return;
        }

        // otherwise
        Node temp = head;

        // find correct insertion position for middle
        int mid = (size % 2 == 0) ? (size/2) : (size+1)/2;

        // traverse to current mid position
        while(--mid > 0){
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }
    public void printLinkedList () {
        Node node = head;
        //as linked list will end when Node reaches Null
        while(node!=null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListUC4 linkedList = new LinkedListUC4();

        linkedList.insert(70);
        linkedList.insert(56);

        // Inserting node in the middle
        linkedList.insertMiddle(30);
        linkedList.printLinkedList();
    }
}
