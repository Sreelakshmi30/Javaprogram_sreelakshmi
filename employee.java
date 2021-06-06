
import java.util.*;
class employees {
    Scanner sc=new Scanner(System.in);
    int empid,salary;
    String Name,address;;
    employees()
    {
        System.out.println("name:");
        Name= sc.next();
        System.out.println("Employee id:");
        empid= sc.nextInt();
        System.out.println("salary:");
        salary=sc.nextInt();
        System.out.println("address:");
        address=sc.next();
    }
}

class teacher extends employees{
    Scanner sc=new Scanner(System.in);
    String dept,subj;
    teacher(){
        System.out.println("Department name:");
        dept=sc.next();
        System.out.println("Subject:");
        subj= sc.next();
    }
    void display()
    {
        System.out.println("Details are:");
        System.out.println(Name);
        System.out.println(empid);
        System.out.println(address);
        System.out.println(subj);
        System.out.println(dept);
        System.out.println(salary);
    }
}

public class Employee{
    public static void main(String ...a)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit:");
        int n=sc.nextInt();
        teacher tr[]=new teacher[n];
        for (int i=0;i<n;i++)
        {
            tr[i]=new teacher();
            tr[i].display();
        }
    }
}
Output
-------
C:\Users\Admin\Desktop\oops>javac Employee.java

C:\Users\Admin\Desktop\oops>java Employee
Enter the limit:
3
name:
Athira
Employee id:
1
salary:
10000
address:
Palakkadu
Department name:
MCA
Subject:
DS
Details are:
Athira
1
Palakkadu
DS
MCA
10000
name:
Adil
Employee id:
2
salary:
17000
address:
Kottayam
Department name:
MBA
Subject:
DS
Details are:
Adil
2
Kottayam
DS
MBA
17000
name:
Ayush
Employee id:
3
salary:
120000
address:
Vaikom
Department name:
MSC CS
Subject:
Details are:
Ayush
3
Vaikom
CS
MSC
120000