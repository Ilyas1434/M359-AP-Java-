package Unit4;

public class String_Algorithms {
    public String everyOther(String str) {
        String ret = "";
        for(int i = 0; i < str.length(); i+=2) {
            ret += str.charAt(i);
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(everyOther("cookie"));
    }
}
