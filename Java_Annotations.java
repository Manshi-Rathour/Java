@FunctionalInterface
interface myFunctionalInteface{
    void thisMethod();
//    void thisMethod2();
}

class NewPhone extends Phone{
    @Override
    public void showTime(){
        System.out.println("Time is 8 am");
    }
    @Deprecated
    public int sum(int a, int b){
        return a+b;
    }
}

public class Java_Annotations {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        NewPhone ph = new NewPhone();
        ph.showTime();
        ph.sum(2,3);
    }
}
