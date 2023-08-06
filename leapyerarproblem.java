import javax.print.DocFlavor;
import java.util.Scanner;

public class leapyerarproblem {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int lp =sc.nextInt();
        if (lp%4==0 && lp%100!=0||lp%400==0) {
            System.out.println("the guc3n year is a leap year");
        }
        else {
            System.out.println("the gicen year is not  A leap year");
        }

    }
}
