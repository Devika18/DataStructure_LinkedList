package LinkedList;

public interface INode <T> {
    public T getKey();
    public void setKey(T key);
    INode getNext();
    public void setNext(INode next);
}
