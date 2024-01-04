public class LinkList {

    private int size;
    private Node head;

    private int size() {
        int _size = 0;
        Node ptr = head;
        if (ptr == null) {
            return 0;
        } else {
            while (ptr != null) {
                ++_size;
                ptr = ptr.next;
            }
            return _size;
        }
    }

    public boolean contains(double target) {
        Node p = head;
        if (p == null) {
            return false;
        }
        while (p != null) {
            if (p.data == (target)) return true;
            else {
                p = p.next;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        LinkList list = new LinkList();
        LinkList wee = new LinkList();
        LinkList woo = new LinkList();

        Node a = new Node(7.0);
        Node b = new Node(9.0);
        Node c = new Node(3.0);

        Node ay = new Node(8.0);
        Node bee = new Node(5.0);
        Node sea = new Node(0.0);

        a.next = b;
        b.next = c;
        list.head = a;

        ay.next = bee;
        bee.next = sea;
        woo.head = ay;

        wee.removeDouble7();
        System.out.println(wee);

        System.out.println(list);
        list.removeDouble7();
        System.out.println(list);

        woo.removeDouble7();
        System.out.println(woo);

        /*
        List<Integer> data2 = new LinkedList<Integer>();
        data2.add(5);
        data2.add(8);
        data2.add(3);
        data2.add(9);
        data2.add(5);

        ListIterator<Integer> it = data2.listIterator();

        while (it.hasNext()) { // need to have a while loop and need to check if it has next
            Integer temp = it.next();
            System.out.println(temp + " ");
        }

        while (it.hasPrevious()) {
            Integer temp = it.previous();
            System.out.println(temp + " ");
        }
        */
    }

    @Override
    public String toString() {
        Node ptr = head;
        String answer = "[ ";
        while (ptr != null) {
            answer += ptr.toString();
            if (ptr.next != null) {
                answer += ", ";
            }
            ptr = ptr.next;
        }
        answer += " ]";
        return answer;
    }

    public void addToEnd(double target) {
        Node n = new Node(target);
        Node ptr = head;
        if (head == null) {
            head = n;
            return;
        }
        while (ptr.next != null) {
            ptr = ptr.next;
        }
        ptr.next = n;
    }

    public void removeLastItem(){
        if (head == null){
            return;
        }

        if (head.next == null){
            head = null;
            return;
        }

        Node ptr = head;
        while(ptr.next.next != null){
            ptr = ptr.next;
        }
        ptr.next = null;

        /*
        Node ptr = head;
        Node prev;

        while (ptr.next != null){
            prev = ptr;
            ptr = ptr.next;
        }

        prev.next = null;
         */
    }

    public void clear (){
        head = null;
    }

    public void addToBeginning(double target){
        Node n = new Node(target);
        n.next = head;
        head = n;
    }

    public void removeDouble7(){
        Node ptr = head;
        Node count = null;

        if (head == null){
            return;
        }

        while(ptr != null && ptr.data != 7.0) {
            count = ptr;
            ptr = ptr.next;
        }

        if (ptr != null && ptr.data == 7.0){
            count.next = ptr.next;
            return;
        }
    }

    public void removeNextToLast(){
        if(head == null || head.next == null){
            return;
        }
        if(head.next.next == null){
            head = head.next;
            return;
        }
        Node twoBehind = head;
        Node twoAhead = head.next.next;
        while(twoAhead != null){
            twoBehind = twoBehind.next;
            twoAhead = twoAhead.next;
        }
        twoBehind.next = twoAhead;

        /*
         Node ptr = head;
         while (ptr.next.next.next != null){
            ptr = ptr.next;
         }
         ptr.next = ptr.next.next
         */

    }
}