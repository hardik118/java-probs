import java.util.Scanner;

public class praticeset4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        byte  sal= sc.nextByte();
        if (sal>2.5 && sal<5) {
            System.out.print(sal - sal * 0.5);
            System.out.println("one");
        }
        else if (sal>5&& sal<10) {
            System.out.println(sal-sal*0.20);
            System.out.println("second");
        } else if (sal>10) {
            System.out.println(sal-sal*.30);
            System.out.println("third");

        }


    }
}
