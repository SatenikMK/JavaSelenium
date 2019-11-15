public class LinkedList {
    private  Node head;
    private  Node tail;
    private  int count;


    public LinkedList()
    {
        this.head = null;
        this.tail = null;
        this.count = 0;
    }

    public void add(String item){
        Node newNode = new Node(item);
        if(head == null){
            head = newNode;
        }else {
            Node last = head;
            while (last.NextNode != null){
                last = last.NextNode;
            }
            last.NextNode = newNode;
        }

    }

    public void printContent() {
        StringBuilder sb = new StringBuilder("[");
        Node node = head;
        while (node != null) {
            sb.append(node.Element).append(',');
            node = node.NextNode;
        }
        int lastComma = sb.lastIndexOf(",");
        if (lastComma != -1) {
            sb.deleteCharAt(lastComma);
        }
        sb.append(']');
        System.out.println(sb);
    }


    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList ();
        Node head = new Node("valodik");
        Node tail = new Node("vazgenchik",head);
        linkedList.head = head;
        linkedList.tail = tail;
        linkedList.add("Sat");
        linkedList.add("jj");

        linkedList.printContent();

    }

    // Implement add(String item) method: Add element at the end of the list
    // Implement removeAt(int index) method: Removes and returns element on the specified index
    // Implement remove(T item) method: Removes the specified item and return its index.
    // Implement indexOf(T item) method: Searches for given element in the list.
    // Implement contains(T item) method: Checks if the specified element exists in the list.
}

class Node {
    public String Element;
    public Node NextNode;

    public Node(String element) {
        this.Element = element;
        NextNode = null;
    }

    public Node(String element, Node prevNode) {
        this.Element = element;
        prevNode.NextNode = this;
    }
}
