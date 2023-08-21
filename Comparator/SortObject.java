
import java.util.*;

public class SortObject 
{
    
    public class Student{
    int roll;
    String Name;
    Student(int roll,String Name)
    {
        this.roll=roll;
        this.Name=Name;
    }

}  
    public static void main(String[] args)
    {

          List<Student> list=new ArrayList<>();

          Student std=new Student(1,"ea");
       list.add(std);

    }
}
