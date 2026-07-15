import java.util.Scanner;
public class NumberCheck {
    NumberCheck(int num) {
        if (num > 0)
            System.out.println("Positive Number");
        else if (num < 0)
            System.out.println("Negative Number");
        else
            System.out.println("Zero");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  a Number: ");
        int num = sc.nextInt();
        new NumberCheck(num);
        sc.close();
    }
}