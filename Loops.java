public class Loops {
    public static void main(String[] args) {

        // While loop
        System.out.println("While Loop:");
        int i = 100;
        while(i<=120){
            System.out.println(i);
            i++;
        }
        System.out.println("Finish Running While Loop!");


        // do while loop
        System.out.println("Do While Loop:");
        int b = 10;
        do {
            System.out.println(b);
            b++;
        }while(b<15);
        System.out.println("Finish Running Do While Loop!");


        // For Loop
        System.out.println("For Loop:");
        for(int j=0; j<5; j++){
            System.out.println(j);
        }
        System.out.println("Finish Running For Loop!");


        // Break and Continue
        System.out.println("Using break statement:");
        for(int k=10;k>0;k--){
            if(k==7){
                break;   //break the loop
            }
            System.out.println(k);
        }

        System.out.println("Using continue statement:");
        for(int n=7;n>0;n--){
            if(n==3){
                continue;   //continue skips the rest statement
            }
            System.out.println(n);
        }

    }
}
