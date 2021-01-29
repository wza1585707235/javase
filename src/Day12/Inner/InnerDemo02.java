package Day12.Inner;
/*
静态内部类：修饰符 class 外部类的类名{
    修饰符 static class 内部类的类名{
    }
}
特点：
    权限修饰符
        外部类：public和缺省
        内部类：四种访问权限都可以
    内部类和外部类的访问
        注意事项：避免在静态内部类中定义实例成员，如果定义实例成员，在使用的时候还需要创建内部类对象，需要内部类的话
        如果定义实例成员，定义实例内部类，如果定义静态成员，定义静态内部类
        内访问外：内部类可以访问外部类所有的静态成员
        外访问内：在外部类中可以访问内部类所有的静态成员

 */
public class InnerDemo02 {
    private static class Inner{
        static int num=10;
        static void method(){

        }

    }

}
