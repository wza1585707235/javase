package day08.sta;
/*
static
含义表示静态的，共有的，共享的
当描述一个类的时候，有个别属性被这个类创建的所有的对象所共享，需要将这个属性声明为静态的
注意事项：一旦类中的属性被static修饰，再通过对象进行调用不太合适，需要通过类名进行访问

在堆的内部，存在方法区，在方法区的内部存在静态区， 静态变量静态方法静态代码块等用
静态成员在内存中加载的特点：随着类的加载而加载，而且只加载唯一的一次

三种变量的区别：静态变量，实例变量，局部变量
代码中的位置不同：局部变量：方法内部或者声明上 实例变量：类中方法外 静态变量：类中方法外
内存中的位置不同：局部变量：栈 实例变量：堆 静态变量：静态区
默认值不同：局部变量没有默认值 实例和静态变量 有默认值
内存中的生命周期不同：局部：随着方法调用而加载，随着方法出栈而消亡 实例：随着对象的创建而加载，随着对象消亡而消亡
    静态变量：随着类的加载而加载，而且只加载一次，随着类的消亡而消亡
 */
public class Demo01 {
    public static void main(String[] args) {
        Student student1=new Student("1",18);
        Student student2=new Student("2",30);
        Student student3=new Student("3",55);

        System.out.println(student1.print());
        System.out.println(student2.print());
        System.out.println(student3.print());
    }
}
