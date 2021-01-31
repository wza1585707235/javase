package Day14.exception;

import java.util.Scanner;

/*
finally代码块
    含义：无论执不执行catch中的语句，finally中的语句时必须执行的
    格式：try{

    }catch(异常类型 对象名){

    }finally{

    }

    注意事项：如果异常捕获所在的方法需要返回值的话，尽量避免在try catch finally中写return
 */
public class ExceptionDemo7 {
    public static void main(String[] args) {
        //method01();
        int number=method02();
        System.out.println(number);
    }
    public  static void method01(){
        Scanner scanner=null;
        try{
            scanner=new Scanner(System.in);
            System.out.println("请输入一个整数");
            int num=scanner.nextInt();
        }catch (Exception e){
            System.out.println("解决方案");
        }finally {
            scanner.close();
            System.out.println("关闭资源");
        }
    }
    public static int method02(){
        try{
            return 10;//准备执行将10返回给主方法的动作，突然发现finally代码块，将return10这一步先放放，执行完finally代码块中的代码再执行return10
        }catch (Exception e){
            return 20;
        }finally {
            return 30;
        }
    }
}
