import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter the numnber for the day");
        byte con =sc.nextByte();
        switch(con){
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("tuesday");
            case 3-> System.out.println("wed");
            case 4-> System.out.println("thur");
            case 5-> System.out.println("fri");
            case 6 -> System.out.println("satur");
            case 7-> System.out.println("sunday");
        }
    }
}
