package Day14.exception;

import java.io.IOException;

/*
异常的分类：
    编译时异常
        位置：java.lang.Exception(除了子类RuntimeException都是编译时异常)
        特点：代码语法格式没有错误，编译报错
        处理：必须手动处理：自己处理，找其他人处理
    运行时异常
        位置：java.lang.RuntimeException
        特点：代码语法格式没有错误，运行时不符合逻辑，从而报错
        处理：既可以手动处理也可以不处理，即使自己不处理，最后是JVM自动帮助进行处理
              JVM处理异常的方式：
                    1.获取异常信息，并且将该异常的详细信息进行打印
                    2.终止JVM的运行

异常的处理：
    throw，throws，try，catch，finally
分类：
    异常声明(自己搞不定，找别人处理)
    异常捕获(自己处理)

抛出异常(模拟出一个编译时的异常)
格式：throw new 异常名()
异常的声明：本方法搞不定，交给调用者方法帮忙搞定
格式： 修饰符 返回值类型 方法名 throws 异常名1，异常名2，....异常名n{
    }
 */
public class ExceptionDemo3 {
    public static void main(String[] args) throws IOException{
        method(1);
    }
    public static void method(int a) throws IOException{
        if (a==1){
            throw new IOException("自定义IO异常");
        }
    }
}
