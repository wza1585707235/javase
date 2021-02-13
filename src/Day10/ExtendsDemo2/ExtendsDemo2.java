package Day10.ExtendsDemo2;
/*
Object类：
    类的特点：是所有类的顶级父类，所有的对象，数组都可以调用object类中的方法
              所有的接口都会继承object类的接口形式
    类的位置：java.lang
    类的构造器：有无参的构造器，但是平时一般情况下不会通过这个构造器进行对象的创建，
               直接通过程序中的对象来直接使用该类中的方法
    类的方法
        public boolean equals(Object obj)


==和equals的区别：
    ==如果 比较基本数据类型的时候，比较的是数据值
        既可以比较基本数据类型 也可以比较引用数据类型
        比较引用数据类型的时候，比较的是地址值
     equals：只能比较引用数据类型
            使用equals比较数组或对象时，比较的是内存地址值
            如果调用的equals是重写object类方法的，需要按照重写后的规则进行比较

toString（）:
    1.打印对象名或者数组名的时候，如果没有合适的方法，默认调用的自己的toString方法
    2.printstream中提供了char[]的toString的重载

                public     protected    缺省    private
在同一个类中     yes           yes        yes       yes
在同一个包        yes          yes        yes       no
不同包有关系      yes          yes        no         no
不同包无关系      yes          no         no         no

public修饰的内容在同一个项目中都有效
如果某些数据需要进行跨项目使用，需要序列化（io流）

四种访问权限的应用：
    类文件(class,enum,interface)
        访问权限：只能使用public和缺省
        注意事项：在一个.java文件中，只允许有一个类文件被public修饰
    成员变量
        访问权限：private
    自定义常量：
        定义在类中 推荐使用private
        定义在接口中  只能使用public
    成员方法
        如果是普通方法，推荐使用public
        如果是向上抽取方法，推荐使用private
    构造器
        如果是普通类，推荐使用权限是public
        如果是工具类，推荐使用private，将方法声明为静态
    构造器代码块
        访问权限：推荐使用缺省
    静态代码块
        访问权限：推荐使用缺省

        局部变量：推荐权限缺省











 */
public class ExtendsDemo2 {
    public static void main(String[] args) {
        int[] array=new int[]{1,2,3,4,5};
        System.out.println(array);
        char[] chars=new char[]{'a','b'};
        System.out.println(chars);
    }
}
