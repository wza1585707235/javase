package Day14.system;
/*
类的特点：将一些通用的属性和行为封装到一起的系统工具类
类的构造器：被私有化，无法创建对象
类的方法和变量：in 标准输入流  out：标准输出流   err：标准错误输出流

public static void gc()手动调用运行垃圾回收器
public static long currentTimeMills()返回一毫秒为单位的当前时间
public static long nanoTime() 返回最准确的系统计时器的当前值，以纳秒为单位
 */
public class Demo1 {
    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {

        }
        long end =System.currentTimeMillis();
        System.out.println(end-start);
    }
}
