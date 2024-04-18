package com.company;

public class Method_tags_for_Generating_Java_doc {
    /**
     *
     * @param args These are the parameter arguments supplied to the command line
     */
    public static void main(String[] args) {
        System.out.println("It is a main method");
    }

    /**
     * This is a method
     * @param i This is the first number to add
     * @param j This is the second number to add
     * @return Sum of two numbers as an integer
     * @throws Exception if i is 0
     * @deprecated This method is deprecated please use + Operator
     */
    public int add(int i, int j) throws Exception{
        if(i==0){
            throw new Exception();
        }
        int c;
        c= i+ j;
        return c;
    }
}
