package Day16.HashSetDemo;

public class Student2 {
    private String name;
    private int age;
    private int id;
    private static int number=210108001;

    public Student2() {
    }

    public Student2(String name, int age) {
        this.name = name;
        this.age = age;
        this.id=number++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
