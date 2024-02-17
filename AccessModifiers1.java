class Class{
    public int a = 2;
    protected int b = 4;
    int c = 6;
    private int d = 8;

    public void  meth(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

public class AccessModifiers1 {
    public static void main(String[] args) {
        Class c = new Class();
        c.meth();
        System.out.println(c.a);
        System.out.println(c.b);
        System.out.println(c.c);
        //System.out.println(c.d);  --> can't access private member of other class
    }
}

/*
Access Modifier	    within class	  within package	  outside package by subclass only	   outside package

public	                  Y	                Y	                         Y	                        Y
protected	              Y	                Y	                         Y	                        N
Default	                  Y	                Y                            N                          N
private	                  Y	                N	                         N	                        N

 */