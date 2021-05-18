import java.util.Scanner;
class searchElement {
 public static void main(String[] args) {
    int[] a=new int[100];
    int i,n,s;
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter limit:");
    n=sc.nextInt();
    System.out.println("Enter the elements:");
	for(i=1;i<=n;i++)
	 {
	   a[i]=sc.nextInt();			
	 }
	 System.out.println("Enter element to search:");
	 s=sc.nextInt();
	   for(i=1;i<=n;i++)
	    {
			
               if(s==a[i])
	        {
				
                  System.out.println(s+" Element found at "+i+" position");
		   break;
		}
			
                if(i==n)
		   System.out.println("Element not found");
	    }
	}

}


OUTPUT
--------

C:\Users\Admin>cd Desktop

C:\Users\Admin\Desktop>cd oops

C:\Users\Admin\Desktop\oops>javac searchElement.java

C:\Users\Admin\Desktop\oops>java searchElement
Enter limit:
6
Enter the elements:
2 3 5 7 8 6
Enter element to search:
5
5 Element found at 3 position
C:\Users\Admin\Desktop\oops>


