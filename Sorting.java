import java.util.*;
public class Sorting {
    public static void main(String args[]){
    int n;
    String temp;
    Scanner s=new Scanner(System.in);
    System.out.println("enter the number of names you want to insert");
    n=s.nextInt();
    String names[]=new String[n];
    Scanner s1=new Scanner(System.in);
    System.out.println("enter the names");
    for(int i=0;i<n;i++){
        names[i]=s1.next();
    }
    for (int i=0;i<n;i++)
    {
        for (int j=i+1;j<n;j++)
        {
            if (names[i].compareTo (names[j])>0)
            {
              temp=names[i];
              names[i]=names[j];
              names[j]=temp;

            }
        }
    }
    System.out.println("names is sorted order");
    for(int i=0;i<n;i++){
        System.out.println(names[i]);
    }
        
    }

}
