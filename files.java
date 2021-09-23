import java.io.*;
import java.util.*;
public class files {
  public static void main(String[] args) throws Exception {
     int i=0;

     FileInputStream fin = new FileInputStream("integers.txt");
     FileOutputStream feven = new FileOutputStream("even.txt");
     FileOutputStream fodd = new FileOutputStream("odd.txt");
    
     while((i=fin.read())!=-1) 
     {
      if(i%2==0)
      {
      feven.write(i);
     }
      else
      fodd.write(i);
     }
    
     fin.close();
     feven.close();
     fodd.close();

      }

    }
