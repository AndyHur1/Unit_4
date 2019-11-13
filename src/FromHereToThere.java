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
    public static void main(String[] args){
        System.out.println(fromHereToThere(20,30));
    }
}
