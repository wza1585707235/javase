package Day13.IntegerDemo1;
/*
基本数据类型和字符串之间的转换
    将基本数据类型转换为字符串类型
        1.字符串连接符 +
        2.将基本数据类型转换为包装类型，再使用包装类型的实例方法toString转换为字符串类型
        3.使用包装类型的静态方法toString(基本数据类型)
        4.使用String类的静态方法valueOf(基本数据类型)
    将字符串类型转换为基本数据类型
        1.包装类型的构造器，再将包装类型做自动拆箱
        2.包装类型的静态方法parseInt
            character类并没有提供parsechar的方法
 */
public class IntegerDemo2 {
    public static void main(String[] args) {
        int num01=new Integer("123");
        System.out.println(num01);
    }

}
