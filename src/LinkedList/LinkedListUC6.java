// Program to delete the last element in the LinkedList of sequence 56->30->70

package LinkedList;

public class LinkedListUC6 {
    Node head;

    LinkedListUC6(){
        head = null;
    }
    class Node {
        int data;
        Node next;
    }
    void push_back(int newElement) {
        LinkedListUC6.Node newNode = new LinkedListUC6.Node();
        newNode.data = newElement;
        newNode.next = null;
        if(head == null) {
            head = newNode;
        } else {
            LinkedListUC6.Node temp = new LinkedListUC6.Node();
            temp = head;
            while(temp.next != null)
                temp = temp.next;
            temp.next = newNode;
        }
    }
    // Function to remove the last node of the linked list
    void deleteLastNode() {
        if (this.head != null) {
            if (this.head.next == null) {
                this.head = null;
            } else {
                Node temp = new Node();
                temp = this.head;
                while (temp.next.next != null)
                    temp = temp.next;
                Node lastNode = temp.next;
                temp.next = null;
                lastNode = null;
            }
        }
    }
    void PrintList() {
        Node temp = new Node();
        temp = this.head;
        if(temp != null) {
            System.out.print("The list contains: ");
            while(temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        } else {
            System.out.println("The list is empty.");
        }
    }
    // Driver code
    public static void main(String args[])
    {
        LinkedListUC6 MyList = new LinkedListUC6();

        //Add three elements in the list.
        MyList.push_back(56);
        MyList.push_back(30);
        MyList.push_back(70);
        MyList.PrintList();

        //Delete the last node
        System.out.println("After deletion of Last node: ");
        MyList.deleteLastNode();
        MyList.PrintList();
    }
}
