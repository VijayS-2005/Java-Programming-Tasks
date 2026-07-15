import java.util.Scanner;
public class PersonalDetails1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
            String name = sc.nextLine();
        System.out.print("Enter Your Age : ");
              int age = sc.nextInt();
              sc.nextLine();
        System.out.print("Enter Your City: ");
            String city = sc.nextLine();
        System.out.println("\n------Personal Details ------");
    System.out.println("Name : " +name);
    System.out.println("Age  : " +age);
    System.out.println("City : " +city);
    sc.close();
    }
}