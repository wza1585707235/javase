package Day10.ExtendsDemo1;
/*
继承的好处：提高代码的复用性，从而提高开发效率
            提高代码的扩展性
            类与类之间产生了关系，是学习多态的前提条件

继承的·理解：所谓继承就是子类继承父类所有的属性和行为，使得子类对象具有与父类相同的属性和行为
继承关系中成员的特点：
            私有成员:子类可以继承父类的所有私有成员，但是子类不可以直接使用，如果需要使用的话，需要借助set和get方法
            实例变量：子类可以继承父类的所有实例变量，当父类的实例变量和子类的实例变量发生同名的情况下，
                        需要使用super关键字进行区分
            实例方法：子类对象可以继承父类所有的实例方法
            方法的重载：在同一个类中或者子父类继承关系中，出现方法名相同形参列表不同的现象
            方法的重写：在子父类继承关系中或者实现关系中，出现了权限修饰符和返回值类型遵循相关规则且
                        方法名相同形参列表也相同的现象
                        特点：子类重写后的方法的权限必须大于等于父类方法的权限
                                当父类方法的返回值类型为void时，子类重写后的方法的返回值类型也必须为void
                                当父类方法返回值类型为基本数据来类型时，子类重写后的方法的返回值也必须相同
                                返回值类型为引用数据类型时，子类重写方法的返回值可以和父类方法返回值类型相同
                                也可以是父类方法返回值类型的子类类型（多态）
            构造器：1.子类无法继承父类的构造器，因为构造器的名字要与类名相同
                    当子类的构造器没有任何的this（）,super()时，JVM会自动分配一个默认无参的super()
                    当这个构造器有this()，super（）时，JVM不再进行分配
                    2.this（）和super（）必须放到子类构造器的第一行，二者不可以同时使用

            静态成员：子类可以继承父类中所有的静态成员，静态方法也支持重写的规则(一般情况下也不会使用)
super关键字的第一种用法：
    应用场景：子类的实例方法中或者子类的构造器中
    格式：super.实例变量名 super.实例方法名
    作用：用来区分子父类关系中同名的实例成员
    含义：那个对象调用了super所在的实例方法或构造器，super就代表哪个对象的父类对象

this的第二种用法：
    应用场景：子类的构造器中
    格式：this(实参)
    作用：自己本身构造器无法初始化对象，需要借助本类中其他的构造器初始化对象

super的第二种用法：
    应用场景：子类的构造器中
    格式：super（实参）
    作用：调用当前类的父类对应的构造器

注解：给程序中相应的包，类，接口，方法，变量等进行语法约束 紧箍咒
    方法重写的注解
    格式：子类重写方法的上面@override

方法重写的注意事项：父类的私有方法不可以重写，就算子类中含有和父类私有方法同名的方法，且权限修饰符，返回值类型符合相应
规范，且形参列表也相同的情况下，也不会构成方法的重写

注意事项：1.java语言只支持单继承，不支持多继承。
         2.java语言支持多层继承
         3.一个类只能拥有一个直接父类 父类和子类是个相对的概念
         4.所有的类都拥有一个顶级父类Object

 */
public class Demo01 {
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.catchmouse();
    }
}
