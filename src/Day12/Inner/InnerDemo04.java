package Day12.Inner;
/*
匿名内部类：
    没有名字的局部内部类(接口的实现类)
学习匿名内部类的目的：
    简化接口的使用
    学习lambda表达式的前提条件

格式：修饰符 class 外部类类名(测试类){
        修饰符 返回值类型 方法名(){
            接口名 实现类对象 =new 接口名(){
                该接口实现类的类体;
            };
        }


 */
public class InnerDemo04 {
    public static void main(String[] args) {
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println("重写runable");
            }
        };
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("112233");
            }
        });
    }
}
