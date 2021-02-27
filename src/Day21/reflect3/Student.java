package Day21.reflect3;

public class Student {
    public String method1(){
        return "无参有返回值的方法";
    }
    public void method2(){
        System.out.println("无参无返回值的方法");
    }
    public String method3(String name){
        System.out.println("!!!");
        return name;
    }
}
