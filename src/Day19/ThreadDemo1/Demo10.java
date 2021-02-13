package Day19.ThreadDemo1;
/*
    设计模式 和 框架 区别
        设计模式：解决某一问题的通用手段
        框架：半成品的项目

单例设计模式：
    解决只创建唯一的对象的方式

立即加载(饿汉式)
    私有化构造器
    在成员的位置上创建唯一的对象，并且用static final进行修饰
    将唯一的对象进行私有化，对外提供公共的访问方式

延迟加载(懒汉式)
    私有化构造器
    定义唯一的对象 不进行初始化 用static进行修饰
    将唯一的对象初始化变量
 */
public class Demo10 {
    public static void main(String[] args) {
        System.out.println(CEO.getCeo());
    }
}
