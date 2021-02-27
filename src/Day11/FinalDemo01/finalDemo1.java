package Day11.FinalDemo01;
/*
final关键字：
    不可改变的，最终的
    当final关键字修饰类的时候，该类不可以被继承
        注意：abstract关键字和final关键字不可以同时修饰一个类
    当final关键字修饰方法时，该方法不可以被子类重写
        注意：abstract关键字和final关键字不可以同时修饰一个方法(abstract要求必修重写 final不能重写）
    当final关键字修饰变量的时候，该变量不可以被重新赋值
        当一个变量被声明为final类型的时候，其实就是一个自定义常量
        常量名：全部大写且多个单词时每个单词间用下划线连接
        局部变量：被final修饰不可以被重新赋值
        实例变量：当final修饰实例变量的时候
                如果是直接赋值的话，不会先初始化默认值，而且不可以被重新赋值
                如果是先定义后赋值的话，需要在所有的构造器中进行初始化
        静态变量：
            当final关键字修饰静态变量的时候，
            如果是直接赋值的话，不会先初始化默认值，而且不可以被重新赋值
            如果是先定义后赋值的话，需要在唯一的静态代码块中进行赋值
 */
public class finalDemo1 {
    private final int number;
    private static final int number1;
    public finalDemo1(){
        number=10;
    }
    public finalDemo1(String s){
        number=20;
    }
    static {
        number1=20;
    }

    public static void main(String[] args) {
        int a;
        a=20;
    }
}
