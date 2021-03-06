package Day12.Inner;
/*
局部内部类：
    修饰符 class 外部类的类名{
        修饰符 返回值类型 方法名(){
            修饰符 class 内部类类名{
            }
        }
    }
局部内部类的特点：
    1.权限修饰符
        外部类：public和缺省
        内部类：只能缺省
    2.创建对象的方式：
        只能在局部内部类所在的实例方法中创建对象
    3.外部类和内部类的访问
        a.内部类可以访问外部类所有的实例成员，但外部类的局部变量不能定义成私有
        b.外部类的局部变量和内部类的变量发生同名的时候，在内部类中无法访问外部类的局部变量
        c.在内部类中不可以给内部类所在的外部类的局部变量重新赋值，因为这个量在内部类中会被当作常量进行使用

       外访问内：
         在其他方法中，无法进行访问，需要在局部内部类所在的方法中进行访问
 */
public class InnerDemo03 {
    private int age=20;
    int ff=20;
    public void method(){
        int a=10;
        int b=20;
        String str="asss";
        class inner{
            int a=10;
            public void tesy(){
                System.out.println(age);
                System.out.println(a=10);
            }
        }
    }

}

