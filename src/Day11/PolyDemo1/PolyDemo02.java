package Day11.PolyDemo1;
/*
多态的好处1：作为形参的使用
多态的好处2：多态数组
多态的弊端：对象被声明为父类的类型，所以无法调用子类特有的方法
解决方案：引用数据类型的类型转换
            自动类型转换 (向上转型)将子类类型(实现类)的对象转换为父类(接口)类型的对象(多态的格式)
            强制类型转换  (向下转型) 将父类类型的对象转换为子类类型的对象
                                  子类类型 对象名 =(子类类型)对象名

引用数据类型强制类型转换的问题：classcastException 类型转换异常
    产生原因：将A类型对象强制转换为B类型

instanceof 关键字 对象名 instanceof 数据类型
判断该对象在内存中是否为该数据类型，如果是返回true，如果不是 返回false
 */
public class PolyDemo02 {
}
