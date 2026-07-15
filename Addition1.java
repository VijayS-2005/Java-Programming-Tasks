import java.util.Scanner;
public class Addition1 {
    int a, b;
Addition1(int x, int y){
    a = x;
    b = y;
}
void add() {
    System.out.println("Addition = " +(a + b));
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter First Number: ");
    int x = sc.nextInt();
    System.out.print("Enter Second Number: ");
    int y = sc.nextInt();
    Addition1 obj = new Addition1(x, y);
    obj.add();
    sc.close();
}
}