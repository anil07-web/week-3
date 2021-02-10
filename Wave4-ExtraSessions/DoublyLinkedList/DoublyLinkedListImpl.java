package DoublyLinkedList;

public class DoublyLinkedListImpl {
    public static void main(String[] args) {
        DoublyLinkedList dl = new DoublyLinkedList();
        dl.insertBegin(10);
        dl.insertBegin(15);
        dl.insertBegin(14);
        dl.insertBegin(16);
        dl.insertBegin(18);
        dl.insertEnd(21);
        dl.insertEnd(20);
        dl.insertEnd(25);
        dl.insertEnd(23);
        dl.insertEnd(26);

        //System.out.println("Forward Traversal");
        //dl.forwardTraversal();
        System.out.println("Reverse Traversal");
       dl.reverseTraversal();
        
    }
}
