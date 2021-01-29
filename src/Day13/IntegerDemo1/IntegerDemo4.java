package Day13.IntegerDemo1;
/*
包装类面试题2：

 */
public class IntegerDemo4 {
    public static final Integer num01=200;
    public static final Integer num02=200;
    public static final Integer num03=100;
    public static final Integer num04=100;
    public static final Integer num05;
    public static final Integer num06;
    public static final Integer num07;
    public static final Integer num08;
    static {
        num05=200;
        num06=200;
        num07=100;
        num08=100;
    }

    public static void main(String[] args) {
        System.out.println(num01 == num02);//比较的是内存地址值
        System.out.println(num05 == num06);
        System.out.println(num01 == num05);


        System.out.println(num01 == (num03 + num04));//比较的是数值  num03和num04先进行自动拆箱，integer和int比较，又将num01自动拆箱 int和 int比较
        System.out.println(num05 == (num07 + num08));
    }
}
