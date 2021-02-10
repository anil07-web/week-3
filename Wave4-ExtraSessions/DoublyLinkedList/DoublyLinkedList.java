package DoublyLinkedList;

public class DoublyLinkedList {
    Node startPtr;
    public void insertBegin(int data)
    {
        Node newNode = new Node(data);
        if(startPtr == null)
        {
            startPtr = newNode;
        }
        else{
            newNode.next = startPtr;
            startPtr.previous = newNode;
            startPtr = newNode;
        }
    }
    public void insertEnd(int data)
    {
        Node newNode = new Node(data);
        Node current = null;
        if(startPtr == null)
        {
            startPtr = newNode;
        }
        else{
            current = startPtr;
            while(current.next!=null)
            {
                current = current.next;
            }

            current.next = newNode;
            newNode.previous = current;
            newNode.next = null;
        } 
    }
    public void forwardTraversal()
    {
        Node current = startPtr;
        if(current==null) return;
        while(current != null)
        {
            System.out.print(current.getData()+" ");
            current = current.next;
        }
    }

    public void reverseTraversal()
    {
        Node current = startPtr;
        while(current.next != null)
        {
            current = current.next;
        }

        while(current!=null)
        {
         System.out.print(current.getData() + " ");  
         current = current.previous; 
        }
    }

}
