import java.util.Scanner;

public class sumofnevenumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of numbers upto which  you want  to  print the sum of  even numbers ");
        int n = sc.nextInt();
        int num =0;
        int sum=0;
        int count = 0;
        while (n > count){



                    num=2+num;
                    sum=sum+num;
                    count++;

        }
        System.out.println(sum);


    }
}
