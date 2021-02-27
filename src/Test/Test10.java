package Test;

public class Test10 {
    private static final Test10 a=new Test10();
    private Test10(){

    }
    public synchronized Test10 geta(){
        return a;
    }
}
