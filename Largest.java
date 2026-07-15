import java.util.Scanner;
public class Largest {
    Largest(int a,int b,int c) {
        if (a > b && a > c) 
            System.out.println( a + " is Largest ");
        else if( b > a && b > a)
            System.out.println( b + " is Largest ");
        else
            System.out.println( c + " is Largest ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a = sc.nextInt();
        System.out.print("Entre  Second  Number: ");
        int b = sc.nextInt();
        System.out.print("Enter Third Number: ");
        int c = sc.nextInt();
        new Largest(a , b ,c);
        sc.close();
    }
}
