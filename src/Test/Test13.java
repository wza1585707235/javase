package Test;

import Day11.pre.A;

import java.util.ArrayList;

public class Test13 {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("3");
        arrayList.add("5");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
            arrayList.remove("3");
        }
    }
}
