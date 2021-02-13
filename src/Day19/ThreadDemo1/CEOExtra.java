package Day19.ThreadDemo1;

public class CEOExtra {
    private static  CEOExtra ceoExtra;
    private CEOExtra(){}

    public static   CEOExtra getCeoExtra() {
//        if (ceoExtra==null){
//            synchronized (CEOExtra.class){
//                if (ceoExtra==null){
//                    ceoExtra=new CEOExtra();
//                }
//            }
//        }
        if (ceoExtra==null){
            ceoExtra=method();
        }
        return ceoExtra;
    }
    private static synchronized CEOExtra method(){
        return new CEOExtra();
    }
}
