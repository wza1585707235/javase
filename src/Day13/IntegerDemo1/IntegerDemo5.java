package Day13.IntegerDemo1;
/*
包装类的面试题3：
    常量池中的划分：
        字符串常量池：""直接赋值
        整数常量池:-128~127
        没有浮点常量池
        有字符常量池0~127
        有布尔常量池
 */
public class IntegerDemo5 {
    public static void main(String[] args) {
        Double num01=0.0;
        Double num02=0.0;
        System.out.println(num02 == num01);//false
        Boolean b1=true;
        Boolean b2=true;
        System.out.println(b1 == b2);//true
        Character c1='a';
        Character c2='a';
        System.out.println(c1 == c2);//true
    }
}
