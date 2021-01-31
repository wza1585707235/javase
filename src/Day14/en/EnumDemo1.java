package Day14.en;
/*
枚举类：
    简化创建固定数量对象的方式

枚举是JDK5.0的新特性
枚举是类的一种特殊定义格式
 在jdk1.4版本及以前创建固定对象步骤：
    1.构造器私有
    2.在固定对象所对应的类中创建固定对象,并用static final进行修饰
    3.私有化成员变量，对外提供公共的获取对象的方法

格式：
    修饰符 enum 类名{
        对象名1（参数），对象名2（参数）.。。。。对象名n（参数）
    }
 */
public class EnumDemo1 {
    public static void main(String[] args) {
        System.out.println(Sex.boy);
        Sex boy1=Sex.boy;
        Sex boy2=Sex.boy;
        System.out.println(boy1 == boy2);
    }
}
