public class FizzBuzz {
    public static String fizzBuzz(int num){

        String output = "";
        for (int a=1;a<=num;a++){
            if (a%20==0&&a!=1){
                output+="\n";
            }

            if (a%3==0&&a%5!=0){
                output+="Fizz ";
            }else if(a%3!=0&&a%5==0){
                output+="Buzz ";
            }else if(a%3==0&&a%5==0){
                output+="FizzBuzz ";
            }else{
                output+=a+" ";
            }

        }
        return output;

    }
    public static void main(String[] args){

        System.out.println(fizzBuzz(100));
    }
}
