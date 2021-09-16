package linkedlist;
public class LinkedList{
    private Node first;
    private Node last;

    public LinkedList(Node n)
    {
        this.first = n;
        this.last = n;
    }

    public void put(int N)
    {
        Node node = new Node(5);
        Node res = this.last;
        res.next = node;
        node.previous = res;
        this.last = node;
    }

    public Node pop()
    {
        Node res = this.last;
        res.previous.next = null;
        this.last = res.previous;
        return res;
    }

    public void shift(Node n)
    {
        this.first.previous = n;
        n.next = this.first;
        this.first = n;
    }

    public Node unshift()
    {
        Node res = this.first;
        res.next.previous = null;
        this.first = res.next;
        return res;
    }


}