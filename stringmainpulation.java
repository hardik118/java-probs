import java.util.Scanner;

public interface stringmainpulation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the name ");
        String  com = sc.next();
        if(com.endsWith(".org") )
        {System.out.println("its  a organization");}
        else if (com.endsWith(".com")){
            System.out.println("iys a company");
        }
        else if (com.endsWith(".in")){
            System.out.println("its an indian webiste");
        }

    }
}
