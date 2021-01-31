package Day14.en;

public class Gender {
    private static final Gender boy=new Gender();
    private static final Gender girl=new Gender();
    public static Gender getBoy() {
        return boy;
    }

    public static Gender getGirl() {
        return girl;
    }


}
