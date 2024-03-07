public class FinallyBlock {

    public static int greet(){
        try{
            int a = 10;
            int b = 2;
            int c = a/b;
            return c;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Cleaning up resources....This is the end of this function");
        }
        return -1;
    }

    public static void main(String[] args) {
        int k = greet();
        System.out.println(k);

        int a = 10;
        int b = 9;
        while(true){
            try{
                System.out.println("a/b : " + a/b);
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("I am finally for value of b = " + b);
            }
            b--;
        }
    }

}
