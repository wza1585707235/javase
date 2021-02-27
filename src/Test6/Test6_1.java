package Test6;

public class Test6_1 {
    public static void main(String[] args) {
        System.out.println(replace("aabbccbbb", "bb", "dd"));
    }
    public static String replace(String text, String target, String replace){
        String temp_text="";
        int index=0;
        while (index<text.length()){
            if (text.substring(index).startsWith(target)){
                temp_text+=replace;
                index+=target.length();
            }else {
                temp_text+=String.valueOf(text.charAt(index));
                index++;
            }
        }
        return temp_text;
    }
}
