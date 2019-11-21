import javax.swing.*;
import java.util.Scanner;


public class WhileLoops {
    static Scanner scan =new Scanner(System.in);
    public static String fromHereToThere (int a, int b){
        String output= "";
        if (a>b) {
            return "Invalid input";
        }else
            while(a<=b){

            output+=a+" ";
                ++a;}

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
        return "The factors of "+a+" are:"+output;
    }
    public static String countPosAndNeg(){
        int negative_num=0;
        int positive_num=0;
        int f_num=1;

        while (f_num!=0) {
            System.out.println("Enter a positive or negative number or 0 to quit:");
            f_num=scan.nextInt();
            if (f_num > 0)
                positive_num++;
            else if (f_num<0)
                negative_num++;
        }
            return "There were " + positive_num + " positive and " + negative_num + " negative numbers.";

    }
    public static String findMinAndMax()
        {
        int num = 0;
        int max_value = Integer.MIN_VALUE;
        int min_value = Integer.MAX_VALUE;
        while(num<5){
            System.out.print("Number: ");
            int num_1 = scan.nextInt();
            if (num_1>max_value)
                max_value=num_1;
            else if (num_1<min_value)
                min_value=num_1;
            num++;
        }
        return "Max value is: "+max_value+"\n"+"Min value is: "+min_value;
    }
    public static double gradePoint() {
        int num = 0;
        double grade_num = 0;

        System.out.println("Enter seven letter grades (A, B, C, D, or F)");
        while (num < 7) {
            String grade = scan.next();
            if (grade.equals("A"))
                grade_num += 4.0;
            else if (grade.equals("B"))
                grade_num += 3.0;
            else if (grade.equals("C"))
                grade_num += 2.0;
            else if (grade.equals("D"))
                grade_num += 1.0;
            else if (grade.equals("F"))
                grade_num += 0.0;
            else
                System.out.println("Invalid grade");
            num++;
        }
        double avg_grade = grade_num / 7;
        double final_gpa= (int) ((avg_grade * 100) + 0.5);
        return final_gpa/100;


    }
    public static void main(String[] args){
        System.out.println(fromHereToThere(10,10));
        System.out.println(factors(17));
    }
}
