import java.util.Scanner;

public class Piglet {


    public static void main(String[] args){

        System.out.println("Welcome to Piglet!");
        int piglet_number = (int) (Math.random()*6+1);
        Scanner scan = new Scanner(System.in);
        int total_score = 0;
        if (piglet_number!=1)
            while (piglet_number!=1) {
                System.out.println("You rolled a " + piglet_number + "!");
                System.out.println("Roll Again?");
                String user_choice = scan.next();
                if (user_choice.equals("yes")) {
                    total_score += piglet_number;

                } else if (user_choice.equals(("no"))) {
                    total_score += piglet_number;
                    System.out.println("You got " + total_score + " points.");
                } else
                    System.out.println("Invalid Response");
            }
        while (piglet_number == 1){
            System.out.println("You rolled a "+piglet_number+"!");
            System.out.println( "You got 0 points.");
        }

    }
}
