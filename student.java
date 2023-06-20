public class student {
    int roll_no;
    String name;
    void insertRecord(int r,String n){
        roll_no=r;
        name=n;
    }
void displayInformation(){System.out.println(roll_no+" "+name);}
public static void main(String[] args) {
    student s1=new student();
    student s2=new student();
    s1.insertRecord(101,"Akshay");
    s2.insertRecord(102,"Aljo");
    s1.displayInformation();
    s2.displayInformation();
}
}