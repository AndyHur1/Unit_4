import javax.swing.*;
import java.util.Scanner;

public class ForLoops {
    static Scanner scan =new Scanner(System.in);
    public static String printingHashTags(int b){
        String word = "";

        for (int a=0;b>a;a++){
            word+="#";
        }
    return word;
    }
    public static String countDown(int a, int b){

        String output = "";
        int c = b;
        for (int begin = a; begin<=b; begin++){
            output+=c+" ";
            c--;
        }
        return output;



    }
    public static String countDown2(int a, int b){

        String output = "";
        int c = b;
        int c_1 = a;
        if(b>a)
        for (int begin = a; begin<=b; begin++){

            output+=c+" ";

            c--;
        }
        else
        for (int begin_1 = b; begin_1<=a; begin_1++){

            output+=c_1+" ";

            c_1--;
        }


        return output;

    }
    public static int sumNumbers(int a,int b){
        int set_1 = a;
        int set_2 = b;
        int sum=0;
        for (int begin = a; begin<=b; begin++){
            sum+=set_1;
            set_1++;
        }
        for (int begin = b; begin<=a; begin++){
            sum+=set_2;
            set_2++;
        }
        return sum;
    }




    public static void main(String[] args){

        System.out.println(countDown2(10,10));
    }
}
