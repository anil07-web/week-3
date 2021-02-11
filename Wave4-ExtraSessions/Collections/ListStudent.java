import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListStudent {
    public static void main(String[] args) {
        List<Student> slist = Arrays.asList(new Student(13,"Larry"),
        new Student(11,"Sam"),new Student(1,"Sally"),
        new Student(5,"Pam"),new Student(21,"Manny"),new Student(11,"Diva"));

        System.out.println(slist);
        Collections.sort(slist,new NameComparator());
        System.out.println(slist);

    }
}
