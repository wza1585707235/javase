package Day15.CollectionDemo1;
/*
含有泛型的类，例如arraylist
    如果想使用未确定的数据类型，需要提前进行声明，声明的格式如下：
        <未确定的数据类型>
        在类中声明泛型的格式：
            修饰符 class 类名 <泛型>{}
            需要通过这个类创建的时候，确定这个未知的数据类型，如果不确认，JVM默认object

    含有泛型的接口，例如collection
        格式：修饰符 interface 类名 <泛型>{}
        需要通过这个接口创建实现类的时候，确定这个未知的数据类型，如果不确认，JVM默认object

    含有泛型的方法：
        修饰符 <泛型>返回值类型 方法名 ()  {}
        需要在调用方法进行传参时，确定这个未知的数据类型，如果不确认，JVM默认object
 */
public class Demo5 {
    public static void main(String[] args) {
        MyList myList=new MyList();
        Test01<String> test01=new Test01<>();
        Test01 test011=new Test01();
        System.out.println(test011.getClass());


    }
}
