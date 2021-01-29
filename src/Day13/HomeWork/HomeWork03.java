package Day13.HomeWork;

import java.util.Scanner;

public class HomeWork03 {
    public static void main(String[] args) {
        System.out.print("请输入源字符串：");
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        System.out.print("请输入要删除的字符串：");
        String del_str=scanner.next();
        String new_str=str.replace(del_str,"");
        System.out.println("源字符串中包含"+(str.length()-new_str.length())/del_str.length()+"个"+del_str);
        System.out.println("删除后的字符串为"+new_str);
    }
}
