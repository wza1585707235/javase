package Day13.IntegerDemo1;
/*
在常量池中，除了有字符串常量池，还有一块区域：整数常量池
在整数常量池中，一共只有256个数据 -128~127
 */
public class IntegerDemo3 {
    public static void main(String[] args) {
        int num01=100;
        int num02=100;
        System.out.println(num01 == num02);

        Integer num03=new Integer(100);
        Integer num04=new Integer(100);
        System.out.println(num03 == num04);

        Integer num05=300;//先在常量池中找有没有300的值，没有，超出范围了，在堆里面new
        Integer num06=300;

        System.out.println(num05 == num06);//5和6在堆

        Integer num07=100;//常量池中有100
        Integer num08=100;
        System.out.println(num07 == num08);//比较的是地址值 7和8在常量池

        System.out.println("=================================================================================");

        int num09=200;
        Integer num10=200;
        //自动装箱还是自动封箱  一切从简  一切按照int进行比较
        System.out.println(num09 == num10);
        System.out.println(num10 == num09);
    }
}
