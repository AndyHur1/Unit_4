public class NestedLoops {
    public static String xSquare(){

        String x = "";

        for (int a=0;a<5;a++){

            for (int b=0;b<5;b++){
                x+="X";
            }
            x+="\n";
        }
        return x;
    }
    public static String xSquare2(int k){

        String x = "";
        for (int a=0;a<k;a++){
            for (int b=0;b<k;b++){
                x+="X";
            }
            x+="\n";
        }
        return x;

    }
    public static String flippedTriangle(int n){

        String x = "";
        for (int a=0;a<n;a++){

            for (int b=a;b<n;b++){
                x+="*";
            }
            x+="\n";
        }
        return x;


    }
    public static String multiplicationTable(){

        String k = "";

        for (int a=1;a<=9;a++){
            for (int b=1;b<=9;b++){
                if (a*b<10){
                    k+=" "+a*b+" ";
                }else{
                    k+=a*b+" ";
                }

            }

            k+="\n";

        }
        return k;
    }
    public static void main(String[] args){

        System.out.println(multiplicationTable());
    }
}
