package Day22.java8Demo1;

import java.util.function.Function;
import java.util.function.Supplier;

/*
this的实例方法引用：
    Lambda表达式格式：
        (参数) -> this.(参数)
    this引用格式：
        this::实例方法名
super的实例方法引用：
    Lambda表达式格式：
        (参数) -> super.(参数)
    super引用格式：
        super::实例方法名

构造器引用：
    对象引用
        lambda表达式的格式
            (参数)->new 类名(参数)
        对象引用的格式：
            类名::new
    数组引用
        Lambda表达式的格式：
            数组长度参数->new 元素数据类型[数组长度参数]
        数组引用的格式：
            元素数据类型[]::new
 */
public class Demo11 {
    public static void main(String[] args) {
        method(()-> new Student());
        method(Student::new);
        method(length -> new Student[length],3);
        method(Student[]::new,3);
    }
    public static void method(Supplier<Student> supplier){
        Student student = supplier.get();
        System.out.println(student);
    }
    public static void method(Function<Integer,Student[]> function,int length){
        function.apply(length);
    }
}
