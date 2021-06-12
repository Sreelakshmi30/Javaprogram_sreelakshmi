

import java.util.Scanner;
class employee1
{
 int empno,empsalary;
 String empname;
 public static void main(String args[]) 
 {
  Scanner sc=new Scanner(System.in);
  employee1[] emp=new employee1[100];
  System.out.println("Enter the limit");
  int n=sc.nextInt();
  for(int i=0;i<n;i++)
   {
     System.out.println("\n\tEnter the details:-\n");
     emp[i]=new employee1();
     System.out.println("Enter the employee number:");
     emp[i].empno=sc.nextInt();
     System.out.println("Enter the employee name:");
     emp[i].empname=sc.next();
     System.out.println("Enter the employee salary:");
     emp[i].empsalary=sc.nextInt();
    
     }
   System.out.println("\nEnter the employee number to search:");
   int empnoo=sc.nextInt();
     for(int i=0;i<n;i++)
       {
	if(emp[i].empno==empnoo)
	{
	 System.out.println("\n\t\tEmployee details:");
         System.out.println("\t\t----------------");
	 System.out.println("Name:"+emp[i].empname+"\nEmployee number:"+emp[i].empno+"\nEmployee salary:"+emp[i].empsalary);
	  break;
	 }
	if(i==n-1)
	{
	  System.out.println("Employee not found:");
	 }
    }
 }
}

OUTPUT
--------
C:\Users\Admin\Desktop\oops>javac employee1.java

C:\Users\Admin\Desktop\oops>java employee1
Enter the limit
3

        Enter the details:-

Enter the employee number:
122
Enter the employee name:
Asha
Enter the employee salary:
12000

        Enter the details:-

Enter the employee number:
123
Enter the employee name:
Anu
Enter the employee salary:
34000

        Enter the details:-

Enter the employee number:
124
Enter the employee name:
Akshay
Enter the employee salary:
28000

Enter the employee number to search:
124

                Employee details:
                ----------------
Name:Akshay
Employee number:124
Employee salary:28000

C:\Users\Admin\Desktop\oops>

 
                          