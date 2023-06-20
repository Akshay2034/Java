public class stringman {
    public static void main(String args[])
    {
        String a1="c";
        String a2="d";
        String s1="welcome to the world of python";
        String s2=new String("java is simple");
        String s3=s1+s2;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s1.length());
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.substring(0,5));
        System.out.println(s1.equals(s2));
        System.out.println(s1.replace('o','a'));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.getBytes());
        System.out.println(s3.trim());
        System.out.println(s1.startsWith("welcome"));
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a1.compareTo(a2));


    }
    
}
