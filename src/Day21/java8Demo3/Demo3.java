package Day21.java8Demo3;
/*
lambda表达式的使用前提条件：
    1.代码需要可以写成匿名内部类的形式
    2.接口中的抽象方法有且仅有一个(java8中的特殊接口：函数式接口)
 */
public class Demo3 {
    public static void main(String[] args) {
        InterfaceA interfaceA=new InterfaceA() {
            @Override
            public void print(String str) {
                System.out.println(str);
            }
//
//            @Override
//            public void method() {
//                System.out.println("method方法");
//            }
        };
        interfaceA.print("HelloWorld");

        InterfaceA interfaceA1=(str) -> {
            System.out.println(str);
        };
        interfaceA1.print("123");
    }
}
