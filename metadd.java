import java.util.Scanner;
class metadd{
    int[][]arr;
    int[][]akk;
    int[][]abb;
        
    void read(){
        arr=new int[2][2];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter element of first array");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                arr[i][j]=sc.nextInt();
            }
        } 
        akk=new int[2][2];
        Scanner ss=new Scanner(System.in);
        System.out.println("enter element of first array");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                akk[i][j]=ss.nextInt();
            }
            }

    }
        
    void print(){
        System.out.println("1st Array is");
        for(int i=0;i<2;i++){

            for(int j=0;j<2;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("2nd Array is");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(akk[i][j]+" ");
            }
            System.out.println();
        }
            
        
    }
    void add(){
        abb=new int[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                abb[i][j]=arr[i][j]+akk[i][j];
            }
        }
         
    }
    void printresult(){
        System.out.println("The Resultant Array is");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.err.print(abb[i][j]+" ");
            }
            System.out.println();
        }
    }
     
   
        
        
            
public static void main(String[] args) {
    metadd obj=new metadd();
    obj.read();
    obj.print();
    obj.add();
    obj.printresult();
    


}
}

