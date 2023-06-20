import java.util.Scanner;

public class TwodArray{
    
    public static void main(String args[]){
        
       System.out.print("Enter 2D array row size : ");
       Scanner sc=new Scanner(System.in);
       int rows=sc.nextInt();
       System.out.print("Enter 2D array collumn size : ");
       int columns=sc.nextInt();
       
       System.out.println("Enter array elements : ");    
        
       int twoD[][]=new int[rows][columns];
        
          
        for(int i=0; i<rows;i++)
         {            
            for(int j=0; j<columns;j++)
            {
                twoD[i][j]=sc.nextInt(); 
            }
         }
        System.out.print("\nThe Array Is : \n");
        for(int []x:twoD){
            for(int y:x){
            System.out.print(y+"        ");
            }
            System.out.println();
        }
        
    }  
    
}