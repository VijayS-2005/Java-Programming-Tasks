import java.util.Scanner;
public class Temperature1 {
    Temperature1(double c){
        double f = (c * 9 / 5) + 32;
System.out.println("Fahrenheit = " + f);
    }
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Celsius: ");
        double c = sc.nextDouble();
        new Temperature1(c);
        sc.close();
    }
}
