package Day14.exception;
/*
Throwable 类：
    类的特点：java中所有异常或错误的父类，exception可以继承throwable类中所有的属性和行为
    类的位置：java.lang
    类的构造器
    类的方法public void printStackTrace() 将throwable异常或者错误的详细信息进行打印
 */
public class ExceptionDemo2 {
    public static void main(String[] args) {
        //创建throwable对象
        Throwable throwable=new Throwable("自定义异常信息");
        //打印throwable对象详细信息
        throwable.printStackTrace();
        System.out.println(throwable.getMessage());
    }
}
