package Unit7;

import java.util.ArrayList;

public class InsertionSortNotes {
    public static void main(String[] args) {
        ArrayList<Integer> myNums= new ArrayList<Integer>();
        myNums.add(3);
        myNums.add(1);
        myNums.add(0);
        myNums.add(8);
        myNums.add(4);
        myNums.add(1);
        myNums.add(7);
        System.out.println(myNums);
        for(int i = 1; i < myNums.size(); i++) {
            Integer valueToInsert = myNums.get(i);
            int position = i;
            while(position > 0 && myNums.get(position -1 ) > valueToInsert) {
                // shift the value to the right
                myNums.set(position, myNums.get(position - 1));
                position--; // move to the next value to check
            }
            myNums.set(position, valueToInsert);
        }
        System.out.println(myNums);
    }
}
