// Program to delete the first element in the LinkedList of sequence 56->30->70

package LinkedList;

class Node {
    int data;
    Node next;
};

public class LinkedListUC5 {
    Node head;

    LinkedListUC5() {
        head = null;
    }

    void push_back(int newElement) {
        Node newNode = new Node();
        newNode.data = newElement;
        newNode.next = null;
        if(head == null) {
            head = newNode;
        } else {
            Node temp = new Node();
            temp = head;
            while(temp.next != null)
                temp = temp.next;
            temp.next = newNode;
        }
    }

    public void deleteFirst() {
        if (this.head != null) {
            Node temp = this.head;
            this.head = this.head.next;
            temp = null;
        }
    }

    public void printLinkedList() {
        Node temp = new Node();
        temp = this.head;
        if (temp != null) {
            System.out.print("The list contains: ");
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        } else {
            System.out.println("The list is empty.");
        }
    }

    public static void main(String[] args) {
        LinkedListUC5 MyList = new LinkedListUC5();

        //Add four elements in the list.
        MyList.push_back(56);
        MyList.push_back(30);
        MyList.push_back(70);
        MyList.printLinkedList();

        //Delete the first node
        System.out.println("After deletion of first node: ");
        MyList.deleteFirst();
        MyList.printLinkedList();
    }
}

