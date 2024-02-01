public class Array {
    public static void main(String[] args) {
        // Declaration and memory allocation
        int [] marks = new int[5];
        // Initialization
        marks[0] = 2;
        marks[1] = 3;
        marks[2] = 4;
        marks[3] = 5;
        marks[4] = 6;


        // Declaration then memory allocation
        int [] marks1;
        marks1 = new int[5];
        // Initialization
        marks1[0] = 2;
        marks1[1] = 3;
        marks1[2] = 4;
        marks1[3] = 5;
        marks1[4] = 6;


        // Declaration, Memory allocation then Initialization
        int [] marks2 = {2, 3, 4, 5, 6};

        System.out.println(marks2[4]);


        // Displaying the Array (Naive way)
        System.out.println("Printing using Naive way");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        // Displaying the Array (for loop)
        System.out.println("Printing using for loop");
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }

        // Displaying the Array in Reverse order (for loop)
        System.out.println("Printing using for loop in reverse order");
        for(int i=marks.length -1;i>=0;i--){
            System.out.println(marks[i]);
        }

        // Displaying the Array (for-each loop)
        System.out.println("Printing using for-each loop");
        for(int element: marks){
            System.out.println(element);
        }

    }
}
