public class BinaryTree {
    Node root;
    public Node insert(Node node,Student data)
    {
        if(node == null)
        {
        node = new Node(data);
        if(root == null)
            root = node;
        return node;
        }

        if(node.left == null)
            node.left = insert(node.left,data);
        else
            node.right = insert(node.right,data);
        return node;
        
    }

    public Node insertSearchTree(Node node,Student data)
    {
        if(node == null)
        {
        node = new Node(data);
        if(root == null)
            root = node;
        return node;
        }

        if(data.marks < node.data.marks)
            node.left = insert(node.left,data);
        else if(data.marks> node.data.marks)
            node.right = insert(node.right,data);
        return node;
        
    }

    public void traversal(Node node, Direction direction)
    {
        //inorder - l r ri, preorder - r l ri,postorder - l ri r
        if(direction.equals(Direction.INORDER))
        {
            if(node!=null)
            {
                traversal(node.left, direction);
                System.out.println(node.data);
                traversal(node.right,direction);
            }
        }
        if(direction.equals(Direction.PREORDER))
        {
            if(node!=null)
            {
                System.out.println(node.data);
                traversal(node.left, direction);
                traversal(node.right,direction);               
                
            }
        }
        if(direction.equals(Direction.POSTORDER))
        {
            if(node!=null)
            {
                traversal(node.left, direction);
                traversal(node.right,direction);
                System.out.println(node.data);
            }
        }
    }
}
