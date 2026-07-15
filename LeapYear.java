import java.util.Scanner;
public class LeapYear {
    LeapYear(int year) {
        if((year % 400 == 0) || (year % 4 == 0 && year % 100!= 0))
            System.out.println(year + " is Leap Year ");
        else
            System.out.println(year + " is Not Leap Year ");
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Year: ");
            int year = sc.nextInt();
            new LeapYear(year);
            sc.close();
        }
    }    