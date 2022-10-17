package Unit4;

public class DebuggerPractice {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("sum is:" + sum);
        System.out.println(revString("blue"));
    }
    public static String revString(String str) {
        String retStr = "";
        for(int i =  str.length() - 1; i >= 0; i--) {
            retStr += str.charAt(i);

        }
        return retStr;
    }
}
