import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListExamples{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        //generic -> integer values      
       arr.add(32);
       arr.add(32);
       arr.add(1,54);
       arr.add(82);
       arr.add(72);
       arr.add(62);
       arr.add(3);
       arr.add(42);
       arr.add(32);
    System.out.println(arr);
        arr.remove(4);
        System.out.println(arr);

        //iteration

        //1. simple / enhanced for loop

        //2. Iterator

        // Iterator<Integer> itr = arr.descendingIterator();
        // while(itr.hasNext())
        //     System.out.println(itr.next());
 
        // System.out.println("Forward Traversal");
        // ListIterator<Integer> litr = arr.listIterator();

        // while(litr.hasNext())
        //     System.out.println(litr.next());
        // System.out.println("Reverse Traversal");
        // while(litr.hasPrevious())
        // System.out.println(litr.previous());

      Collections.sort(arr);
      System.out.println(arr);
        
    }
}