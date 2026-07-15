import java.util.Scanner;
public class Swap {
    Swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping");
        System.out.println("a = " +a);
        System.out.println("b = " +b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();
        new Swap(a,b);
        sc.close();
    }
}