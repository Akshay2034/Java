import java.util.Scanner;
class Array{
    int mark[];
    void Readarray(){
        mark=new int[]{100,200,300};
    }
    void printArray(){
        System.out.println("array elements are:");
        for (int i=0;i<mark.length;i++)
        System.out.println(mark[i]);
    }
    public static void main(String[] args) {
        Array obj=new Array();
        obj.Readarray();
        obj.printArray();
    }
}