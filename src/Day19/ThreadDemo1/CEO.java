package Day19.ThreadDemo1;

public class CEO {
    private static final CEO ceo=new CEO();
    private CEO() {}

    public static CEO getCeo() {
        return ceo;
    }
}
