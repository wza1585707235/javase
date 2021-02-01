package Day15.exercise;
/*
    String一旦创建 值不可变，变化后为新的对象
    Integer也是final static的常量
    引用数据类型作为形参传递的是地址值，方法内会对该地址值下的内容改变
    一旦修改了形参的地址值，就和实参无关了，让形参指向了新的对象
    常量池只适用于直接赋值(String Integer)

    接口中的属性必须为常量
 */
public class exerciese {
    static int i;

    public static void main(String[] args) {

        System.out.println(i);
    }
    public final void method(){};
}
