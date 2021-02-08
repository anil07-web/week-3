import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StudentImpl {

    public static StudentList readFromFile(String fileName) {
        String line = null;
        StudentList sl = new StudentList();
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            while ((line = br.readLine()) != null) {
                String str[] = line.split(", ");
                Student st = new Student(str[0], Integer.parseInt(str[1]));
                sl.insertEnd(st);
             }
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (NumberFormatException e) {
            
            e.printStackTrace();
        } catch (IOException e) {
            
            e.printStackTrace();
        }


        return sl;
    }
    public static void main(String[] args) {
        StudentList stdlist = readFromFile("student.txt");
        stdlist.traverse();
    }
}
