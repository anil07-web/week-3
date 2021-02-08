public class StudentList {
    Node startPtr = null;

    public void insertBegining(Student data)
    {
        Node newNode = new Node(data);

        if(startPtr == null)
        {
            startPtr = newNode;
            startPtr.next = null;
        }
        else{
            newNode.next = startPtr;
            startPtr = newNode;
        }
    }

    public void insertEnd(Student data)
    {
        Node newNode = new Node(data);

        if(startPtr == null)
        {
            startPtr = newNode;
            startPtr.next = null;
        }
        else{
            //move to end of the list
            Node current = startPtr;
            while(current.next!=null)
            {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = null;


        }
    }

    public void insertMiddle(Student data)
    {

    }

    public void delete(Student data)
    {

    }

    public int getSize()
    {
        return 0;
    }

    public void traverse()
    {
        Node current = startPtr;
        while(current!=null)
        {
            System.out.print(current.data+" ");
            current = current.next;
        }
    }

}
