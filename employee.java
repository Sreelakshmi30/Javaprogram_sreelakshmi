import java.util.Scanner;
class employee {
  int eno,esalary;
  String ename;
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  employee[] e=new employee[3];
  System.out.println("Enter the limit");
  int n=sc.nextInt();
   for(int i=0;i<n;i++)
   {
	System.out.println("Enter the data:");
	e[i]=new employee();
	e[i].eno=sc.nextInt();
	e[i].esalary=sc.nextInt();
	e[i].ename=sc.next();
   }
   System.out.println("Enter the employee number:");
   int enoo=sc.nextInt();
      for(int i=0;i<n;i++)
      {
			
          if(e[i].eno==enoo)
	  {
				
             System.out.println("Employee details:");
	     System.out.println("name:"+e[i].ename+"\nemployee number:"+e[i].eno+"\nemployee salary:"+e[i].esalary);
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
-------
C:\Users\Admin\Desktop\oops>javac employee.java

C:\Users\Admin\Desktop\oops>java employee
Enter the limit
3
Enter the data:
1
10000
Anu
Enter the data:
2
15000
Arun
Enter the data:
3
12000
Alan
Enter the employee number:
3
Employee details:
name:Alan
employee number:3
employee salary:12000

C:\Users\Admin\Desktop\oops>

