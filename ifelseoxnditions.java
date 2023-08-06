import java.util.Scanner;

public class ifelseoxnditions {
    public static void main(String[] args) {
       /* int a =17;
        if(a>18){
            System.out.println("yes the person can drive ");
        }
        else {
            System.out.println(" no the person cannot drive ");
        }
        switch (a){
            case 17 -> System.out.println("age is not considerable for driver license ");
            case 18 ->System.out.println("age is apporpirae fro drice lic3nae0000");
            case 19 ->System.out.println("yess");




        }
        int a=10;
        if(a=11){
            System.out.println("yes");
        }
        else{
            System.out.println("no");*/
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the marks fo all the studentsb");
        int sub1= sc.nextInt();
        int sub2= sc.nextInt();
        int sub3=sc.nextInt();
        float tot= (sub1+sub2+sub3)/3;
        System.out.println("total marks are 100 ");
        System.out.println(tot);
        if (sub1>33 && sub2>33 && sub3>33 && tot>40) System.out.println("student is [ass");
        else{
            System.out.println("not pass");
        }





        }
    }


