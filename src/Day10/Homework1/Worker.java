package Day10.Homework1;

public class Worker extends Person{
    private String unit;
    private int work_age;

    @Override
    public void work() {
        System.out.println("工人的工作是盖房子");
    }
}
