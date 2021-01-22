package Day10.Homework2;

public class Manager extends Worker{
    private int award;

    public int getAward() {
        return award;
    }

    public void setAward(int award) {
        this.award = award;
    }
    @Override
    public void work(){
        System.out.println("manager work");
    }
}
