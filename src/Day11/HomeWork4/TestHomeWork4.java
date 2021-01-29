package Day11.HomeWork4;

import Day11.HomeWork1.A;

public class TestHomeWork4 {
    public static void main(String[] args) {
        Worker worker1=new Worker();
        Worker worker2=new Worker();
        Apple apple1=new Apple(5,"青色");
        Apple apple2=new Apple(3,"红色");

        worker1.pickApple(new CompareBig(),apple1,apple2);
        worker2.pickApple(new CompareColor(),apple1,apple2);
    }
}
