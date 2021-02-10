package DoublyLinkedList;

public class Node {
    private int data;
    Node previous,next;

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }


}
