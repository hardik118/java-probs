import java.util.Scanner;

public class tabeofuserneteresnum {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        for(int i=10;i>=1;i--){
            System.out.printf("%d X %d =%d",i,n,i*n);
            System.out.println();
        }
    }
}
