import java.util.Scanner;
class MatrixAdd{
public static void main(String args[])
{
int row, collumn,i,j;
Scanner in = new Scanner(System.in);
System.out.println("Enter the number of rows");
row = in.nextInt();
System.out.println("Enter the number columns");
collumn = in.nextInt();
int matrix1[][] = new int[row][collumn];
int matrix2[][] = new int[row][collumn];
int result[][] = new int[row][collumn];
System.out.println("Enter the elements of matrix1");
for ( i= 0 ; i < row ; i++ )
{
for ( j= 0 ; j < collumn ;j++ )
matrix1[i][j] = in.nextInt();
System.out.println();
}
System.out.println("Enter the elements of matrix2");
for ( i= 0 ; i < row ; i++ )
{
for ( j= 0 ; j < collumn ;j++ )
matrix2[i][j] = in.nextInt();
System.out.println();
}
for ( i= 0 ; i < row ; i++ )
for ( j= 0 ; j < collumn ;j++ )
result[i][j] = matrix1[i][j] + matrix2[i][j] ;
System.out.println("Sum of matrices:-"); 
for ( i= 0 ; i < row ; i++ )
{
for ( j= 0 ; j < collumn ;j++ )
System.out.print(result[i][j]+"\t");
System.out.println();
}
}
}