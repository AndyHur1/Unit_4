import javax.swing.*;
import java.util.Scanner;

public class FromHereToThere {
    public static String fromHereToThere (int a, int b){
        String output= " ";
        if (a>b) {
            return "Invalid input";
        }else
            while(a<b){
                ++a;
            output+= a+" ";}
        return output;


    }
    public static String factors(int a) {
        String output = " ";
        int y = 1;
        while (a >= y) {
            if (a % y == 0)
                output += y + " ";
            ++y;
        }
        return output;
    }
    public static String countPosAndNeg(){
        int negative_num=0;
        int positive_num=0;
        Scanner scan = new Scanner(System.in);
        int f_num=1;
        while (f_num!=0){
            System.out.println("Enter a positive or negative number or 0 to quit:");
            int l_num = scan.nextInt();
            if(l_num>0){
                positive_num++;}
            else {
                negative_num++;
            }
            }
        return "There were "+positive_num+" positive and "+negative_num+" negative numbers."
        ;
    }




    public static void main(String[] args){
        System.out.println(countPosAndNeg());
    }
}
