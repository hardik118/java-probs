import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class rockpaperscissor {
    public static void main(String[] args) {
        Random rad = new Random();
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your choice");
        String user = sc.next();
        int num= rad.nextInt(3);
        //System.out.println(" here in this game 0 for rock 1 for paper and 2for scissor");
        String computer;
        switch (num) {
            case 0:

                computer = "rock";
                System.out.println("computer choice is rock");
                break;


            case 1:
                computer = "paper";
                System.out.println("computer chouce os paper");
                break;
            case 2 :
                computer = "scissor";
                System.out.println("computer chouce is scissor");
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + num);
        }

            if (computer.equals(user)) {
                System.out.println("the match is drawn");
            }
            else if (computer.equals("rock") && user.equals( "paper")) {
                System.out.println(" user paper is won");
            } else if (computer.equals("rock") && user.equals("scissor")) {
                System.out.println("rock is won");
            } else if (computer.equals("paper") && user.equals("rock")) {
                System.out.println("paper is won");
            } else if (computer.equals("paper") && user.equals("scissor")) {
                System.out.println(" user scissor is won");
            } else if (computer.equals("scissor") && user.equals("rock")) {
                System.out.println(" user rock is won");
            } else if (computer.equals("scissor") && user.equals("paper")) {
                System.out.println("scissor is won");
            }




    }

}
