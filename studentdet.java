import java.util.*;

interface student {
    Scanner sc = new Scanner(System.in);
    int roll = 41, mark = 70;
    String name = "Sreelakshmi", classname = "MCA";

}
class sports{
    Scanner sc = new Scanner(System.in);
    int marks;
    void get()
    {
        System.out.println("Enter marks out of 20:");
        marks=sc.nextInt();
    }
}

class result extends sports implements student
{
    void displ()
    {
        System.out.println("Details of students are:");
        System.out.println("Name:"+name);
        System.out.println("Roll number:"+roll);
        System.out.println("Class Name:"+classname);
        System.out.println("Academic Mark:"+mark);
        System.out.println("Sports Mark:"+marks);
    }
}
public class studentdet {
    public static void main(String args[])
    {
        result res = new result();
        res.get();
        res.displ();
    }
}

Output
-------
C:\Users\Admin\Desktop\oops>javac studentdet.java
C:\Users\Admin\Desktop\oops>java studentdet
Enter marks out of 20:
18
Details of students are:
Name:Sreelakshmi
Roll number:41
Class Name:MCA
Academic Mark:70
Sports Mark:18