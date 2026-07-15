import java.util.Scanner;
public class AreaCalculator {
    AreaCalculator() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Circle");
        System.out.println("2.Rectangle");
        System.out.println("3.Triangle");
        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.print("Enter radius: ");
                double r = sc.nextDouble();
                System.out.println("Area = "+ (3.14*r*r));
                break;
            case 2:
                System.out.print("Enter Length: ");
                    int l = sc.nextInt();
                System.out.print("Enter Breadth: ");
                    int b = sc.nextInt();
                System.out.println("Area = " + (l*b));
                break;
            case 3:
                System.out.print("Enter Base  : ");
                    double base = sc.nextDouble();
                System.out.print("Enter Height: ");
                    double h = sc.nextDouble();
                System.out.println("Area = "+(0.5*base*h));
                break;
            default:
                System.out.println("Invalid Choice");
        }
        sc.close();
    }
    public static void main(String[] args) {
        new AreaCalculator();
    }
}
