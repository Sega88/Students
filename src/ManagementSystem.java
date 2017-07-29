/**
 * Created by Sergei on 30.07.2017.
 */
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class ManagementSystem {

    private List<Group> groups;
    private Collection<Student> students;

    private static ManagementSystem instance;

    //закрытый конструктор
    private ManagementSystem(){
        loadGroups();
        loadStudents();
    }

}//class
