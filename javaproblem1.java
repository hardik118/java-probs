import java.util.Scanner;

public class javaproblem1 {
    public static void main(String[] args) {
        System.out.println(" enter your marks in sub1");
        Scanner sc= new Scanner(System.in);
        byte sub1= sc.nextByte();
        System.out.println(" enter the marks of your sub2");
        byte sub2 = sc.nextByte();
        System.out.println("entre your marks  fo sub3");
        byte sub3= sc.nextByte();
        System.out.println("enetr yur ,marks  of sub4 ");
        byte  sub4= sc.nextByte();
        System.out.println("enter your marks of sub 5");
        byte sub5 =sc.nextByte();
        float per =(sub1+sub2+sub3+sub4+sub5)/5;
        System.out.println(per);

    }

}
