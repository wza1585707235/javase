package Day10.exer;
/*
继承的特点1：
    父类中的成员无论共有还是私有的，都会被子类继承
    子类虽然会继承私有的成员，但子类不能直接访问继承的私有成员，可以通过继承的公有方法进行访问
 */
public class Demo1 {
    public static void main(String[] args) {
        cat cat=new cat();
        cat.age=10;
//        cat.run();
    }
}
class Animal{
    private String name;
    public int age;
    public void eat(){
        System.out.println("吃");
    }
    private void run(){
        System.out.println("跑");
    }

}
class cat extends Animal{
    public void sleep(){
        System.out.println("睡");
    }
}
