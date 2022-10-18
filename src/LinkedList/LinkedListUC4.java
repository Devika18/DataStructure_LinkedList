package LinkedList;

public class LinkedListUC4 {
    public static INode head;
    public static INode tail;

    public LinkedListUC4() {

        this.head = null;
        this.tail = null;
    }
    public void insert(INode previousNode, INode newNode) {
        INode tempNode = previousNode.getNext();
        previousNode.setNext(newNode);
        newNode.setNext(tempNode);
    }
    public void printLinkedList () {
        System.out.println("My Nodes: "+head);
    }

    public static void main(String[] args) {
        System.out.println("Created Linked List by Insert method");
        MyNode<Integer> firstNode = new MyNode<Integer>(56);
        MyNode<Integer> secondNode = new MyNode<Integer>(30);
        MyNode<Integer> thirdNode = new MyNode<Integer>(70);
        LinkedListUC4 myLinkedList = new LinkedListUC4();
        myLinkedList.insert(firstNode,secondNode);
        myLinkedList.printLinkedList();
    }
}
