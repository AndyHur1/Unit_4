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
        int f_num=1;
        Scanner scan = new Scanner(System.in);

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
            Scanner scan =new Scanner(System.in);
            System.out.print("Number: ");
            int num_1 = scan.nextInt();
            if (num_1>max_value)
                max_value=num_1;
            else if (num_1<min_value)
                min_value=num_1;
            num++;
        }
        return "Max Value is: "+max_value+"\n"+"Min Value is: "+min_value;
    }
    public static String gradePoint(){
        int num = 0;
        double grade_num = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter seven letter grades (A, B, C, D, or F)");
        while(num<7){
            String grade = scan.next();
            if (grade=="A")
                grade_num+=4.0;
            else if (grade=="B")
                grade_num+=3.0;
            else if (grade=="C")
                grade_num+=2.0;
            else if (grade=="D")
                grade_num+=1.0;
            else if (grade=="F")
                grade_num+=0.0;
            else
                System.out.println("Invalid grade");
        }
        double avg_grade = grade_num/7;
        return "GPA = "+avg_grade;
    }




    public static void main(String[] args){
        System.out.println(gradePoint());
    }
}
