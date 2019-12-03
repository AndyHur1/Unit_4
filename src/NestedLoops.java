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
    public static void main(String[] args){

        System.out.println(xSquare());
    }
}
