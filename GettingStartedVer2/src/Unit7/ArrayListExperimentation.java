package Unit7;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class ArrayListExperimentation {
    public static void main(String[] args) {
        ArrayList<String> stuff = new ArrayList<>();
        stuff.add("yes");
        stuff.add("no");
        stuff.add("maybe");
        ArrayList<String> newStuff = (ArrayList<String>) stuff.clone();
        newStuff.remove(2);
        System.out.println(stuff);
        System.out.println(newStuff);
    }


}
