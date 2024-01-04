public class Node {

    //attributes
    double data;
    Node next;

    //constructor
    public Node(){
        this(0);
    }

    public Node (double data){
        this.data = data;
        this.next = null;
    }

    @Override public String toString(){
        return data + "";
    }
}
