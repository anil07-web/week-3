import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BinaryTreeImpl {
    public static BinaryTree readFromFile(String fileName) {
        String line = null;
        BinaryTree btree = new BinaryTree();
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            while ((line = br.readLine()) != null) {
                String str[] = line.split(", ");
                Student st = new Student(str[0], Integer.parseInt(str[1]));
                btree.insertSearchTree(btree.root,st);
             }
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (NumberFormatException e) {
            
            e.printStackTrace();
        } catch (IOException e) {
            
            e.printStackTrace();
        }


        return btree;
    }
    public static void main(String[] args) {
        BinaryTree bt = readFromFile("student.txt");

        bt.traversal(bt.root, Direction.PREORDER);

    }
}
