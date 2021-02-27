package Test;

public class Test11 {
    private static Test11 a;
    private Test11(){

    }
    public  Test11 getA(){
        if (a==null){
            return method();
        }else return a;
    }

    private synchronized Test11 method() {
        return new Test11();
    }
}
