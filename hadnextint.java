import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class hadnextint {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc= new Scanner(System.in);
        Boolean b= sc.hasNextInt();
        System.out.println(b);

    }
}
