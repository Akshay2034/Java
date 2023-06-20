// import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;
public class Sort {
    public static void main(String[] args) {
        String temp;
        Scanner obj= new Scanner(System.in);
        System.out.print("enter the total number of student:");
       int n=obj.nextInt();
        String number[]=new String[n];
        System.out.println("enter all athe names");
        for(int i=0;i<n;i++){
            number[i]=obj.next();
        }
            for(int i=0;i<n;i++){
                
            for(int j=0;j<n;j++){
                if(number[i].compareTo(number[j])<0){
                    temp=number[i];
                    number[i]=number[j];
                    number[j]=temp;
                }
        }
        
        }
        System.out.println("Sorted array");
        for(int i=0;i<n;i++){
            System.out.println(number[i]);
        }
    }
    
    }
