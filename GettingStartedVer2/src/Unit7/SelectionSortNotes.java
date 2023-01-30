package Unit7;

import java.sql.Array;
import java.util.ArrayList;

public class SelectionSortNotes {
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

        // Selection sort
        // Outer for loop
        // goes until 2nd to last value, controls the index where the smallest value swaps into
        for(int i = 0; i < myNums.size() - 1; i++) {
            int minIndex = i;
            for(int j = i + 1; j < myNums.size(); j++) {
                if(myNums.get(j) < myNums.get(minIndex)) {
                    minIndex = j;
                }
            }
            int temp = myNums.get(minIndex);
            myNums.set(minIndex, myNums.get(i));
            myNums.set(i, temp);
        }
        System.out.println(myNums);

    }

}
