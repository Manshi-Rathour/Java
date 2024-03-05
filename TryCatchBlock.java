public class TryCatchBlock {
    public static void main(String[] args) {
        int a = 500;
        int b = 5;
        int c = 0;

//        int d = a/c;
//        System.out.println("The result of a/b is : " + d);

        try{
            int d = a/c;
            System.out.println("The result of a/b is : " + d);
        }
        catch (Exception e){
            System.out.println("We failed to divide. Reason:");
            System.out.println(e);
        }

        System.out.println("End of the program.");
    }
}
