package LinkedList;

public class MyNode <T> implements INode<T>{
    private T key;
    private INode<T> next;

    public MyNode(T key) {

        this.key = key;
        this.next = null;
    }

    @Override
    public T getKey() {
        return key;
    }

    @Override
    public void setKey(T key) {

        this.key = key;
    }

    public INode<T> getNext() {

        return next;
    }

    @Override
    public void setNext(INode next) {

        this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder myNodeString = new StringBuilder();
        myNodeString.append(key);

        if(next!=null) {
            myNodeString.append("->").append(next);
        }
        return myNodeString.toString();
    }
}
