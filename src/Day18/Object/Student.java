package Day18.Object;

import java.io.Serializable;

public class Student implements Serializable {
    private  String nane;

    public Student() {
    }

    public Student(String nane, int age) {
        this.nane = nane;
        this.age = age;
    }

    private int age;

    public String getNane() {
        return nane;
    }

    public void setNane(String nane) {
        this.nane = nane;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nane='" + nane + '\'' +
                ", age=" + age +
                '}';
    }
}
