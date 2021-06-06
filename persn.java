import java.util.Scanner;
class person{
    Scanner sc=new Scanner(System.in);
    String gend,addres,name;
    int age;
    person()
    {
        System.out.println("Person Details:");
        System.out.println("Name:");
        name=sc.next();
        System.out.println("Address:");
        addres=sc.next();
        System.out.println("Gender:");
        gend=sc.next();
        System.out.println("Age:");
        age= sc.nextInt();
    }
}

class emplye extends person{
    int emplid,salry;
    String cmpny_name,qualification;
    Scanner sc=new Scanner(System.in);
    emplye()
    {
        System.out.println("Empolyee Details");
        System.out.println("Company Name:");
        cmpny_name=sc.next();
        System.out.println("Employee ID:");
        emplid=sc.nextInt();
        System.out.println("Qualification:");
        qualification=sc.next();
        System.out.println("Salary:");
        salry=sc.nextInt();
    }
}
class tcher extends emplye{
    Scanner sc=new Scanner(System.in);
    String dept,subj;
    int techrID;
    tcher(){
        System.out.println("Teacher Details:");
        System.out.println("Department name:");
        dept=sc.next();
        System.out.println("Subject:");
        subj= sc.next();
        System.out.println("Teahcer ID:");
        techrID= sc.nextInt();
    }
    void disp()
    {
        System.out.println("Details are:");
        System.out.println(name);
        System.out.println(gend);
        System.out.println(age);
        System.out.println(cmpny_name);
        System.out.println(emplid);
        System.out.println(qualification);
        System.out.println(techrID);
        System.out.println(addres);
        System.out.println(subj);
        System.out.println(dept);
        System.out.println(salry);
    }
}
public class persn {
    public static void main(String ...a)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit:");
        int n=sc.nextInt();
        tcher tr[]=new tcher[n];
        for (int i=0;i<n;i++)
        {
            tr[i]=new tcher();
            tr[i].disp();
        }
    }
}

Output
-------
C:\Users\Admin\Desktop\oops>javac persn.java

C:\Users\Admin\Desktop\oops>java persn
Enter the limit:
2
Person Details:
Name:
Athira
Address:
Alappuzha
Gender:
Female
Age:
23
Empolyee Details
Company Name:
Wipro
Employee ID:
1
Qualification:
MCA
Salary:
12000
Teacher Details:
Department name:
MCA
Subject:
DBMS
Teahcer ID:
34
Details are:
Athira
Female
23
Wipro
1
MCA
34
Alappuzha
DBMS
MCA
12000
Person Details:
Name:
Arjun
Address:
Pala
Gender:
Male
Age:
22
Empolyee Details
Company Name:
TCS
Employee ID:
35
Qualification:
BCA
Salary:
10000
Teacher Details:
Department name:
MCA
Subject:
DS
Teahcer ID:
2
Details are:
Arjun
Male
22
TCS
35
BCA
2
Pala
DS
MCA
10000
