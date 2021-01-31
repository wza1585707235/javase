package Day14.en;
/*
 枚举类的注意事项：
    1.如果枚举类没有任何的构造器时，JVM会给其提供一个私有的默认无参的构造器，一旦任何构造器的时候JVM不再提供
    2.枚举类中的构造器的访问权限只能是private，不能是其他的访问权限，即使访问权限不写，JVM也会自动补上private
    3.枚举类中对象名的这一行必须放在类中的第一行，对象名前面有其他的代码。编译报错
    4.如果枚举类的对象是通过无参的构造器进行创建的，对象名后面的（）可以省略不写
    5.对象的默认修饰符为public static final
    6.枚举类默认隐式继承Enum类，无法继承其他类,也无法作为其他类的父类，但可以实现接口
 */

public enum EnumDemo2 {

}